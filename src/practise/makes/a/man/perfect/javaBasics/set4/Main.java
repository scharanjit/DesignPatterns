package practise.makes.a.man.perfect.javaBasics.set4;

class Base {
    protected void foo() {
    }
}

class Derived extends Base {
//    void foo() {}
}

public class Main {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.foo();
    }
}

/**
 * foo() is protected in Base and default in Derived.
 * Default access is more restrictive. When a derived class overrides
 * a base class function, more restrictive access can’t be given
 * to the overridden function. If we make foo() public, then the
 * program works fine without any error.
 */
