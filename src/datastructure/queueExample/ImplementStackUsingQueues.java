package datastructure.queueExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ImplementStackUsingQueues {

    Queue<Integer> q;
    Queue<Integer> temp;

    public ImplementStackUsingQueues() {
        q = new LinkedList();
        temp = new LinkedList();
    }

    void push(int value) {

         /* if no element is present in queue q then
         * enqueue the new element into q  */
        if (q.size() == 0) {
            q.add(value);
        } else {
              /* if elements are present in q then
             * dequeue all the elements to
             * temporary queue tmp */
            int len = q.size();
            for (int i = 0; i < len; i++) {
                temp.add(q.remove());
            }
               /* enqueue the new element into q */
            q.add(value);
                  /* dequeue all the elements from
             * temporary queue tmp to q */

            for (int i = 0; i < len; i++) {
                q.add(temp.remove());
            }

        }


    }

    /*  Function to remove top element from the stack */
    int pop() {
        if (q.size() == 0) {
            throw new NoSuchElementException("Underflow Exception");
        }
        return q.remove();
    }

    /*  Function to check if stack is empty */
    public boolean isEmpty() {
        return q.size() == 0;
    }

    /*  Function to get the size of the stack */
    public int getSize() {
        return q.size();
    }

    /*  Function to display the status of the stack */
    public void display() {
        System.out.print("\nStack = ");
        int l = getSize();
        if (l == 0)
            System.out.print("Empty\n");
        else {
            Iterator it = q.iterator();
            while (it.hasNext())
                System.out.print(it.next() + " ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        ImplementStackUsingQueues implementStackUsingQueues = new ImplementStackUsingQueues();
        implementStackUsingQueues.push(5);
        implementStackUsingQueues.push(5);
        implementStackUsingQueues.push(5);
        implementStackUsingQueues.display();
        System.out.println(implementStackUsingQueues.getSize());
        implementStackUsingQueues.pop();
        implementStackUsingQueues.display();
        implementStackUsingQueues.pop();
        implementStackUsingQueues.pop();
        System.out.println(implementStackUsingQueues.isEmpty());

    }


}
