package datastructure.T25Algo;

public class LinkedListNthNode {

    static class LinkedList {

        Node head;

        static class Node {
            int data;
            Node next;

            public Node(int value) {
                data = value;
                next = null;
            }
        }

        void push(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;

        }


        void printNthFromLast(int n) {
            int len = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                len++;
            }

            if (len < n) {
                System.out.println("unreachable as len is less ");
                return;
            }
            temp = head;
            for (int i = 0; i < len - n; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);


        }

        void printList() {

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;

            }
//            temp=head;
//            for(int i=0;i<len;i++){
//
//                System.out.print(temp.data+"-->");
//               temp= temp.next;
//            }
            System.out.println();

        }

    }

    public static void main(String[] args) {


        LinkedList l = new LinkedList();
        l.push(55);
        l.push(44);
        l.push(33);
        l.push(22);
        l.push(11);
        l.printList();

        l.printNthFromLast(5);
    }
}
