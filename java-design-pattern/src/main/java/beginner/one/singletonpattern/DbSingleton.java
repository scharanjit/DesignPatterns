package beginner.one.singletonpattern;

/**
 * Creation of singleton class
 * Not thread safe, neither lazly loaded
 */
public class DbSingleton {

  private static DbSingleton instance = new DbSingleton();

  private DbSingleton(){}


  public static DbSingleton getInstance() {
    return instance;
  }


}
