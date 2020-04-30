package runnable;

public class FirstRunnable {

  public static void main(String[] args) {
    Runnable runnable = () -> {

      System.out.println("I'm running in " + Thread.currentThread().getName());
    };

    Thread t = new Thread(runnable);
    t.setName("My thread !!");
    t.start(); // my thread

    t.run(); //main thread NO NO NO Never shud call

  }

}
