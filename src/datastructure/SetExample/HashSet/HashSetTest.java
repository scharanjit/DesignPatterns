package datastructure.SetExample.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set s = new HashSet();

        s.add("hi");
        s.add("hi-1");
        s.add("hi-1");
        s.add("hi-2");
        s.add("hi-2");
        s.add("bye-2");
        s.add("by-2");

        System.out.println(s);  //so no duplicates and no order too


    }
}
