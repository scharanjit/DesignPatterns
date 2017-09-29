package datastructure.mapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> hm =
                new HashMap<>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));


        System.out.println(hm);

        // Returns Set view
        Set<Map.Entry<String, Integer>> st = hm.entrySet();

        for (Map.Entry<String, Integer> me : st) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
