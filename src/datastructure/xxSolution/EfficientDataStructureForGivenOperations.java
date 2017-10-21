package datastructure.xxSolution;


/**
 * 1) findMin() : Returns the minimum item.
 * Frequency: Most frequent
 * <p>
 * 2) findMax() : Returns the maximum item.
 * Frequency: Most frequent
 * <p>
 * 3) deleteMin() : Delete the minimum item.
 * Frequency: Moderate frequent
 * <p>
 * 4) deleteMax() : Delete the maximum item.
 * Frequency: Moderate frequent
 * <p>
 * 5) Insert() : Inserts an item.
 * Frequency: Least frequent
 * <p>
 * 6) Delete() : Deletes an item.
 * Frequency: Least frequent.
 */


class MaxHeap {
    int capacity;
    DLLNode arr[];
    int size;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        arr = new DLLNode[this.capacity];
        this.size = 0;
    }

    void swap(DLLNode[] arr, int i, int j) {
        DLLNode temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        int tempIndex = arr[i].maxHeapIndex;
        arr[i].maxHeapIndex = arr[j].maxHeapIndex;
        arr[j].maxHeapIndex = tempIndex;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    DLLNode getMax() {
        if (size <= 0) {
            System.out.println("Heap underflow");
            return null;
        }
        return arr[0];
    }

    DLLNode extractMax() {
        if (size <= 0) {
            System.out.println("Heap underflow");
            return null;
        }
        if (size == 1) {
            size--;
            return arr[0];
        }

        DLLNode root = arr[0];
        arr[0] = arr[size - 1];
        arr[0].maxHeapIndex = 0;
        size--;
        maxHeapify(0);

        return root;
    }

    void maxHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;

        if (l < size && arr[l].data > arr[largest].data)
            largest = l;
        if (r < size && arr[r].data > arr[largest].data)
            largest = r;

        if (largest != i) {
            swap(arr, i, largest);
            maxHeapify(largest);
        }
    }

    int fixUpwards(int i) {
        while (i != 0 && arr[i].data > arr[parent(i)].data) {
            swap(arr, i, parent(i));
            i = parent(i);
        }

        return i;
    }

    void increaseKey(int i, int newKey) {
        arr[i].data = newKey;
        fixUpwards(i);
    }

    int insert(DLLNode node) {
        if (size == capacity) {
            System.out.println("Heap overflow");
            return -1;
        }

        arr[size] = node;
        arr[size].maxHeapIndex = size;
        size++;
        return fixUpwards(size - 1);
    }

    void delete(int i) {
        increaseKey(i, Integer.MAX_VALUE);
        extractMax();
    }

    void printMaxHeap() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i].data + " ");
        System.out.println();
    }
}

class MinHeap {
    int capacity;
    DLLNode arr[];
    int size;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        arr = new DLLNode[this.capacity];
        this.size = 0;
    }

    void swap(DLLNode[] arr, int i, int j) {
        DLLNode temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        int tempIndex = arr[i].minHeapIndex;
        arr[i].minHeapIndex = arr[j].minHeapIndex;
        arr[j].minHeapIndex = tempIndex;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    DLLNode getMin() {
        if (size <= 0) {
            System.out.println("Heap underflow");
            return null;
        }
        return arr[0];
    }

    DLLNode extractMin() {
        if (size <= 0) {
            System.out.println("Heap underflow");
            return null;
        }
        if (size == 1) {
            size--;
            return arr[0];
        }

        DLLNode root = arr[0];
        arr[0] = arr[size - 1];
        arr[0].minHeapIndex = 0;
        size--;
        minHeapify(0);

        return root;
    }

    void minHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;

        if (l < size && arr[l].data < arr[smallest].data)
            smallest = l;
        if (r < size && arr[r].data < arr[smallest].data)
            smallest = r;

        if (smallest != i) {
            swap(arr, i, smallest);
            minHeapify(smallest);
        }
    }

    int fixUpwards(int i) {
        while (i != 0 && arr[i].data < arr[parent(i)].data) {
            swap(arr, i, parent(i));
            i = parent(i);
        }

        return i;
    }

    void decreaseKey(int i, int newKey) {
        arr[i].data = newKey;
        fixUpwards(i);
    }

    int insert(DLLNode node) {
        if (size == capacity) {
            System.out.println("Heap overflow");
            return -1;
        }

        arr[size] = node;
        arr[size].minHeapIndex = size;
        size++;
        return fixUpwards(size - 1);
    }

    void delete(int i) {
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

    void printMinHeap() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i].data + " ");
        System.out.println();
    }
}

