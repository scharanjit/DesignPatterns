package threadSafeSingletonOnMultiCoreCPU.perfomanceOptimisedSingleton;

public class DoubleCheckedLockingEnumVolatileSynchronisedSingleton {

  private volatile DoubleCheckedLockingEnumVolatileSynchronisedSingleton INSTANCE;

  private DoubleCheckedLockingEnumVolatileSynchronisedSingleton() {
  }

  public DoubleCheckedLockingEnumVolatileSynchronisedSingleton getInstance() {
    if (INSTANCE == null) {
      synchronized (DoubleCheckedLockingEnumVolatileSynchronisedSingleton.class) {
        //double checking Singleton instance
        if (INSTANCE == null) {
          INSTANCE = new DoubleCheckedLockingEnumVolatileSynchronisedSingleton();
        }
      }
    }
    return INSTANCE;
  }


}
