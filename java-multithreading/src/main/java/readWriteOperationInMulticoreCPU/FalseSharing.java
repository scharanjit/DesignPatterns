package readWriteOperationInMulticoreCPU;

public class FalseSharing {

  public final static long ITERATIONS = 50_000_000L;
  public static int NUM_THREAD_MAX = 4; //multi threaded environment
  private static VolatileLongPadded[] volatileLongPaddeds;

  private static VolatileLongUnpadded[] volatileLongUnpaddeds;

  static {
    volatileLongPaddeds = new VolatileLongPadded[NUM_THREAD_MAX];
    for (int i = 0; i < volatileLongPaddeds.length; i++) {
      volatileLongPaddeds[i] = new VolatileLongPadded();
    }

    volatileLongUnpaddeds = new VolatileLongUnpadded[NUM_THREAD_MAX];

    for (int i = 0; i < volatileLongUnpaddeds.length; i++) {
      volatileLongUnpaddeds[i] = new VolatileLongUnpadded();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    runBenchMark();

    //performance degrades as the number of threads increase
    //performance of padded is better than unpadded
  }

  private static void runBenchMark() throws InterruptedException {

    long begin, end;

    for (int n = 1; n <= NUM_THREAD_MAX; n++) {

      Thread[] threads = new Thread[n];

      for (int j = 0; j < threads.length; j++) {
        threads[j] = new Thread(createPaddedRunnable(j));
      }

      begin = System.currentTimeMillis();

      for (Thread t : threads) {
        t.start();
      }
      for (Thread t : threads) {
        t.join();
      }
      end = System.currentTimeMillis();

      System.out.printf("Padded threads %d - T= %dms\n\n", n, end - begin);

      for (int j = 0; j < threads.length; j++) {
        threads[j] = new Thread(createUnPaddedRunnable(j));
      }

      begin = System.currentTimeMillis();

      for (Thread t : threads) {
        t.start();
      }
      for (Thread t : threads) {
        t.join();
      }
      end = System.currentTimeMillis();

      System.out.printf("Unpadded threads %d - T= %dms\n\n", n, end - begin);

    }
  }

  private static Runnable createPaddedRunnable(final int k) {

    return () -> {

      long i = ITERATIONS + 1;

      while (0 != --i) {  //50 lakh plus 1,2,3 iterations
        System.out.println("hello");
        volatileLongPaddeds[k].value = i;
      }
    };
  }

  private static Runnable createUnPaddedRunnable(final int k) {

    return () -> {

      long i = ITERATIONS + 1;

      while (0 != --i) {
        volatileLongUnpaddeds[k].value = i;
      }
    };
  }

  public final static class VolatileLongPadded {

    // count of variables are larger than unpadded
    // memory in cache line will be distributed
    public long q1, q2, q3, q4, q5, q6;
    public volatile long value;
    public long q11, q12, q13, q14, q15, q16;

  }

  public final static class VolatileLongUnpadded {

    public volatile long value = 0L;
  }


}
