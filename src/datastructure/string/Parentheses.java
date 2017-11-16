package datastructure.string;

import java.util.ArrayList;
import java.util.List;


public class Parentheses {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(prent(4));
    }

    public static List<String> prent(int n) {
        List<String> l = new ArrayList<String>();
        if (n == 1) {
            l.add("()");
            return l;
        }
        for (String st : prent(n - 1)) {
            l.add(st + "()");
            l.add("(" + st + ")");
            if (!(st + "()").equals("()" + st)) {
                l.add("()" + st);
            }
        }
        return l;
    }

}