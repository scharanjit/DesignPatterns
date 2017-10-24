package datastructure.px;


class Node {

    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Index {
    int index;
}

public class CreateBTINPOST {

    Node root;

    public CreateBTINPOST() {
        root = null;
    }


    public static void main(String[] args) {
        CreateBTINPOST createBTINPOST = new CreateBTINPOST();
        int in[] = new int[]{4, 8, 2, 5, 1, 6, 3, 7};
        int post[] = new int[]{8, 4, 5, 2, 6, 7, 3, 1};
        int len = in.length;

        Node val = createBTINPOST.buildTree(in, post, len);

        createBTINPOST.printPreOrderTree(val);
    }

    private void printPreOrderTree(Node val) {
        if (val == null) {
            return;
        }


        System.out.print(val.data+" ");
        printPreOrderTree(val.left);
        printPreOrderTree(val.right);
    }

    private Node buildTree(int[] in, int[] post, int len) {

        Index pIndex = new Index();
        pIndex.index = len - 1;

        return buildTreeUtil(in, post, 0, len-1, pIndex);


    }

    private Node buildTreeUtil(int[] in, int[] post, int inStart, int inEnd, Index pIndex) {


        if (inStart > inEnd) {
            return null;
        }

        Node node = new Node(post[pIndex.index]);
        pIndex.index--;

        if (inStart == inEnd) {
            return node;
        }


        int inIndex = search(in, inStart, inEnd, node.data);

        node.right = buildTreeUtil(in, post, inIndex + 1, inEnd, pIndex);
        node.left = buildTreeUtil(in, post, inStart, inIndex - 1, pIndex);
        return node;


    }

    private int search(int[] in, int inStart, int inEnd, int data) {
        int i;
        for (i = inStart; i <= inEnd; i++) {
            if (in[i] == data) {
                return i;
            }
        }

        return i;
    }

}
