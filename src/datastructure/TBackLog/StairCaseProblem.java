package datastructure.TBackLog;


/**
 * Given a number os stairs N
 * <p>
 * U would need to reach Kth Step either take 1 or 2 steps at a time
 * What are the number of ways to reach der?
 * <p>
 * Suppose we have 5 steps and u need to reach 2nd step
 * <p>
 * Numbr of ways :- n=2 ==> 1,1 or 2
 * Numer of ways :  n=3 ==> 1,1,1 or 1,2 or 2,1
 * Number of ways : n=4 ==> 1,1,1,1 or 2,1,1 or 1,2,1 or 1,1,2 or 2,2
 * <p>
 * <p>
 * HOw to resolve this
 * <p>
 * <p>
 * USe fibonacci
 * <p>
 * <p>
 * f(n) =f(n-1)+f(n-2)
 */
public class StairCaseProblem {

    // A simple recursive program to find n'th fibonacci number
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Returns number of ways to reach s'th stair
    static int countWays(int s) {
        return fib(s + 1);
    }


    /* Driver program to test above function */
    public static void main(String args[]) {
        int s = 4;
        System.out.println("Number of ways = " + countWays(s));
    }


}
