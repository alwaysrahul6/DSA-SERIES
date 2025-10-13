package TREE;
/*
 * https://www.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1
 *
 * Q. Sum of nodes on the longest path
 *
 *  Given a binary tree root[], you need to find the sum of the nodes on the longest path
 *  from the root to any leaf node. If two or more paths have the same length,
 *  the path with the maximum sum of node values should be considered.
 * Example:
 * Input: root[] = [4, 2, 5, 7, 1, 2, 3, N, N, 6, N]
 *        4
 *      /   \
 *     2     5
 *   /  \   / \
 *  7    1 2   3
 *        /
 *       6
 *
 * Output: 13
 * Explanation:
 *
 * */
public class Tree_Sum_of_nodes_on_the_longest_path {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(6);
        Node c = new Node(8);
        Node d = new Node(10);
        Node e = new Node(12);
        Node f = new Node(14);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        System.out.println(sumOfLongRootToLeafPath(root));
    }

    public static int sumOfLongRootToLeafPath(Node root) {
        int sum = 0;
        int maxSum[] = {0};
        int maxLength[] = {0};
        int length = 0;

        solveLargest(root , maxSum , sum , length , maxLength );
        return maxSum[0];

    }

    private static void solveLargest(Node root, int[] maxSum, int sum, int length, int[] maxLength) {
        if (root == null){
            if (length > maxLength[0]){
                maxSum[0] = sum;
                maxLength[0] = length;
            } else if (length == maxLength[0]) {
                maxSum[0] = Math.max(maxSum[0] , sum);
            }
            return;
        }
        sum+= root.data;
        solveLargest(root.left , maxSum , sum , length + 1, maxLength);
        solveLargest(root.right , maxSum , sum , length + 1, maxLength);
    }
}
