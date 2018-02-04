package practise.makes.a.man.perfect.javaBasics.set6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class I{

    public static void main (String[] args) {
        Object i = new ArrayList().iterator();
        System.out.print((i instanceof List) + ", ");
        System.out.print((i instanceof Iterator) + ", ");
        System.out.print(i instanceof ListIterator);
    }
}

/**
 The iterator() method returns an iterator over the
 elements in the list in proper sequence, it does n’t return
 a List or a ListIterator object. A ListIterator can be obtained by
 invoking the listIterator method.
 */