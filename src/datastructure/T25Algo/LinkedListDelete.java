package datastructure.T25Algo;

public class LinkedListDelete {

    static class LinkedList{
      static  Node head;

        public void printList(Node head) {

            while(head.next != null){
                System.out.print(head.next.data+" ");
                head=head.next;
            }
        }

        public void deleteNode(Node linkedList, Node next) {

            if(linkedList==next){
                if(linkedList.next==null){
                    System.out.println("head can't be deleted");
                    return;
                }

                linkedList.data=linkedList.next.data;

                linkedList.next=linkedList.next.next;

                return;
            }
             Node prev= linkedList;

            while(prev.next != null && prev.next != next){

                prev= prev.next;

            }




        }

        static  class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                next=null;
            }
        }
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head= new LinkedList.Node(1);
        linkedList.head.next= new LinkedList.Node(2);
        linkedList.head.next.next= new LinkedList.Node(3);
        linkedList.head.next.next.next= new LinkedList.Node(4);


        linkedList.printList(linkedList.head);


        linkedList.deleteNode(linkedList.head,linkedList.head.next.next);

    }
}
