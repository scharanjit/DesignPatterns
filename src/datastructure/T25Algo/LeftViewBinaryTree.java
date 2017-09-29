package datastructure.T25Algo;

class NodeBTL {
    int item;
    NodeBTL left, right;

    NodeBTL(int value) {
        item = value;
        left = right = null;
    }
}

public class LeftViewBinaryTree {

    NodeBTL root;

    int max_level = 0;

    void leftViewUtil(NodeBTL node, int level) {
        if (node == null) {
            return;
        }

        if (max_level < level) {
            System.out.println(" " + node.item);
            max_level = level;
        }

        leftViewUtil(node.left, level + 1);    //update left=>right &
        leftViewUtil(node.right, level + 1);  // right =>left will give right view of tree

    }

    void leftView() {
        leftViewUtil(root, 1);
    }

    public static void main(String[] args) {
        LeftViewBinaryTree leftViewBinaryTree = new LeftViewBinaryTree();
        leftViewBinaryTree.root = new NodeBTL(10);
        leftViewBinaryTree.root.left = new NodeBTL(20);
        leftViewBinaryTree.root.right = new NodeBTL(30);
        leftViewBinaryTree.root.left.left = new NodeBTL(40);
        leftViewBinaryTree.root.left.right = new NodeBTL(50);

        leftViewBinaryTree.leftView();


    }
}
