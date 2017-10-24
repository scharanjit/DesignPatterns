package datastructure.px;

public class CreateBTINPre {
        Node root;
    int prIndex=0;

    public static void main(String[] args) {
        CreateBTINPre createBTINPre = new CreateBTINPre();

        int in[] =  {4,2,5,1,6,3};
        int pre[] = {1,2,4,5,3,6};
        int len=in.length-1;
       Node node= createBTINPre.buildTree(in,pre,0,len);

       createBTINPre.printPreOrder(node);

    }

    private void printPreOrder(Node node) {


        if(node== null){
            return;
        }
        System.out.print(node.data+" ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    private Node buildTree(int[] in, int[] pre, int inStart, int inEnd) {

        if(inStart>inEnd){
            return null;
    }


    Node node = new Node(pre[prIndex++]);

    if(inStart==inEnd){
        return node;
    }

    int inIndex= search(in,inStart,inEnd,node.data);

    node.left=buildTree(in,pre,inStart,inIndex-1);
    node.right=buildTree(in,pre,inIndex+1,inEnd);
    return node;

    }

    private int search(int[] in, int inStart, int inEnd, int data) {

        int i;

        for(i=inStart;i<=inEnd;i++){
            if(in[i]==data){
                return i;
            }


        }
        return i;
    }
}
