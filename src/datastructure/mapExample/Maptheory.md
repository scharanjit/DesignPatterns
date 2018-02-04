**Map interface**


**1.) _HashMap_ :-**
key value pair,
No order,
HashMap implements Map interface 

HashMap is non-synchronized 

Map m = Collections.synchronizedMap(new HashMap(...));

Iterators of this class are fail-fast if any structure
 modification is done after creation of iterator, 
 in any way except through the iterator’s remove method. 
 In faliure of iterator it will throw ConcurrentModificationException.

get/put/containsKey()  :-O(1) 
but we can’t guarantee that since it all depends on how much time
 does it take to compute the hash.


Hashtable is synchronized and hashmap is NOT synchronized

**2.) _LinkedHashMap_**

HashMap in Java provides quick insert, search and delete operations.
 However it does not maintain any order on elements inserted into it. 
 If we want to keep track of order of insertion, we can use LinkedHashMap.
LinkedHashMap is like HashMap with additional feature that we
 can access elements in their insertion order.

It contains only unique elements 



**3.) _TreeMap_**

TreeMap implements SortedMap interface. 
A Sorted Map interface is a child of Map.

TreeMap implements Red-Black Tree(a Self Balancing Binary Search Tree)


sorted order
unique elements in a sorted order. 

time complexity O(nLogn).  
 The advantage of this method is, we get elements in sorted order.