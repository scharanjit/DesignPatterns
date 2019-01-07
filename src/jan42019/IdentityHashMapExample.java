package jan42019;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {

    public static void main(final String[] args) {
        final IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<String, String>();
        identityHashMap.put("a", "Java");
        identityHashMap.put(new String("a"), "J2EE");
        identityHashMap.put("b", "J2SE");
        identityHashMap.put(new String("b"), "Spring");
        identityHashMap.put("c", "Hibernate");
        for (final String str : identityHashMap.keySet()) {
            System.out.println("Key : " + str + " and Value : " + identityHashMap.get(str));
        }
        System.out.println("Size of map is : " + identityHashMap.size());
        System.out.println("Here 'a' and new String('a') are considered as separate keys");
    }
}

/**
 * Normal HashMap compares keys using the .equals method.
 * But Identity HashMap compares its keys using the == operator.
 * Hence, 'a' and new String('a') are considered as two different keys.
 * The initial size of IdentityHashMap is 32, while the initial size of a normal HashMap is 16.
 *
 */
