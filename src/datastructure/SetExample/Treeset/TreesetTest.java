package datastructure.SetExample.Treeset;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreesetTest {

    public static void main(String[] args) {
        TreeSet ts1= new TreeSet();
        ts1.add("Z");
        ts1.add("B");
        ts1.add("C");
        ts1.add("A");
//        ts1.add(null);    // Throws NullPointerException

        // Duplicates will not get insert
        ts1.add("C");

        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);

//        ts1.add(2); //class cast exception

        TreeSet ts = new TreeSet();
        Set syncSet = Collections.synchronizedSet(ts);
        syncSet.add("A");
        syncSet.add("B");
        syncSet.add("C");
        syncSet.add("D");
        syncSet.add("E");
        syncSet.add("A");
        syncSet.add("A");

        System.out.println(syncSet);

    }
}
