package datastructure.mapExample;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm =
                new LinkedHashMap<String, String>();
        lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "quiz.geeksforgeeks.org");

        // It prints the elements in same order as they were inserted
        System.out.println(lhm);

        System.out.println("Getting value for key 'one': " + lhm.get("one"));
        System.out.println("Size of the map: " + lhm.size());
        System.out.println("Is map empty? " + lhm.isEmpty());
        System.out.println("Contains key 'two'? " + lhm.containsKey("two"));
        System.out.println("Contains value 'practice.geeksforgeeks.org'? "
                + lhm.containsValue("practice.geeksforgeeks.org"));
        System.out.println("delete element 'one': " + lhm.remove("one"));
        System.out.println(lhm);
    }
}
