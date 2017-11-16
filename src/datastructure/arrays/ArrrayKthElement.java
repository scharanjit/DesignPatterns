package datastructure.arrays;


import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 1.) Array.sort() and find 4th element
 * Time is O(nlog(n)).
 * <p>
 * 2.)  Quick Sort
 * Average case time is O(n), worst case time is O(n^2).
 * <p>
 * 3.) Heap (use Priority Queue) Time complexity is O(nlog(k)).
 * Space complexity is O(k)for storing the top k numbers.
 */
public class ArrrayKthElement {

    /**
     * 1.) Array.sort() and find 4th element
     * Time is O(nlog(n)).
     */
    public int findKthLargestArraySorting(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }


    /**
     * *
     * 2.)  Quick Sort
     * Average case time is O(n), worst case time is O(n^2
     */
    public int findKthLargestQuickSort(int[] nums, int k) {
        if (k < 1 || nums == null) {
            return 0;
        }

        return getKth(nums.length - k + 1, nums, 0, nums.length - 1);
    }

    public int getKth(int k, int[] nums, int start, int end) {

        int pivot = nums[end];

        int left = start;
        int right = end;

        while (true) {

            while (nums[left] < pivot && left < right) {
                left++;
            }

            while (nums[right] >= pivot && right > left) {
                right--;
            }

            if (left == right) {
                break;
            }

            swap(nums, left, right);
        }

        swap(nums, left, end);

        if (k == left + 1) {
            return pivot;
        } else if (k < left + 1) {
            return getKth(k, nums, start, left - 1);
        } else {
            return getKth(k, nums, left + 1, end);
        }
    }

    public void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }


    /**
     * Heap (use Priority Queue) Time complexity is O(nlog(k)).
     * Space complexity is O(k)for storing the top k numbers.n
     */

    public int findKthLargestHeap(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(k); //initial capacity of PQ
        for (int i : nums) {
            q.offer(i);    //add element into queue
            if (q.size() > k) {
                q.poll(); //remove the head object
            }
        }

        return q.peek(); //returns the head object
    }

    public static void main(String[] args) {
        ArrrayKthElement arrrayKthElement = new ArrrayKthElement();
        int arr[] = {1, 2, 4, 2, 5, 1, 6, 1};


        System.out.println(arrrayKthElement.findKthLargestArraySorting(arr, 3));
        System.out.println(arrrayKthElement.findKthLargestHeap(arr, 3));
        System.out.println(arrrayKthElement.findKthLargestQuickSort(arr, 3));
    }
}
