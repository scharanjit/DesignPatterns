package datastructure.Multithreading;

public class ThreadInJava extends Thread {

    private static volatileExample boolean bool = true;

    public void run() {
        while (bool) {
            System.out.println("Ghantaa !!");
        }
    }

    public void stopF() {
        bool = false;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadInJava t = new ThreadInJava();
        t.start();
        Thread.sleep(1000);
        t.stopF();

    }
}
