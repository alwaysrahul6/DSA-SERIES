package GFG_160_SERIES;

/*      *    Check for BST.
 *    Given the root of a binary tree. Check whether it is a BST or not.
 *    Note: We are considering that BSTs can not contain duplicate Nodes.
 *    A BST is defined as follows:
 *    The left subtree of a node contains only nodes with keys less than the node's key.
 *    The right subtree of a node contains only nodes with keys greater than the node's key.
 *    Both the left and right subtrees must also be binary search trees.

 * Example Input: root = [2, 1, 3, N, N, N, 5]
 *
 *               2
 *              / \
 *             1   3
 *                    \
 *                     5
 *      Output: True
 * */
public class GFG_89_Check_for_BST {
    static class Node {
        int data;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
            this.left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(5);
        isBST(root);

    }

    static boolean isBST(Node root) {
        // code here.
        return isBSTutil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private static boolean isBSTutil(Node root, int minValue, int maxValue) {
        if (root == null) return true;

        if (root.data < minValue || root.data > maxValue) return false;
        return isBSTutil(root.left, minValue, root.data - 1) && isBSTutil(root.right, root.data + 1, maxValue);
    }
}
