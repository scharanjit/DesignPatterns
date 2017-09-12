package datastructure.SetExample.LinkedHashSet;

import java.util.LinkedHashSet;

import static java.sql.JDBCType.NULL;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        // create a hash set
        LinkedHashSet hs = new LinkedHashSet();

        // add elements to the hash set
        hs.add("B");
        hs.add(null);
        hs.add(null);
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        System.out.println(hs);
    }
}
