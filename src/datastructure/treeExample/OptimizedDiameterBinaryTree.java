package datastructure.treeExample;

// Recursive Java program to find the diameter of a
// Binary Tree

/* Class containing left and right child of current
 NodeBT and key value
 Time Complexity: O(n)
 */
class NodeBT
{
    int data;
    NodeBT left, right;

    public NodeBT(int item)
    {
        data = item;
        left = right = null;
    }
}

// A utility class to pass heigh object
class Height
{
    int h;
}

/* Class to print the Diameter */
class OptimizedDiameterBinaryTree
{
    NodeBT root;

    /* define height =0 globally and  call diameterOpt(root,height)
       from main */
    int diameterOpt(NodeBT root, Height height)
    {
        /* lh --> Height of left subtree
           rh --> Height of right subtree */
        Height lh = new Height(), rh = new Height();

        if (root == null)
        {
            height.h = 0;
            return 0; /* diameter is also 0 */
        }
         
        /* ldiameter  --> diameter of left subtree
           rdiameter  --> Diameter of right subtree */ 
        /* Get the heights of left and right subtrees in lh and rh
         And store the returned values in ldiameter and ldiameter */
        lh.h++;     rh.h++;
        int ldiameter = diameterOpt(root.left, lh);
        int rdiameter = diameterOpt(root.right, rh);
 
        /* Height of current NodeBT is max of heights of left and
         right subtrees plus 1*/
        height.h = Math.max(lh.h, rh.h) + 1;

        return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
    }

    /* A wrapper over diameter(NodeBT root) */
    int diameter()
    {
        Height height = new Height();
        return diameterOpt(root, height);
    }

    /*The function Compute the "height" of a tree. Height is the
      number f NodeBTs along the longest path from the root NodeBT
      down to the farthest leaf NodeBT.*/
    static int height(NodeBT NodeBT)
    {
        /* base case tree is empty */
        if (NodeBT == null)
            return 0;
 
        /* If tree is not empty then height = 1 + max of left
           height and right heights */
        return (1 + Math.max(height(NodeBT.left), height(NodeBT.right)));
    }

    public static void main(String args[])
    {
        /* creating a binary tree and entering the NodeBTs */
        OptimizedDiameterBinaryTree tree = new OptimizedDiameterBinaryTree();
        tree.root = new NodeBT(1);
        tree.root.left = new NodeBT(2);
        tree.root.right = new NodeBT(3);
        tree.root.left.left = new NodeBT(4);
        tree.root.left.right = new NodeBT(5);

        System.out.println("The diameter of given binary tree is : "
                + tree.diameter());
    }
}