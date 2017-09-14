package datastructure.treeExample;

// Java program for different tree traversals

/* Class containing left and right child of current
   Node1 and key value*/
class Node1 {
    int key;
    Node1 left, right;

    public Node1(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree1 {
    // Root of Binary Tree
    Node1 root;

    BinaryTree1() {
        root = null;
    }

    /* Given a binary tree, print its Node1s according to the
      "bottom-up" postorder traversal. */
    void printPostorder(Node1 Node1) {
        if (Node1 == null)
            return;

        // first recur on left subtree
        printPostorder(Node1.left);

        // then recur on right subtree
        printPostorder(Node1.right);

        // now deal with the Node1
        System.out.print(Node1.key + " ");
    }

    /* Given a binary tree, print its Node1s in inorder*/
    void printInorder(Node1 Node1) {
        if (Node1 == null)
            return;
 
        /* first recur on left child */
        printInorder(Node1.left);
 
        /* then print the data of Node1 */
        System.out.print(Node1.key + " ");
 
        /* now recur on right child */
        printInorder(Node1.right);
    }

    /* Given a binary tree, print its Node1s in preorder*/
    void printPreorder(Node1 Node1) {
        if (Node1 == null)
            return;
 
        /* first print data of Node1 */
        System.out.print(Node1.key + " ");
 
        /* then recur on left sutree */
        printPreorder(Node1.left);
 
        /* now recur on right subtree */
        printPreorder(Node1.right);
    }

    // Wrappers over above recursive functions
    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    // Driver method
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}
