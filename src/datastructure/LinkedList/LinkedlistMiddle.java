package datastructure.LinkedList;


/**
 * Given a singly linked list, find middle of the linked list. For example,
 * if given linked list is 1->2->3->4->5
 * then output should be 3.
 * <p>
 * If there are even nodes, then there would be two middle nodes, we need
 * to print second middle element. For example, if given linked list is
 * 1->2->3->4->5->6 then output should be 4.
 * <p>
 * Method 2:
 * Traverse linked list using two pointers. Move one pointer by one and other
 * pointer by two. When the fast pointer reaches end slow pointer will reach middle
 * of the linked list.
 */
public class LinkedlistMiddle {

    Node head; // head of linked list

    /* Linked list node */
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Function to print middle of linked list */
    void printMiddle() {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null) {
            while (fast_ptr != null && slow_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                    slow_ptr.data + "] \n");
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* This function prints contents of linked list
       starting from  the given node */
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + "->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedlistMiddle llist = new LinkedlistMiddle();
        for (int i = 5; i > 0; --i) {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }
    }
}
