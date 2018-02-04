package datastructure.Multithreading;

public class CreatingThread extends Thread{

    @Override
    public void run(){
        System.out.println("Oneway");
    }

    public static void main(String[] args) {
        Thread myThread = new CreatingThread();

        myThread.start();
    }
}
