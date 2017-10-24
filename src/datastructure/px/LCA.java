package datastructure.px;

public class LCA {

    Node root;

//    public LCA(){
//        root=null;
//    }


    public static void main(String[] args) {
        LCA lca = new LCA();
        lca.root= new Node(1);
        lca.root.left= new Node(2);
        lca.root.left.left= new Node(5);
        lca.root.left.right= new Node(6);
        lca.root.right= new Node(3);
        lca.root.right.left= new Node(4);
        lca.root.right.right= new Node(5);


        System.out.println(lca.findLCA(5,3).data);

    }

    private Node findLCA(int i, int i1) {

        v1 = false;
        v2 = false;
        Node lca= findLCAUtil(root, i, i1);
        if(v1  && v2) {
            return lca;
        }else{
            return null;
        }

    }

    boolean v1,v2=false;

    private Node findLCAUtil(Node root, int n1, int n2) {

        if(root == null){
            return null;
        }

        if(root.data == n1){
            v1=true;
            return root;
        }

        if(root.data ==n2){
            v2=true;
            return root;
        }

        Node left_LCA= findLCAUtil(root.left,n1,n2);
        Node right_LCA= findLCAUtil(root.right,n1,n2);

        if(left_LCA != null && right_LCA!=null){
            return root;
        }else{
            return (left_LCA!=null)?left_LCA:right_LCA;
        }
    }
}
