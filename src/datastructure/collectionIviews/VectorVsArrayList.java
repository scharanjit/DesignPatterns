package datastructure.collectionIviews;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorVsArrayList {

    public static void main(String[] args) {
        // creating an ArrayList
        ArrayList<String> al = new ArrayList<String>();

        // adding object to arraylist
        al.add("Practice.GeeksforGeeks.org");
        al.add("quiz.GeeksforGeeks.org");
        al.add("code.GeeksforGeeks.org");
        al.add("contribute.GeeksforGeeks.org");

        // traversing elements using Iterator'
        System.out.println("ArrayList elements are:");
        Iterator it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        // creating Vector
        Vector<String> v = new Vector<String>();
        v.addElement("Practice");
        v.addElement("quiz");
        v.addElement("code");

        // traversing elements using Enumeration
        System.out.println("\nVector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}

/*
ArrayList and Vectors both implements List interface and both use array(dynamically resizeable) as
 data structure internally very much like using an ordinary array.
Differnce
   1.) Vector is synchronized that means at a time only one thread can access
 the code while arrayList is not synchronized that means multiple threads can
 work on arrayList at same time.


2.) ArrayList is faster as it is non-synchronized while vector operations give slow performance as
 they are synchronized(thread-safe).


3.)  Data Growth: ArrayList and Vector both grow and shrink dynamically to maintain optimal use
 of storage. But the way they resized is different. ArrayList increments 50%
 of current array size if number of elements exceeds its capacity while vector
  increments 100% means doubles the current array size.

4.)

 */
