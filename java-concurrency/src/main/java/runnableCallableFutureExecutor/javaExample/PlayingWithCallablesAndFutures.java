package runnableCallableFutureExecutor.javaExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

public class PlayingWithCallablesAndFutures {

  public static void main(String[] args)
      throws ExecutionException, InterruptedException, TimeoutException {

    Callable<String> task = () -> {

      Thread.sleep(300);
      return "I'm in current thread " + Thread.currentThread().getName();

    };

    ExecutorService service = Executors.newFixedThreadPool(4);

    try {
      for (int i = 0; i < 10; i++) {
        Future<String> future = service.submit(task);
        System.out.println("I get : " + future.get());
//        System.out.println("I get : " +future.get(100, TimeUnit.MILLISECONDS)); //set timeout
        //exception will be thrown
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {

      service.shutdown();
    }


  }

}
