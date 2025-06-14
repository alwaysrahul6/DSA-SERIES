package TREE;
/*      *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/mirror-tree
        *   Mirror Tree
        *   Given a binary tree, convert the binary tree to its Mirror tree.
        *   Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.
        *   Examples:
        *   Input: root[] = [1, 2, 3, N, N, 4]
        *   Output: [1, 3, 2, N, 4]
        *     1
        *    / \
        *   2   3
        *      /
               4
        *   mirror is
        *      1
        *     / \
        *    3   2
        *     \
        *      4
        *       */


public class TREE_MIRROR {
    static class Node {
        int val;
        Node left;
        Node right;
       public Node(int val){

              this.val  = val;
        }
    }
    /// Driver Code
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(10);
        Node b = new Node(20);
        root.left = a;
        root.right = b;
        mirror(root);

    }
    /// Solution
    static void mirror(Node root){
       if (root == null)return;
       mirror(root.left);
       mirror(root.right);
       Node temp = root.left;
       root.left = root.right;
       root.right = temp;
    }
}
