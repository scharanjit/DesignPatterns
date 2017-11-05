package practise.makes.a.man.perfect.equalsHashCode;

/**
 *
 *
 * equals() : This method checks if some other object passed to it as an
 * argument is equal the object in which this method is invoked.
 * It is easy to implement the equals() method incorrectly, if you do not
 * understand the contract. Before overriding this method, following “properties”
 * need to keep in mind -

 Reflexive: o1.equals(o1) - which means an Object (e.g. o1) should be equal to itself

 Symmetric: o1.equals(o2) if and only o2.equals(o1)

 Transitive: o1.equals(o2) && o2.equals(o3) implies that o1.equals(o3) as well

 Consistent: o1.equals(o2) returns the same as long as o1 and o2 are unmodified

 null comparison : !o1.equals(null) - which means that any instantiable object is
 not equal to null. So if you pass a null as an argument to your object o1,
 then it should return false.

 Hash code value: o1.equals(o2) implies o1.hashCode() == o2.hashCode() .
 This is very important. If you define a equals() method then you must
 define a hashCode() method as well. Also it means that if you have two
 objects that are equal then they **must** have the same hashCode, however the
 reverse is not true
 *
 *
 *
 *hashCode(): This method returns a hashCode() value as an Integer and is
 * supported for the benefit of hashing based java.util.Collection classes
 * like Hashtable, HashMap, HashSet etc. If a class overrides the equals()
 * method, it must implement the hashCode() method as well.Before overriding
 * this method, you need to keep in mind

 Whenever hashCode() method is invoked on the same object more than once
 during an execution of a Java program, this method must consistently
 return the same result. The integer result need not remain consistent
 from one execution of the program to the next execution of the same program.

 If two objects are equal as per the equals() method, then calling the
 hashCode() method in each of the two objects must return the same integer
 result. So, If a field is not used in equals(), then it must not be used in
 hashCode() method.

 If two objects are unequal as per the equals() method, each of the two
 objects can return either two different integer results or same integer
 results (i.e. if 2 objects have the same hashCode() result does not mean
 that they are equal, but if two objects are equal then they must return
 the same hashCode() result).
 *
 */
public class EqualHashCode {
}
