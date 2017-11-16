package datastructure.memorymanagement;

public class InstanceNvrGarbageCollected {
}

/*
How to ensure that instance is never garbage collected?
We can use singleton pattern. There’s a static reference to a
singleton, so it won’t be eligible for garbage collection until the
 classloader is eligible for garbage collection.


 Hold a reference. If your object is getting collected prematurely,
 it is a symptom that you have a bug in the design of your application.

The garbage collector collects only objects to which there is no
reference in your application. If there is no object that would naturally
reference the collected object, ask yourself why it should be kept alive.

One usecase in which you typically have no references, but want to keep
an object is a singleton. In this case, you could use a static variable.
 One possible implementation of a singleton would look like this:



 */

class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}