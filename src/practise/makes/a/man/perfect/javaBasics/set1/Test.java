package practise.makes.a.man.perfect.javaBasics.set1;

public class Test {

    public static void main(String[] args) {
        error();
        noerror();
//        System.out.println(fun());   //static non static
        System.out.println(fun1());   //static non static

//        System.out.println(staticLocalVariable());
        System.out.println(staticLocalVariable1());
    }

//    private static int staticLocalVariable() {
//        static int x=0;
//        return ++x;
//    }

    private static int x = 0;

    private static int staticLocalVariable1() {
        return ++x;
    }

    int fun() {
        return 20;
    }

    static int fun1() {
        return 20;
    }

    private static void noerror() {
        for (int i = 0; true; i++) {
            System.out.println("Hello");
            break;
        }
    }

    private static void error() {
//        for(int i = 0; 1; i++) {
//            System.out.println("Hello");
//            break;
//        }
    }
}
