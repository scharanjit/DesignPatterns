package Java8;

import java.util.ArrayList;
import java.util.List;

public class PreventCollectionFrmWastingMemory {


    // *** Old code ***
   static private List<Foo> list = new ArrayList<>();
    static void addToListOld(Foo foo) { list.add(foo); }
    // *** New code ***
    // If list is empty, this is null. If list contains only one element,
    // this points directly to that element. Otherwise, it points to a
    // real ArrayList object.
    private static Object listOrSingleEl;
   static void addToListNew(Foo foo) {
        if (listOrSingleEl == null) { // Empty list
            listOrSingleEl = foo;
        } else if (listOrSingleEl instanceof Foo) { // Single-element
            Foo firstEl = (Foo) listOrSingleEl;
            ArrayList<Foo> list = new ArrayList<>();
            listOrSingleEl = list;
            list.add(firstEl);
            list.add(foo);
        } else { // Real, multiple-element list
            ((ArrayList<Foo>) listOrSingleEl).add(foo);
        }
    }

    public static void main(String[] args) {

        Foo foo = new Foo();


        addToListOld(foo);
        addToListNew(foo);
    }


    static class Foo{

    }
}
