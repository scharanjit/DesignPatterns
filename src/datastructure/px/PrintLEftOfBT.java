package datastructure.px;

public class PrintLEftOfBT {

    Node root;

    int max_level=0;
    public PrintLEftOfBT(){
        root=null;
    }


    public static void main(String[] args) {
        PrintLEftOfBT printLEftOfBT = new PrintLEftOfBT();

        printLEftOfBT.root= new Node(1);
        printLEftOfBT.root.left= new Node(2);
        printLEftOfBT.root.left.left= new Node(6);
        printLEftOfBT.root.left.right= new Node(5);
        printLEftOfBT.root.right= new Node(3);
        printLEftOfBT.root.right.left= new Node(4);
        printLEftOfBT.root.right.right= new Node(5);


        printLEftOfBT.printLeftView(printLEftOfBT.root,1);

    }

    private  void printLeftView(Node root,int level) {
        if(root == null){
            return;
        }
        if(max_level<level){
            System.out.println(root.data);
            max_level=level;
        }

        printLeftView(root.left,level+1);
        printLeftView(root.right,level+1);

    }
}
