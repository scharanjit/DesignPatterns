package design.patterns.facade;
//unified class that stores references of class that implements Algorithm interface

public class SortingManager {

    private Algorithm bubbleSort;
    private Algorithm heapSort;
    private Algorithm mergeSort;

    public SortingManager() {
        this.bubbleSort = new BubbleSort();
        this.heapSort = new HeapSort();
        this.mergeSort = new MergeSort();
    }


    public void mergeSort() {
        this.mergeSort.sort();
    }

    public void heapSort() {
        this.heapSort.sort();
    }

    public void bubbleSort() {
        this.bubbleSort.sort();
    }

}
