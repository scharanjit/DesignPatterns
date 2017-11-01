package datastructure.T25Algo;

public class ArrayNonDuplicate {
    static final int INT_SIZE = 32;

    public static void duplicate(int[] arr) {
        int size = arr.length;
        int count[] = new int[size];
        int i;

        System.out.println("Repeated elements are : ");
        for (i = 0; i < size; i++) {
            if (count[arr[i]] == 1)
                System.out.print(arr[i] + " ");
            else
                count[arr[i]]++;
        }
    }

    // Method to find the element that occur only once
    static int getSingle(int arr[], int n) {
        int result = 0;
        int x, sum;

        // Iterate through every bit
        for (int i = 0; i < INT_SIZE; i++) {
            // Find sum of set bits at ith position in all
            // array elements
            sum = 0;
            x = (1 << i);
            for (int j = 0; j < n; j++) {
                if ((arr[j] & x) == 0)
                    sum++;
            }
            // The bits with sum not multiple of 3, are the
            // bits of element with single occurrence.
            if ((sum % 3) == 0)
                result |= x;
        }
        return result;
    }

    private static void nonRepeatingElement(int[] a) {
        int n = a.length;
        int flag = 0;
        int count = 0;
        System.out.print("Non repeated elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (a[i] != a[j]) {
                        flag = 1;
                    } else {
                        flag = 0;
                        break;
                    }
                }
            }
            if (flag == 1) {
                count++;
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("Number of non repeated elements are:" + count);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 4, 5, 5, 6, 7, 7, 0, 0, 9, 8};

        duplicate(arr);
        System.out.println();
        nonRepeatingElement(arr);
        System.out.println();
//        int arr1[] = {3, 4, 1, 3, 1, 7, 2, 2, 4};
//        System.out.println("Non repeating element: "+getSingle(arr1,arr1.length)+" ");
    }
}
