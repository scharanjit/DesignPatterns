package datastructure.collectionIviews;

import java.util.HashMap;
import java.util.WeakHashMap;

/*
        Java.util.HashMap class is a Hashing based implementation.
        In HashMap, we have a key and a value pair.
Even though the object is specified as key in hashmap, it does not have
 any reference and it is not eligible for garbage collection if it is
 associated with HashMap i.e. HashMap dominates over Garbage Collector.



 WeakHashMap is an implementation of the Map interface.
  WeakHashMap is almost same as HashMap except in case of WeakHashMap,
  if object is specified as key doesn’t contain any references-
  it is eligible for garbage collection even though it is associated with WeakHashMap.
  i.e Garbage Collector dominates over WeakHashMap.

         */
public class HashMapVsWeakHashmap {

    public static void main(String[] args) throws InterruptedException {
        HashMap m = new HashMap();
        Demo d = new Demo();

        // puts an entry into HashMap
        m.put(d, " Hi ");

        System.out.println(m);
        d = null;

        // garbage collector is called
        System.gc();

        //thread sleeps for 4 sec
        Thread.sleep(4000);

        System.out.println(m);


        WeakHashMap m1 = new WeakHashMap();
        Demo d1 = new Demo();
        System.out.println("Weak Hashmap Started ==>");
        // puts an entry into WeakHashMap
        m1.put(d1, " Hi ");
        System.out.println(m1);

        d1 = null;

        // garbage collector is called
        System.gc();

        // thread sleeps for 4 sec
        Thread.sleep(4000);

        System.out.println(m1);


    }

}

class Demo {
    public String toString() {
        return "demo";
    }

    // finalize method
    @Override
    public void finalize() {
        System.out.println("Finalize method is called");
    }
}