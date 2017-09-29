package datastructure.T25Algo;

/*
Product of 3 should be maximum
// the whole appraoch is to find the 2 minimum number & 3 maximum numbers
//since 2 negative and 1 positive becomes MAximum Product
OR 3 positive bcms MAximum product

Therefore

initially min1 & min2 assigned MAX of iNTEGER valuesa
and initialy max1,max2 & max3 assigned to min Integer values
den

n is compared <= with min1 & min2

n is compared >= with max1 max2 max3


INTENTION :- GET LOWEST VALUE IN MIN1 < MIN2
GET toppest value in max1 >max2>max 3

 */
public class MaximumProductSubarrayTrio {

    public static int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE,
                min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE,
                max2 = Integer.MIN_VALUE,
                max3 = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {     // n lies between min1 and min2
                min2 = n;
            }
            if (n >= max1) {            // n is greater than max1, max2 and max3
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {     // n lies betweeen max1 and max2
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {     // n lies betwen max2 and max3
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }


    public static void main(String[] args) {
        int arr[] = {1, -2, -3, 0, 7, -8, -2};
        System.out.println(maximumProduct(arr));
        int arr1[] = {1, -2, -3, 0, 7, -8, -2, 100000};
        System.out.println(maximumProduct(arr1));
        int arr2[] = {1, -2, -3, 0, 7, -8, -2, -50, -100000};
        System.out.println(maximumProduct(arr2));
    }
}