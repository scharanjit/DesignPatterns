package runnableCallableFutureExecutor.javaExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PlayingWithExecutorsAndRunnables {

  public static void main(String[] args) {
    Runnable task = () -> System.out
        .println("I'm in current thread " + Thread.currentThread().getName());

    ExecutorService service = Executors.newSingleThreadExecutor();
    for (int i = 0; i < 10; i++) {
      service.execute(task);
    }
    service.shutdown();

    ExecutorService service1 = Executors.newFixedThreadPool(4);
    for (int i = 0; i < 10; i++) {
      service1.execute(task);
    }
    service1.shutdown();

    for (int i = 0; i < 10; i++) {
      new Thread(task).start(); //every time a new thread created (which is very costly)
    }

  }

}
