package datastructure.T25Algo;

public class LinkedListPairSwap {

    NodeC head;

    class NodeC {
        int data;
        NodeC next;

        NodeC(int value) {
            data = value;
            next = null;
        }
    }


    void pairSwap() {
        NodeC temp = head;

        while (temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;

            temp = temp.next.next;
        }
    }

    void push(int data) {
        NodeC nodeC = new NodeC(data);
        nodeC.next = head;
        head = nodeC;

    }

    void printList() {
        NodeC temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListPairSwap linkedListPairSwap = new LinkedListPairSwap();
        linkedListPairSwap.push(8);
        linkedListPairSwap.push(7);
        linkedListPairSwap.push(6);
        linkedListPairSwap.push(5);
        linkedListPairSwap.push(4);
        linkedListPairSwap.push(3);
        linkedListPairSwap.push(2);
        linkedListPairSwap.push(1);

        linkedListPairSwap.printList();
        System.out.println();
        linkedListPairSwap.pairSwap();
        linkedListPairSwap.printList();
    }

}
