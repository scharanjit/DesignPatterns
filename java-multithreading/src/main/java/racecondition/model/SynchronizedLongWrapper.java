package racecondition.model;

public class SynchronizedLongWrapper {


  private Object key = new Object();
  private long l;

  public SynchronizedLongWrapper(long l) {
    this.l = l;
  }

  public long getValue() {
    return l;
  }

  public void incrementValue() {
    synchronized (key) {
      l = l + 1;  //read and write are happened here
    }
  }

}
