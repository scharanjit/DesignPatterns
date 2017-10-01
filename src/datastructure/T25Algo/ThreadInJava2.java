package datastructure.T25Algo;

public class ThreadInJava2 implements Runnable {

    private static boolean bool=true;
    @Override
    public void run(){
        while(bool){
            System.out.println("Ghantaa !!");
        }
    }

    public void stopF(){
        bool=false;
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadInJava2 th= new ThreadInJava2();
        Thread t = new Thread(th);
        t.start();
        Thread.sleep(1000);
        th.stopF();

    }
}
