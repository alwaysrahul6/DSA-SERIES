package GFG_160_SERIES;
/*      *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/diameter-of-binary-tree
        *   Diameter of a Binary Tree
        *
        *   Given a binary tree, the diameter (also known as the width) is defined as the number of edges on the longest path between two leaf nodes in the tree.
        *   his path may or may not pass through the root.
        *   Your task is to find the diameter of the tree.
        *   Input: root[] = [1, 2, 3]
        *   Output: 2
        *    1
        *   / \
        *  2   3
        *  Explanation: The longest path has 2 edges (node 2 -> node 1 -> node 3).*/
public class GFG_82_Diameter_of_a_Binary_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        /// Driver Code
        public static void main(String[] args) {
            Node root = new Node(2);
            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            root.left = a;
            root.right = b;
            a.left = c;
            a.right = d;
            System.out.println(diameter(root));
        }

        public static int diameter(Node root) {
            // Your code here
            int[] ans = new int[1];
            height(root, ans);
            return ans[0];
        }

        private static int height(Node root, int[] ans) {
            if (root == null) return 0;
            int lh = height(root.left, ans);
            int rh = height(root.right, ans);
            ans[0] = Math.max(ans[0], rh + lh);
            return Math.max(rh, lh) + 1;
        }
    }
}
