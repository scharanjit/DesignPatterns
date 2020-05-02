package interaceExample.abstractClassConstructor;

public abstract class ServerAbstract {

  public ServerAbstract(String name) {
    this.name = name;
  }

  protected final String name;


  public abstract void method();

}
