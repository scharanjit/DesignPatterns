package volatileExample;

public class VolatileDemo {

  //  volatile static int i = 1; //it
  static int i = 1;


  public static void main(String[] args) {

    Thread threadOne = new Thread() {
      public void run() {
        i++;
        System.out.println("ThreadOne is " + i);
      }
    };

    Thread threadTwo = new Thread() {
      public void run() {
        i++;
        System.out.println("ThreadTwo is " + i);
      }
    };

    Thread threadThree = new Thread() {
      public void run() {
        i++;
        System.out.println("ThreadThree is " + i);
      }
    };

    threadOne.start();
    threadTwo.start();
    threadThree.start();
  }

}
