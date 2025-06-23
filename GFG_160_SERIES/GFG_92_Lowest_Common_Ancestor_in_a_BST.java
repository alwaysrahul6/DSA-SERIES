package GFG_160_SERIES;

/**
 * Lowest Common Ancestor in a BST
 * Given a Binary Search Tree (with all values unique) and two nodes n1 and n2 (n1 != n2).
 * You may assume that both nodes exist in the tree. Find the Lowest Common Ancestor (LCA) of the given two nodes in the BST.
 * LCA between two nodes n1 and n2 is defined as the lowest node that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).
 * 4
 * *                 /   \
 * *                2     6
 * *              /  \   / \
 * *             1   3  5   7
 * *  n1 = 1 and n2  = 3
 * *  output  = 2
 */
public class GFG_92_Lowest_Common_Ancestor_in_a_BST {
    static class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
/// Driver Code
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(1);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        System.out.println(LCA(root, n1, n2).data);
    }
/// Reccursive Solution
/// Time and Space Complexity O(n) and O(h)
    static Node LCA(Node root, Node n1, Node n2) {
        if (root == null) return root;
        if (root.data == n1.data || root.data == n2.data) return root;
        Node Leftans = LCA(root.left, n1, n2);
        Node Rightans = LCA(root.right, n1, n2);
        if (Leftans != null && Rightans != null) return root;
        else if (Rightans != null) {
            return Rightans;
        } else return Leftans;
    }

    /// Iterative Solution
    /// Time and Space Complexity O(n) and O(1)
    static Node LCAA(Node root,Node n1, Node n2){
        while (root != null){
            if (n1.data < root.data && n2.data < root.data){
                root = root.left;
            } else if (n1.data > root.data && n2.data > root.data) {
                root = root.right;
            }else return root;
        }
        return null;
    }
}
