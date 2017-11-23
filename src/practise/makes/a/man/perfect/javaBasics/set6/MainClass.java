package practise.makes.a.man.perfect.javaBasics.set6;

class First {
    public First() {
        System.out.println("a");
    }
}

class Second extends First {
    public Second() {
        System.out.println("b");
    }
}

class Third extends Second {
    public Third() {
        System.out.println("c");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Third c = new Third();
    }
}
