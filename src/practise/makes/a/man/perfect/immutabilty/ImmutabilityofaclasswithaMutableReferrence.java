package practise.makes.a.man.perfect.immutabilty;

/**
 * We have one immutble class and inside this class has refernece as mutable
 *
 * Employee immutable
 * Address mutable
 *
 *
 * final fields also allow programmers to implement thread-safe
 * immutable objects without synchronization.
 * A thread-safe immutable object is seen as immutable by all threads,
 * even if a data race is used to pass references to the immutable object
 * between threads. This can provide safety guarantees against misuse
 * of an immutable class by incorrect or malicious code. final fields must
 * be used correctly to provide a guarantee of immutability.

 The usage model for final fields is a simple one: Set the final fields
 for an object in that object's constructor; and do not write a reference
 to the object being constructed in a place where another thread can see
 it before the object's constructor is finished. If this is followed,
 then when the object is seen by another thread, that thread will always
 see the correctly constructed version of that object's final fields.
 It will also see versions of any object or array referenced by those
 final fields that are at least as up-to-date as the final fields are.


 So you need to:

 1.) Make address both final and private.
 2.)Prevent any mutable reference to that object from being seen
 externally to your immutable object.

 ==>In this case, #2 probably means you can't return a reference
 to Address like you have with getAddress().
 And you have to make a defensive copy. Make a copy of the object,
 and store that copy in Employee. If you can't make a defensive copy,
 there's really no way to make Employee immutable.
 */

public class ImmutabilityofaclasswithaMutableReferrence {

    public final class Employee{
        private final int id;
        private final Address address;
        public Employee(int id, Address address)
        {
            this.id = id;
            this.address=new Address();  // defensive copy
            this.address.setStreet( address.getStreet() );
        }
        public int getId(){
            return id;
        }
        public Address getAddress() {
            Address nuAdd = new Address(); // must copy here too
            nuAdd.setStreet( address.getStreet() );
            return nuAdd;
        }

    }

    public class Address{
        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        private String street;

    }
}

