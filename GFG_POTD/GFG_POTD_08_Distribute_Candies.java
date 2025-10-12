package GFG_POTD;
/* https://www.geeksforgeeks.org/problems/distribute-candies-in-a-binary-tree/1
 * #.Distribute Candies
 *
 * Q. You are given the root of a binary tree with n nodes, where each node contains a certain number of candies, and the total number of candies across all nodes is n. In one move, you can select any two adjacent nodes and transfer one candy from one node to the other. The transfer can occur between a parent and child in either direction.
 *    The task is to determine the minimum number of moves required to ensure that every node in the tree has exactly one candy.
 *    Note: The testcases are framed such that it is always possible to achieve a configuration in which every node has exactly one candy, after some moves.
 *    Examples:
 *    Input: root = [5, 0, 0, N, N, 0, 0]
 *
 *  Output: 6
 *  Explanation:
 *  Move 1 candy from root to left child
 *  Move 1 candy from root to right child
 *  Move 1 candy from right child to root->right->left node
 *  Move 1 candy from root to right child
 *  Move 1 candy from right child to root->right->right node
 *  Move 1 candy from root to right child
 *  so, total 6 moves required.
 *
 * */


public class GFG_POTD_08_Distribute_Candies {

   static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(5);
        Node a = new Node(0);
        Node b = new Node(0);
        Node c = new Node(0);
        Node d = new Node(0);
        Node e = new Node(0);
        Node f = new Node(0);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        System.out.println(distCandy(root));
    }

// Solutions

    public static int distCandy(Node root) {
        int ans[] = {0};
       solvedistCandy(root , ans);
       return ans[0];

    }

    private static int solvedistCandy(Node root, int[] ans) {
        if (root == null)return 0;

        int left = solvedistCandy(root.left , ans);
        int right = solvedistCandy(root.right ,ans);

        ans[0] += Math.abs(left) + Math.abs(right);

        return (left + right + root.data) - 1;
    }
}
