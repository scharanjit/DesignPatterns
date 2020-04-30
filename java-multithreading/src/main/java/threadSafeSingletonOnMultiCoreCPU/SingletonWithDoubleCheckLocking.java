package threadSafeSingletonOnMultiCoreCPU;

public class SingletonWithDoubleCheckLocking {

  private static SingletonWithDoubleCheckLocking singletonWithDoubleCheckLocking;

  public Object key = new Object();


  private SingletonWithDoubleCheckLocking(){}

  public SingletonWithDoubleCheckLocking getInstance(){

    if(singletonWithDoubleCheckLocking != null) {

      return singletonWithDoubleCheckLocking;  // non synchronized read
    }

    synchronized (key) {

      if(singletonWithDoubleCheckLocking == null) {
        singletonWithDoubleCheckLocking = new SingletonWithDoubleCheckLocking(); //synchronized write
      }
        return singletonWithDoubleCheckLocking;

    }

  }


}
