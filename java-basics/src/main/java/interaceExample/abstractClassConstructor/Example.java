package interaceExample.abstractClassConstructor;

public class Example extends AbstractConstructor {

  public static void main(String[] args) {
    Example e = new Example();
    e.method();
  }

  @Override
  void method() {
    System.out.println("Overridden methos");
  }
}
