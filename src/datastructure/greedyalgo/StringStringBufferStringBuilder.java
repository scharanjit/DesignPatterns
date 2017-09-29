package datastructure.greedyalgo;

public class StringStringBufferStringBuilder {

    public static void concat1(String s1) {
        s1 = s1 + "forgeeks";
    }

    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2) {
        s2.append("forgeeks");
    }

    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3) {
        s3.append("forgeeks");
    }

    public static void main(String[] args) {
        String s1 = "Geeks";
        concat1(s1);  // s1 is not changed
        System.out.println("String: " + s1);

        StringBuilder s2 = new StringBuilder("Geeks");
        concat2(s2); // s2 is changed
        System.out.println("StringBuilder: " + s2);

        StringBuffer s3 = new StringBuffer("Geeks");
        concat3(s3); // s3 is changed
        System.out.println("StringBuffer: " + s3);
    }
}

/*
String :- Immutable
StringBuilder :- mutable
StringBuffer :- mutable + thread safe

When to use which one :

If a string is going to remain constant throughout the program,
then use String class object because a String object is immutable.

If a string can change (example: lots of logic and operations in the
construction of the string) and will only be accessed from a single thread,
using a StringBuilder is good enough.

If a string can change, and will be accessed from multiple threads,
use a StringBuffer because StringBuffer is synchronous so you have
thread-safety.

 */
