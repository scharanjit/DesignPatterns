package datastructure.treeExample;

// Java program to find height of tree

// A binary tree NodeHeight
class NodeHeight {
    int data;
    NodeHeight left, right;

    NodeHeight(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTreeHeightHeight {
    NodeHeight root;

    /* Compute the "maxDepth" of a tree -- the number of 
       NodeHeights along the longest path from the root NodeHeight 
       down to the farthest leaf NodeHeight.*/
    int maxDepth(NodeHeight NodeHeight) {
        if (NodeHeight == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(NodeHeight.left);
            int rDepth = maxDepth(NodeHeight.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        BinaryTreeHeightHeight tree = new BinaryTreeHeightHeight();

        tree.root = new NodeHeight(1);
        tree.root.left = new NodeHeight(2);
        tree.root.right = new NodeHeight(3);
        tree.root.left.left = new NodeHeight(4);
        tree.root.left.right = new NodeHeight(5);

        System.out.println("Height of tree is : " +
                tree.maxDepth(tree.root));
    }
}
 