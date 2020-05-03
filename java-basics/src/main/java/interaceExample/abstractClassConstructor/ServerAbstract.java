package interaceExample.abstractClassConstructor;

public abstract class ServerAbstract {

  protected final String name;

  public ServerAbstract(String name) {
    this.name = name;
  }

  public abstract void method();

}
