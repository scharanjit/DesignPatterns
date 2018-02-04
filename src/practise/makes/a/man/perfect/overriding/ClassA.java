package practise.makes.a.man.perfect.overriding;

public class ClassA implements InterfaceA,InterfaceB {
//    @Override
//    public String methodA() {
//        return null;
//    }

    @Override
   public int methodA(){
        return 0;
    }

//    @Override
//   public String methodA(){
//        return "0";
//    }


}


/**
 * You can inherit methods that are @Override-equivalent,
 * subject to the usual requirements of method overriding and hiding.
 * Since they ARE @Override-equivalent, effectively there is only
 * one method to implement, and thus there's nothing to distinguish/select from.

 The compiler does not have to identify which method is
 for which interface, because once they are determined to be @Override-equivalent,
 they're the same method.

 Resolving potential incompatibilities may be a tricky task,
 but that's another issue altogether.
 */

// /https://stackoverflow.com/questions/2801878/implementing-two-interfaces-in-a-class-with-same-method-which-interface-method
