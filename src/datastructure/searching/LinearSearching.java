package datastructure.searching;

public class LinearSearching {

    // This function returns index of element x in arr[]
    static int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(search(arr, arr.length, 5));
    }
}
