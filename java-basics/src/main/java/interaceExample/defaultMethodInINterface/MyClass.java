package interaceExample.defaultMethodInINterface;

public class MyClass implements Interface1 {


  public static void main(String[] args) {
    MyClass myClass = new MyClass();
    myClass.log("helo");
  }

  @Override
  public void method1(String str) {
  }
}
