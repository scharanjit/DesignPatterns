package datastructure.greedyalgo;
// Java program to construct a tree using inorder and preorder traversal

/* A binary tree node has data, pointer to left child
   and a pointer to right child

   => Create buildTree method
   => Pass the inOrder ele, PreOrder element , 0 & len-1 of Inorder

   inside it


   first do check if start>end return null
        Node tNOde = new Node(pre[pereI++])
            if (inS= end) return tNode
        int InIndes= search find index

        Node.left= recursion buildTree
        Node.left= recursion buldtree

   */
class Node {
    char root;
    Node left, right;

    public Node(char item) {
        root = item;
        left = right = null;
    }
}

class BinaryTreeFromInorderAndPreOrder {
    Node root;
    int preIndex = 0;

    Node buildTree(char in[], char pre[], int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        Node tNode = new Node(pre[preIndex++]);

        if (inStart == inEnd) {
            return tNode;
        }

//        int indexSearch = search(pre, inStart, inEnd, tNode.root);
        int indexSearch = search(in, inStart, inEnd, tNode.root);

        tNode.left = buildTree(in, pre, inStart, indexSearch - 1);
        tNode.right = buildTree(in, pre, indexSearch + 1, inEnd);

        return tNode;

    }


    public int search(char pre[], int inStart, int inEnd, char value) {
        int i;
        for (i = inStart; i <= inEnd; i++) {
            if (pre[i] == value) {
                return i;
            }

        }
        return i;
    }

    void printInorder(Node node){
        if(node==null){
            return;
        }
        printInorder(node.left);
        System.out.println(node.root);
        printInorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeFromInorderAndPreOrder binaryTreeFromInorderAndPreOrder = new BinaryTreeFromInorderAndPreOrder();
        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};

        int lenght = in.length;
        Node root = binaryTreeFromInorderAndPreOrder.buildTree(in, pre, 0, lenght - 1);
        binaryTreeFromInorderAndPreOrder.printInorder(root);
    }

}