class DLLNode {
    int data;
    int minHeapIndex;
    int maxHeapIndex;
    DLLNode prev;
    DLLNode next;
}

class DLL {
    DLLNode head;

    public DLL() {
        this.head = null;
    }

    void insertAtBeginning(DLLNode node) {
        node.prev = null;
        node.next = head;

        if (head != null)
            head.prev = node;

        head = node;
    }

    DLLNode findNode(int key) {
        DLLNode node = head;

        while (node != null) {
            if (node.data == key)
                return node;
            node = node.next;
        }

        return null;
    }

    void deleteNode(DLLNode node) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (node.prev != null)
            node.prev.next = node.next;
        else {
            head = node.next;
            head.prev = null;
        }

        if (node.next != null)
            node.next.prev = node.prev;
    }

    void printList() {
        DLLNode node = head;

        while (node != null) {
            System.out.println(node.data + " " + " minHeapIndex= " + node.minHeapIndex + " maxHeapIndex= " + node.maxHeapIndex);
            node = node.next;
        }

        System.out.println();
    }
}

class MyDS {
    static final int N = 500;

    DLL list = new DLL();
    MinHeap minHeap = new MinHeap(N);
    MaxHeap maxHeap = new MaxHeap(N);

    int findMin() {
        return minHeap.getMin().data;
    }

    int findMax() {
        return maxHeap.getMax().data;
    }

    int deleteMin() {
        DLLNode node = minHeap.getMin();

        int result = node.data;

        int maxIndex = node.maxHeapIndex;
        minHeap.extractMin();
        maxHeap.delete(maxIndex);
        list.deleteNode(node);

        return result;
    }

    int deleteMax() {
        DLLNode node = maxHeap.getMax();

        int result = node.data;

        int minIndex = node.minHeapIndex;
        list.deleteNode(node);
        maxHeap.extractMax();
        minHeap.delete(minIndex);

        return result;
    }

    void insert(int key) {
        DLLNode node = new DLLNode();
        node.data = key;
        node.minHeapIndex = minHeap.insert(node);
        node.maxHeapIndex = maxHeap.insert(node);
        list.insertAtBeginning(node);
    }

    void delete(int key) {
        DLLNode node = list.findNode(key);

        if (node == null) {
            System.out.println("Key not present.");
            return;
        }

        minHeap.delete(node.minHeapIndex);
        maxHeap.delete(node.maxHeapIndex);
        list.deleteNode(node);
    }
}


public class EfficientDataStructureForGivenOperations {
    public static void main(String[] args) {
        MyDS ds = new MyDS();

        ds.insert(10);
        ds.insert(20);
        ds.insert(30);
        ds.insert(40);
        ds.insert(50);

        System.out.println("Max: " + ds.findMax());
        System.out.println("Min: " + ds.findMin());

        System.out.println("Deleting 30");
        ds.delete(30);

        System.out.println("Deleting 50");
        ds.delete(50);

        System.out.println("Extracted Max: " + ds.deleteMax());
        System.out.println("Extracted Min: " + ds.deleteMin());

        System.out.println("Max: " + ds.findMax());
        System.out.println("Min: " + ds.findMin());
    }
}
