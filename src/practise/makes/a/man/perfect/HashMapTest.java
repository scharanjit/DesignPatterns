package practise.makes.a.man.perfect;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String args[]) {
        HashMap m = new HashMap();
        m.put(1, "bn");
        m.put(1, "bnh");
        m.put(2, "bnh*");
        System.out.println(m.get(1));
        System.out.println(m.get(2));
    }
}
