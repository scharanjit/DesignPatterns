package practise.makes.a.man.perfect.javaBasics.set5;

// Main.java
public class Main {
    public static void gfg(String s) {
        System.out.println("String");
    }

    public static void gfg(Object o) {
        System.out.println("Object");
    }

    public static void main(String args[]) {
        gfg(null);
    }
}

/**
 * In case of method overloading, the most specific method is
 * chosen at compile time. As ‘java.lang.String’ is a more specific
 * type than ‘java.lang.Object’. In this case the method which takes
 * ‘String’ as a parameter is choosen.
 */
