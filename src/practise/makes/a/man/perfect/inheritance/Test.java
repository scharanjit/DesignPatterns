package practise.makes.a.man.perfect.inheritance;

public class Test {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.method();
        Child c = new Child();
        c.method();

        Parent p1 = new Child();
        p1.method();

//        Child c1 = new Parent();
        Child c2 = (Child)new Parent();

    }
}
