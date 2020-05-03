package interaceExample.staticMethodInInterface;

public class Example implements MyInterface {

  public static void main(String[] args) {
    Example obj = new Example();

    //calling the default method of interface
    obj.newMethod();

    //calling the static method of interface
    MyInterface.anotherNewMethod();

    //calling the abstract method of interface
    obj.existingMethod("Java 8 is easy to learn");


  }

  // implementing abstract method
  public void existingMethod(String str) {
    System.out.println("String is: " + str);
  }
}
