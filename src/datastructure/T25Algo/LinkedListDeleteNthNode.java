package datastructure.T25Algo;


/**
 * Given a Singly Linked List, write a function to delete a given node.
 * Your function must follow following constraints:
 * 1) It must accept pointer to the start node as first parameter and node to
 * be deleted as second parameter i.e., pointer to head node is not global.
 * 2) It should not return pointer to the head node.
 * 3) It should not accept pointer to pointer to head node.
 * <p>
 * You may assume that the Linked List never becomes empty.
 */
public class LinkedListDeleteNthNode {


    static class LinkedList {

        static Node head;

        static class Node {

            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        void deleteNode(Node node, Node n) {

            // When node to be deleted is head node
            if (node == n) {
                if (node.next == null) {
                    System.out.println("There is only one node. The list "
                            + "can't be made empty ");
                    return;
                }

            /* Copy the data of next node to head */
                node.data = node.next.data;

                // store address of next node
                n = node.next;

                // Remove the link of next node
                node.next = node.next.next;

                // free memory
                System.gc();

                return;
            }

            // When not first node, follow the normal deletion process
            // find the previous node
            Node prev = node;
            while (prev.next != null && prev.next != n) {
                prev = prev.next;
            }

            // Check if node really exists in Linked List
            if (prev.next == null) {
                System.out.println("Given node is not present in Linked List");
                return;
            }

            // Remove node from Linked List
            prev.next = prev.next.next;

            // Free memory
            System.gc();

            return;
        }

        /* Utility function to print a linked list */
        void printList(Node head) {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println("");
        }


// Java program to delete a given node in linked list under given constraints


    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(12);
        list.head.next = new LinkedList.Node(15);
        list.head.next.next = new LinkedList.Node(10);
        list.head.next.next.next = new LinkedList.Node(11);
        list.head.next.next.next.next = new LinkedList.Node(5);
        list.head.next.next.next.next.next = new LinkedList.Node(6);
        list.head.next.next.next.next.next.next = new LinkedList.Node(2);
        list.head.next.next.next.next.next.next.next = new LinkedList.Node(3);

        System.out.println("Given Linked List :");
        list.printList(LinkedList.head);
        System.out.println("");

        // Let us delete the node with value 10
        System.out.println("Deleting node :" + LinkedList.head.next.next.data);
        list.deleteNode(LinkedList.head, LinkedList.head.next.next);

        System.out.println("Modified Linked list :");
        list.printList(LinkedList.head);
        System.out.println("");

        // Lets delete the first node
        System.out.println("Deleting first Node");
        list.deleteNode(LinkedList.head, LinkedList.head);
        System.out.println("Modified Linked List");
        list.printList(LinkedList.head);

    }
}
