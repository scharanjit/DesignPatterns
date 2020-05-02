package interaceExample.abstractClassConstructor;

public class Example extends AbstractConstructor {

  @Override
  void method() {
    System.out.println("Overridden methos");
  }

  public static void main(String[] args) {
    Example e = new Example();
    e.method();
  }
}
