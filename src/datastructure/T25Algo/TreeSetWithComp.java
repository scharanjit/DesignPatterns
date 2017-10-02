package datastructure.T25Algo;
/**
 * To implement your own sorting functionality with TreeSet, you have to pass
 * Comparator object along with TreeSet constructor call.
 * The Comparator implementation holds the sorting logic.
 * You have to override compare() method to provide the sorting logic.
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComp {

    public static void main(String a[]) {

        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        System.out.println(ts);
    }
}

class MyComp implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }

}