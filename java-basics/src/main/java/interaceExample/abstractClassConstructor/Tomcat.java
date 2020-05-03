package interaceExample.abstractClassConstructor;

public class Tomcat extends ServerAbstract {

  public Tomcat(String name) {
    super(name);
  }

  public static void main(String[] args) {
    Tomcat tomcat = new Tomcat("Tomcat Started ");
    tomcat.method();
  }

  @Override
  public void method() {

    System.out.println("Starting Server ..." + this.name);
  }
}
