package datastructure.greedyalgo;

// Java program to construct a tree using inorder
// and postorder traversals

/*
*
* Post is left right root
* InOrder is left root right
*
* so last element of post order is root
* find its index value in Inorder
* left to index value bcms left and right to index bcms right
*
* recursion
*
* */


class NodeMx{
    int root;
    NodeMx left, right;
    public NodeMx(int item){


        root=item;
        left=right=null;
    }
}

class Index{
    int index;
}

public class BinaryTreeFromInorderAndPostOrder {


    NodeMx buiUtil(int in[],int post[],int inStart, int inEnd,Index pIndex){
        if(inStart>inEnd){
            return null;
        }

        NodeMx nodeMx = new NodeMx(post[pIndex.index]);
        (pIndex.index)--;

        if(inStart==inEnd){
            return  nodeMx;
        }

        int inIndex = search(in,inStart,inEnd,nodeMx.root);


//        nodeMx.right=buiUtil(in,post,inIndex+1,inEnd,pIndex);
        nodeMx.right=buiUtil(in,post,inIndex+1,inEnd,pIndex);
        nodeMx.left=buiUtil(in,post,inStart,inIndex-1,pIndex);
        return nodeMx;



    }

    int search(int in[],int inStart, int inEnd, int value){
        int i;

        for(i=inStart;i<=inEnd;i++){
            if(in[i]==value){
                return i;
            }
        }

        return i;
    }

    NodeMx buildTree(int in[],int post[],int len){
            Index pIndex= new Index();

            pIndex.index=len-1;

        return buiUtil(in,post,0,len-1,pIndex);
    }

    void preOrder(NodeMx node){
        if(node==null){
            return;
        }
        System.out.println(node.root);
       preOrder( node.left);
       preOrder( node.right);


    }
    public static void main(String[] args) {
        
        int in[] = new int[]{4, 8, 2, 5, 1, 6, 3, 7};
        int post[] = new int[]{8, 4, 5, 2, 6, 7, 3, 1};
        int len = in.length;
        BinaryTreeFromInorderAndPostOrder binaryTreeFromInorderAndPostOrder = new BinaryTreeFromInorderAndPostOrder();
      NodeMx root=  binaryTreeFromInorderAndPostOrder.buildTree(in,post,len);
        
        binaryTreeFromInorderAndPostOrder.preOrder(root);
    }

}
