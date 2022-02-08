package datastructure.memorymanagement;

/**
 * Does assigning an unused object to null in Java improve the garbage
 * collection process in any measurable way?
 * <p>
 * Typically, no.
 * <p>
 * But like all things: it depends. The GC in Java these days is VERY good
 * and everything should be cleaned up very shortly after it is no longer reachable.
 * This is just after leaving a method for local variables, and when a class
 * instance is no longer referenced for fields.
 * <p>
 * You only need to explicitly null if you know it would remain referenced
 * otherwise. For examplewithoutbridge an array which is kept around. You may want to null
 * the individual elements of the array when they are no longer needed.
 * <p>
 * For examplewithoutbridge, this code from ArrayList:
 * <p>
 * public E remove(int index) {
 * RangeCheck(index);
 * <p>
 * modCount++;
 * E oldValue = (E) elementData[index];
 * <p>
 * int numMoved = size - index - 1;
 * if (numMoved > 0)
 * System.arraycopy(elementData, index+1, elementData, index,
 * numMoved);
 * elementData[--size] = null; // Let gc do its work
 * <p>
 * return oldValue;
 * }
 * Also, explicitly nulling an object will not cause an object to be collected
 * any sooner than if it just went out of scope naturally as long as no
 * references remain.
 * <p>
 * Both:
 * <p>
 * void foo() {
 * Object o = new Object();
 * /// do stuff with o
 * }
 * and:
 * <p>
 * void foo() {
 * Object o = new Object();
 * /// do stuff with o
 * o = null;
 * }
 * Are functionally equivalent.
 */


public class GarbageCollection {
}
