package GFG_160_SERIES;
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

public class GFG_83_MIRROR_TREE {
    /// Structure of the tree
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {

            this.val = val;
        }
    }

    /// Driver Code
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(3);
        Node b = new Node(4);
        root.left = a;
        root.right = b;
        Node c = new Node(20);
        Node d = new Node(30);
        a.left = c;
        a.right = d;
        mirror(root);
    }

    /// Solution
    private static void mirror(Node root) {
        if (root == null) return;
        mirror(root.left);
        mirror(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
