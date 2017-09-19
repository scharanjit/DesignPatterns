package datastructure.treeExample;

// A recursive Java program to calculate the size of the tree

/* Class containing left and right child of current
   NodeSize and key value*/
class NodeSize
{
    int data;
    NodeSize left, right;

    public NodeSize(int item)
    {
        data = item;
        left = right = null;
    }
}

/* Class to find size of Binary Tree */
class BinaryTreeSize
{
    NodeSize root;

    /* Given a binary tree. Print its NodeSizes in level order
       using array for implementing queue */
    int size()
    {
        return size(root);
    }

    /* computes number of NodeSizes in tree */
    int size(NodeSize NodeSize)
    {
        if (NodeSize == null)
            return 0;
        else
            return(size(NodeSize.left) + 1 + size(NodeSize.right));
    }

    public static void main(String args[])
    {
        /* creating a binary tree and entering the NodeSizes */
        BinaryTreeSize tree = new BinaryTreeSize();
        tree.root = new NodeSize(1);
        tree.root.left = new NodeSize(2);
        tree.root.right = new NodeSize(3);
        tree.root.left.left = new NodeSize(4);
        tree.root.left.right = new NodeSize(5);

        System.out.println("The size of binary tree is : "
                + tree.size());
    }
}