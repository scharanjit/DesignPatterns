package prac01182019;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {

    public static void main(String[] args) {
        List l = new ArrayList<>();
        l=null;
//        l.add("1");
//        l.add("1");
//
//        l.add("2");

        Set s = new HashSet(l);

        l.clear();
        l.addAll(s);

        System.out.println(l.size());

    }
}
