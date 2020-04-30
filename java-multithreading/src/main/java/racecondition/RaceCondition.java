package racecondition;

import racecondition.model.LongWrapper;
import racecondition.model.SynchronizedLongWrapper;

public class RaceCondition {

  public static void main(String[] args) throws InterruptedException {
    LongWrapper longWrapper = new LongWrapper(0L);

    Runnable runnable = () -> {
      for (int i = 0; i < 1000; i++) {
        longWrapper.incrementValue();
      }
    };

//    Thread t = new Thread(runnable);
//    t.start();
//    t.join(); //it makes sure that code we are going to write after this line
//    //will be executed only once t. start executions ends
//    System.out.println("Value "+longWrapper.getValue()); output 1000 which is expected

    Thread[] threads = new Thread[1_000]; //thousand threads
    for (int i = 0; i < 1000; i++) {
      threads[i] = new Thread(runnable);
      threads[i].start();
    }

    for (int i = 0; i < threads.length; i++) {
      threads[i].join();
    }

    System.out.println("Value " + longWrapper.getValue()); //result is not same

    System.out.println("+++++++++++++++++++++++++++++++++++");
    System.out.println("+++++++++++++++++++++++++++++++++++");
    System.out.println("+++++++++++++++++++++++++++++++++++");
    System.out.println("+++++++++++++++++++++++++++++++++++");
    SynchronizedLongWrapper synchronizedLongWrapper = new SynchronizedLongWrapper(0L);
    Runnable runnable1 = () -> {
      for (int i = 0; i < 1000; i++) {
        synchronizedLongWrapper.incrementValue();
      }
    };

    Thread[] threads1 = new Thread[1_000]; //thousand threads
    for (int i = 0; i < 1000; i++) {
      threads1[i] = new Thread(runnable1);
      threads1[i].start();
    }

    for (int i = 0; i < threads.length; i++) {
      threads1[i].join();
    }

    System.out.println("Value " + synchronizedLongWrapper.getValue()); //result is same and expected


  }


}
