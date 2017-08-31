package design.patterns.facade;
//facade :- hide concrete implementation of class
// sorting manager hides the internal implementation of bubble sort, heapsort, merge sort


public class App {

    public static void main(String[] args) {
        SortingManager sortingManager = new SortingManager();

        sortingManager.bubbleSort();
        sortingManager.heapSort();
        sortingManager.mergeSort();

        //we need not to instanitate various classes
        // Sorting manager hides the internal functionality
    }
}
