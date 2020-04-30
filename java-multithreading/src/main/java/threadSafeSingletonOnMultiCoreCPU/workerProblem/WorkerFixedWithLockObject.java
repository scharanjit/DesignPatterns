package threadSafeSingletonOnMultiCoreCPU.workerProblem;

import java.util.Timer;
import java.util.TimerTask;

public class WorkerFixedWithLockObject extends Thread {


  private Object lock = new Object();
  private volatile boolean quittingTime = false;



  public static void main(String[] args) throws InterruptedException {
    final WorkerFixedWithLockObject worker = new WorkerFixedWithLockObject();
    worker.start();

    Timer t = new Timer(true);

    t.schedule(new TimerTask() {
      @Override
      public void run() {
        worker.keepWorking();
      }
    }, 500);

    Thread.sleep(400);
    worker.quit();

  }

  public void run() {

    while (!quittingTime) {
      working();
      System.out.println("Still working ...");
    }

    System.out.println("Coffee is good");

  }

  private void working() {
    try {
      Thread.sleep(300);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  synchronized void quit() throws InterruptedException {
    synchronized (lock) {
      quittingTime = true;
      System.out.println("calling join");
      join();
      System.out.println("back from join ");
    }

  }

  synchronized void keepWorking() {
    synchronized (lock) {
      quittingTime = false;
      System.out.println("keep working ");
    }

  }
}
