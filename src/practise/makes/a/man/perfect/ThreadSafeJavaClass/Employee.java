package practise.makes.a.man.perfect.ThreadSafeJavaClass;


/**
 * public class MyClass {
 private int number;

 public MyClass(int number) {
 this.number = number;
 }

 public int getNumber() {
 return number;
 }

 public void setNumber(int number) {
 this.number = number;
 }
 }
 There are three ways to construct thread-safe Java class which has some state:

 Make it truly immutable
 public class MyClass {
 private final int number;

 public MyClass(int number) {
 this.number = number;
 }

 public int getNumber() {
 return number;
 }

 }
 Make field number volatileExample.
 public class MyClass {
 private volatileExample int number;

 public MyClass(int number) {
 this.number = number;
 }

 public int getNumber() {
 return number;
 }

 public void setNumber(int number) {
 this.number = number;
 }
 }
 Use a synchronized block. Classic version of this approach described in
 Chapter 4.3.5 of Java Concurrency in practice.
 And the funny thing about that it has an error in the examplewithoutbridge which
 is mentioned in a errata for this book.
 public class MyClass {
 private int number;

 public MyClass(int number) {
 setNumber(number);
 }

 public synchronized int getNumber() {
 return number;
 }

 public synchronized void setNumber(int number) {
 this.number = number;
 }
 }
 */
public class Employee {


    //make it immutable
    //or
    // make local variable volatileExample
//    or
    //through synchronised block

}
//TODO https://stackoverflow.com/questions/9622061/thread-safe-class-in-java-by-means-of-synchronized-blocks