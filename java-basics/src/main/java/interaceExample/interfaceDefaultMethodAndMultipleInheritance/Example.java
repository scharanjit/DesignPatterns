package interaceExample.interfaceDefaultMethodAndMultipleInheritance;

public class Example implements MyInterface, MyInterface2{

  @Override
  public void newMethod() {

    MyInterface.super.newMethod();

  }

  /**
   * If we don't add this method, it will throw exception
   * This is because we have the same method in both the
   * interface and the compiler is not sure which method to be invoked.
   *
   * @param str
   */

  // implementing abstract methods
  public void existingMethod(String str){
    System.out.println("String is: "+str);
  }
  public void disp(String str){
    System.out.println("String is: "+str);
  }

  public static void main(String[] args) {
    Example obj = new Example();

    //calling the default method of interface
    obj.newMethod();

//    obj.newMethod();
  }
}
