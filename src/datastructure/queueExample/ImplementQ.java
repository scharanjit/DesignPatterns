package datastructure.queueExample;

import java.util.Stack;

public class ImplementQ {

    static class Queue {
        Stack stack1;
        Stack stack2;
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.stack1 = new Stack();
        q.stack2 = new Stack();

        enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);
        enQueue(q, 4);


        deQueue(q);
    }

    private static void deQueue(Queue q) {
        if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }


    }

    private static void enQueue(Queue q, int i) {

        push(q.stack1, i);
    }

    private static void push(Stack stack1, int i) {
        stack1.push(i);
    }
}
