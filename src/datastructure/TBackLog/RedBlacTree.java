package datastructure.TBackLog;

/**
 * A red–black tree is a kind of self-balancing binary search tree.
 * Each node of the binary tree has an extra bit, and that bit is often
 * interpreted as the color (red or black) of the node. These color bits
 * are used to ensure the tree remains approximately balanced during
 * insertions and deletions
 * <p>
 * 1) Every node has a color either red or black.
 * <p>
 * 2) Root of tree is always black.
 * <p>
 * 3) There are no two adjacent red nodes (A red node cannot have a red parent or red child).
 * <p>
 * 4) Every path from root to a NULL node has same number of black nodes.
 * <p>
 * The AVL trees are more balanced compared to Red Black Trees, but they may
 * cause more rotations during insertion and deletion. So if your application
 * involves many frequent insertions and deletions, then Red Black trees should be
 * preferred. And if the insertions and deletions are less frequent and search is more
 * frequent operation, then AVL tree should be preferred over Red Black Tree.
 * <p>
 * <p>
 * In the version 8 of Java, the Collection HashMap has been modified such
 * that instead of using a LinkedList to store different elements with
 * colliding hashcodes, a Red-Black tree is used.
 * This results in the improvement of time complexity of searching such
 * an element from O(n) to O(log n).
 * <p>
 * The balancing of the tree is not perfect, but it is good enough to allow
 * it to guarantee searching in O(log n) time, where n is the total number
 * of elements in the tree. The insertion and deletion operations, along
 * with the tree rearrangement and recoloring, are also performed in O(log n) time
 */
public class RedBlacTree {
}
