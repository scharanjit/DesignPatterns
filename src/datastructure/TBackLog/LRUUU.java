package datastructure.TBackLog;

import java.util.HashMap;

public class LRUUU {

    static int capacity = 4;
    Node head, end;
    HashMap<Integer, Node> hashMap = new HashMap<>();

    class Node {
        Node next, prev;
        int key, value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;

        }
    }


    public static void main(String[] args) {
        LRUUU lruuu = new LRUUU();

        lruuu.set(1, 2);

        System.out.println(lruuu.get(1));
    }

    private int get(int key) {
        if (hashMap.containsKey(key)) {
            Node node = hashMap.get(key);
            remove(node);
            setHead(node);
            return node.value;
        }
        return -1;

    }

    private void set(int key, int value) {

        if (hashMap.containsKey(key)) {
            Node oldvalue = hashMap.get(key);
            oldvalue.value = value;
            remove(oldvalue);
            setHead(oldvalue);
        } else {
            Node createdNode = new Node(key, value);
            if (hashMap.size() >= capacity) {
                hashMap.remove(end.key);
                remove(end);
                setHead(createdNode);
            } else {
                setHead(createdNode);
            }

            hashMap.put(key, createdNode);
        }
    }

    private void setHead(Node node) {
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (end == null) {
            end = head;
        }

    }

    private void remove(Node node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            end = node.prev;
        }

    }
}
