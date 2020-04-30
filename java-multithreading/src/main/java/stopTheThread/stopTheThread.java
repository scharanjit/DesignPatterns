package stopTheThread;

public class stopTheThread {


  public static void main(String[] args) {

    Runnable runnable = () -> {
      while (true) {
        if (Thread.currentThread().isInterrupted()) {
          //stop a thread
//          Thread.currentThread().stop();
        }
      }
    };

    Thread t = new Thread(runnable);

    t.start();
  }
}
