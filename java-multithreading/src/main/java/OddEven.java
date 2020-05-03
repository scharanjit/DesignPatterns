package practice;

class Display {

  boolean isEven = false;

  synchronized public void printEven(int number) throws InterruptedException {
    while (isEven) {
      wait();
    }
    System.out.println("Even : " + number);
    isEven = true;
    notify();
  }

  synchronized public void printOdd(int number) throws InterruptedException {
    while (!isEven) {
      wait();
    }
    System.out.println("Odd : " + number);
    isEven = false;
    notify();
  }
}

public class OddEven {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    final Display disp = new Display();

    new Thread() {
      public void run() {
        int num = 0;
        for (int i = num; i <= 10; i += 2) {
          try {
            disp.printEven(i);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }
    }.start();

    new Thread() {
      public void run() {
        int num = 1;
        for (int i = num; i <= 10; i += 2) {
          try {
            disp.printOdd(i);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }
    }.start();
  }

}
