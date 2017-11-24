package practise.makes.a.man.perfect.javaBasics.set8;

class Person {
    private void who() {
        System.out.println("Inside private method Person(who)");
    }

    public static void whoAmI() {
        System.out.println("Inside static method, Person(whoAmI)");
    }

    public void whoAreYou() {
        who();
        System.out.println("Inside virtual method, Person(whoAreYou)");
    }
}

class Kid extends Person {
    private void who() {
        System.out.println("Kid(who)");
    }

    public static void whoAmI() {
        System.out.println("Kid(whoAmI)");
    }

    public void whoAreYou() {
        who();
        System.out.println("Kid(whoAreYou)");
    }
}

public class Gfg1 {
    public static void main(String args[]) {
        Person p = new Kid();
        p.whoAmI();
        p.whoAreYou();
    }
}
