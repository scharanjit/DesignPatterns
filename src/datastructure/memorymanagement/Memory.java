package datastructure.memorymanagement;


/**
 * As soon as we run the program, it loads all the Runtime classes
 * into the Heap space.
 * <p>
 * When main() method is found at line 1, Java Runtime creates
 * stack memory to be used by main() method thread.
 * <p>
 * We are creating primitive local variable at line 2, so it’s
 * created and stored in the stack memory of main() method.
 * <p>
 * Since we are creating an Object in line 3, it’s created in
 * Heap memory and stack memory contains the reference for it.
 * <p>
 * Similar process occurs when we create Memory object in line 4.
 * <p>
 * Now when we call foo() method in line 5, a block in the top of the
 * stack is created to be used by foo() method. Since Java is pass by value,
 * a new reference to Object is created in the foo() stack block in line 6.
 * <p>
 * A string is created in line 7, it goes in the String Pool in the heap space
 * and a reference is created in the foo() stack space for it.
 * <p>
 * foo() method is terminated in line 8, at this time memory block
 * allocated for foo() in stack becomes free.
 * <p>
 * In line 9, main() method terminates and the stack memory created for main()
 * method is destroyed. Also the program ends at this line, hence Java Runtime
 * frees all the memory and end the execution of the program.
 */
public class Memory {

    public static void main(String[] args) { // Line 1
        int i = 1; // Line 2
        Object obj = new Object(); // Line 3
        Memory mem = new Memory(); // Line 4
        mem.foo(obj); // Line 5
    } // Line 9

    private void foo(Object param) { // Line 6
        String str = param.toString(); //// Line 7
        System.out.println(str);
    } // Line 8
}

