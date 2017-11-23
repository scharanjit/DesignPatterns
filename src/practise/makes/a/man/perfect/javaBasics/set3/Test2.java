package practise.makes.a.man.perfect.javaBasics.set3;

class TestN {
    TestN(int x) {
        System.out.println("Constructor called " + x);
    }
}

// This class contains an instance of TestN 
class Test2 {
    TestN t1 = new TestN(10);

    Test2(int i) {
        t1 = new TestN(i);
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2(5);
    }
}
