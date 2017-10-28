package datastructure.treeExample;
// Java program to construct a tree using inorder and preorder traversal

/* A binary tree NodeI has data, pointer to left child
   and a pointer to right child

   => Create buildTree method
   => Pass the inOrder ele, PreOrder element , 0 & len-1 of Inorder

   inside it


   first do check if start>end return null
        NodeI tNodeI = new NodeI(pre[pereI++])
            if (inS= end) return tNodeI
        int InIndes= search find index

        NodeI.left= recursion buildTree
        NodeI.left= recursion buldtree

   */
class NodeI {
    char root;
    NodeI left, right;

    public NodeI(char item) {
        root = item;
        left = right = null;
    }
}

class BinaryTreeFromInorderAndPreOrder {
    NodeI root;
    int preIndex = 0;

    NodeI buildTree(char in[], char pre[], int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        NodeI tNodeI = new NodeI(pre[preIndex++]);

        if (inStart == inEnd) {
            return tNodeI;
        }

//        int indexSearch = search(pre, inStart, inEnd, tNodeI.root);
        int indexSearch = search(in, inStart, inEnd, tNodeI.root);

        tNodeI.left = buildTree(in, pre, inStart, indexSearch - 1);
        tNodeI.right = buildTree(in, pre, indexSearch + 1, inEnd);

        return tNodeI;

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

    void printInorder(NodeI NodeI) {
        if (NodeI == null) {
            return;
        }
        printInorder(NodeI.left);
        System.out.println(NodeI.root);
        printInorder(NodeI.right);
    }

    public static void main(String[] args) {
        BinaryTreeFromInorderAndPreOrder binaryTreeFromInorderAndPreOrder = new BinaryTreeFromInorderAndPreOrder();
        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};

        int lenght = in.length;
        NodeI root = binaryTreeFromInorderAndPreOrder.buildTree(in, pre, 0, lenght - 1);
        binaryTreeFromInorderAndPreOrder.printInorder(root);
    }

}

