package beginner.one.singletonpattern;

/**
 * Example of singleton class
 */
public class RuntimeEnv {

  public static void main(String[] args) {
    Runtime runtimeEnv = Runtime.getRuntime();
    runtimeEnv.gc(); //garbage collector

    System.out.println(runtimeEnv);

    Runtime runtimeEnv1 = Runtime.getRuntime();

    System.out.println(runtimeEnv1);

    if(runtimeEnv == runtimeEnv1) {
      System.out.println("They are same instance");
    }

  }

}
