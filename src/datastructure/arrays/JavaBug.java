package datastructure.arrays;

import java.util.Arrays;

public class JavaBug {

    public static void main(String[] args) {
        call1();

    }


    private static void call1() {
        int size = 3;  //try to change the size to 4,5,6 to understand the logic
        String[] array = new String[size];
        Arrays.fill(array, "");
        for(int i = 0; i <= 100; ) {
            array[i++%size] += i + " ";
        }
        for(String element: array) {
            System.out.println(element);
        }
    }

}
