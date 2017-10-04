package datastructure.TBackLog;


import java.util.HashMap;

/**
 * Least Recently Used Cache
 *
 *
 * Design and implement a data structure for Least Recently Used (LRU) cache.
 * It should support the following operations: get and set.

 get(key) - Get the value (will always be positive) of the key if
 the key exists in the cache, otherwise return -1.

 set(key, value) - Set or insert the value if the key is not already present.
 When the cache reached its capacity, it should invalidate the least recently
 used item before inserting a new item.

 The key to solve this problem is using a double linked list which enables us
 to quickly move nodes.

 LRU-Cache

 The LRU cache is a hash table of keys and double linked nodes. The hash table
 makes the time of get() to be O(1). The list of double linked nodes make the nodes
 adding/removal operations O(1).
 */
public class LRUCache {

    int capacity=5;
    HashMap<Integer,Node> hashMap = new HashMap<>();
    Node head;
    Node end;

    //Define a double linked list node.
    class Node{
        int key,value;
        Node pre,next;

        public Node(int key, int value){
            this.key=key;
            this.value=value;
        }

    }


    public int get(int key){
        if(hashMap.containsKey(key)){
            Node n =hashMap.get(key);
            remove(n);
            setHead(n);
            return n.value;

        }
        return -1;
    }

    public void remove(Node node){
        if(node.pre != null){
            node.pre.next=node.next;
        }else{
            head=node.next;
        }

        if(node.next != null){
            node.next.pre=node.pre;
        }else{
            end=node.pre;
        }
    }

    public void setHead(Node node){
        node.next=head;
        node.pre=null;

        if(head != null){
            head.pre=node;
        }
        head=node;

        if(end==null){
            end=head;
        }
    }


    public void set(int key,int value){
        if(hashMap.containsKey(key)){
            Node oldNode= hashMap.get(key);
            oldNode.value=value;
            remove(oldNode);
            setHead(oldNode);
        }else{
            Node createdNode = new Node(key,value);
            if(hashMap.size()>=capacity){
                hashMap.remove(end.key);
                remove(end);
                setHead(createdNode);
            }else{
                setHead(createdNode);
            }
            hashMap.put(key,createdNode);
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache();
        lruCache.set(1,10);
        lruCache.set(2,9);
        lruCache.set(3,8);
        lruCache.set(4,7);
        lruCache.set(5,6);
        lruCache.set(75,100);
        lruCache.set(5,6);

        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(5));
        System.out.println(lruCache.get(75));
        System.out.println(lruCache.get(5));
    }


}
