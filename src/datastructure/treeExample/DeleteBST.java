package datastructure.treeExample;

public class DeleteBST {

    class Node{
        int data;
        Node left,right;

        public Node(int item){
            this.data=item;
            left = right = null;
        }
    }


    Node root;

    public DeleteBST() {
        root = null;
    }

    public static void main(String[] args) {
        DeleteBST deleteBST =  new DeleteBST();

        deleteBST.insert(50);
        deleteBST.insert(30);
        deleteBST.insert(20);
        deleteBST.insert(40);
        deleteBST.insert(70);
        deleteBST.insert(60);
        deleteBST.insert(80);

        deleteBST.inOrderPrint();

        System.out.println();
        deleteBST.deleteNode(20);
        System.out.println();

        deleteBST.inOrderPrint();

        System.out.println();



    }

    private void deleteNode(int i) {

        root =deleteRec(root,i);
    }

    private Node deleteRec(Node root, int i) {

        if(root ==null) return null;
        if(i< root.data){
            root.left=deleteRec(root.left,i);
        }else if(i> root.data){
            root.right=deleteRec(root.right,i);
        }else{
            if(root.left == null){
                return root.right;

            }else if(root.right ==null){
                return root.left;
            }

            root.data=minValue(root.right);

            root.right=deleteRec(root.right,root.data);
        }
        return root;
    }

    private int minValue(Node root) {

        int minV=root.data;
        while(root.left!=null){
            minV=root.left.data;
            root=root.left;
        }
        return minV;
    }

    private void inOrderPrint() {
        printInOrder(root);
    }

    private void printInOrder(Node root) {
        if(root ==null){
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data+" ");
        printInOrder(root.right);
    }

    private void insert(int i) {

       root= insertRec(root,i);
    }

    private Node insertRec(Node root, int i) {

        if(root == null){
            root = new Node(i);
            return root;
        }

        if(i<root.data){
            root.left=insertRec(root.left,i);
        }else if(i>root.data){
            root.right=insertRec(root.right,i);
        }
        return root;
    }



}
