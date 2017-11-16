package datastructure.treeExample;


class NodeLCCA {

    int data;
    NodeLCCA left, right;

    public NodeLCCA(int value) {
        data = value;
        left = right = null;
    }
}

public class LowestCommonAncestorInTree {
    NodeLCCA root;

    static boolean v1, v2 = false;

    NodeLCCA findLCA(int n1, int n2) {

        v1 = false;
        v2 = false;

        // Find lca of n1 and n2 using the technique discussed above
        NodeLCCA lca = findLCAUtil(root, n1, n2);

        // Return LCA only if both n1 and n2 are present in tree
        if (v1 && v2)
            return lca;

        // Else return NULL
        return null;
    }


    NodeLCCA findLCAUtil(NodeLCCA node, int n1, int n2) {

        if (node == null) {
            return null;
        }
        if (node.data == n1) {
            v1 = true;
            return node;
        }

        if (node.data == n2) {
            v2 = true;
            return node;
        }

        NodeLCCA left_lca = findLCAUtil(node.left, n1, n2);
        NodeLCCA right_lca = findLCAUtil(node.right, n1, n2);


        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
        if (left_lca != null && right_lca != null)
            return node;

        // Otherwise check if left subtree or right subtree is LCA
        return (left_lca != null) ? left_lca : right_lca;

    }


    public static void main(String[] args) {
        LowestCommonAncestorInTree lowestCommonAncestorInTree = new LowestCommonAncestorInTree();

        lowestCommonAncestorInTree.root = new NodeLCCA(1);
        lowestCommonAncestorInTree.root.left = new NodeLCCA(2);
        lowestCommonAncestorInTree.root.right = new NodeLCCA(3);
        lowestCommonAncestorInTree.root.left.left = new NodeLCCA(4);
        lowestCommonAncestorInTree.root.left.right = new NodeLCCA(5);
        lowestCommonAncestorInTree.root.right.left = new NodeLCCA(6);
        lowestCommonAncestorInTree.root.right.right = new NodeLCCA(7);

        NodeLCCA lca = lowestCommonAncestorInTree.findLCA(4, 5);

        if (lca != null)
            System.out.println("LCA(4, 5) = " + lca.data);
        else
            System.out.println("Keys are not present");

        lca = lowestCommonAncestorInTree.findLCA(4, 10);
        if (lca != null)
            System.out.println("LCA(4, 10) = " + lca.data);
        else
            System.out.println("Keys are not present");

    }


}

//watch youtube video first  https://www.youtube.com/watch?v=13m9ZCB8gjw

