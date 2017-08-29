package practise.makes.a.man.perfect;

abstract class classA {

   abstract void methodA();
}

interface classC{
    void methodB();
}

public class classB extends classA implements classC {

    void methodA() {
        System.out.println("hey");
    }

    public void methodB() {
        System.out.println("hi");
    }


    public static void main(String[] args) {

        classA ref = new classB();
        ref.methodA();

        classC ref1 = new classB();
        ref1.methodB();


//         classB ref2 = new classA();
//         classB ref3 = new classC();
    }

}



