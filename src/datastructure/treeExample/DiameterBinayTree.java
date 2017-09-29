package datastructure.treeExample;

// Recursive optimized Java program to find the diameter of a
// Binary Tree

/* Class containing left and right child of current
 NodeB and key value
 Time Complexity: O(n^2)
 https://www.youtube.com/watch?v=zUgxaZApKWA
 */
class NodeB {
    int data;
    NodeB left, right;

    public NodeB(int item) {
        data = item;
        left = right = null;
    }
}

/* Class to print the Diameter */
class DiameterBinaryTree {
    NodeB root;

    /* Method to calculate the diameter and return it to main */
    int diameter(NodeB root) {
        /* base case if tree is empty */
        if (root == null)
            return 0;
 
        /* get the height of left and right sub trees */
        int lheight = height(root.left);
        int rheight = height(root.right);
 
        /* get the diameter of left and right subtrees */
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
 
        /* Return max of following three
          1) Diameter of left subtree
         2) Diameter of right subtree
         3) Height of left subtree + height of right subtree + 1 */
        return Math.max(lheight + rheight + 1,
                Math.max(ldiameter, rdiameter));

    }

    /* A wrapper over diameter(NodeB root) */
    int diameter() {
        return diameter(root);
    }

    /*The function Compute the "height" of a tree. Height is the
      number f NodeBs along the longest path from the root NodeB
      down to the farthest leaf NodeB.*/
    static int height(NodeB NodeB) {
        /* base case tree is empty */
        if (NodeB == null)
            return 0;
 
        /* If tree is not empty then height = 1 + max of left
           height and right heights */
        return (1 + Math.max(height(NodeB.left), height(NodeB.right)));
    }

    public static void main(String args[]) {
        /* creating a binary tree and entering the NodeBs */
        DiameterBinaryTree tree = new DiameterBinaryTree();
        tree.root = new NodeB(1);
        tree.root.left = new NodeB(2);
        tree.root.right = new NodeB(3);
        tree.root.left.left = new NodeB(4);
        tree.root.left.right = new NodeB(5);

        System.out.println("The diameter of given binary tree is : "
                + tree.diameter());
    }
}
