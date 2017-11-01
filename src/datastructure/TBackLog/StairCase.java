package datastructure.TBackLog;

import com.sun.org.apache.xpath.internal.SourceTree;

public class StairCase {

    public static void main(String[] args) {
        System.out.println("Number of ways to reach 2th step: "+ways(2));
    }

    private static int ways(int i) {

        return fib(i+1);
    }

    private static int fib(int n) {

        if(n<=1)
            return n;

        return fib(n-1) + fib(n-2);
    }
}
