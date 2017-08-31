package design.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {
//        Singleton instance = new Singleton();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        Singleton singleton5 = Singleton.getInstance();

        System.out.println(singleton.equals(singleton1));
        System.out.println(singleton.equals(singleton2));
        System.out.println(singleton.equals(singleton3));
        System.out.println(singleton.equals(singleton4));
        System.out.println(singleton.equals(singleton5));

        //same object always returned
    }
}
