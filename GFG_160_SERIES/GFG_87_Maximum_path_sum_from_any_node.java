package GFG_160_SERIES;
/*      *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/maximum-path-sum-from-any-node
        *  Maximum path sum from any node
        *  Max path sum is represented using green colour nodes in the above binary tree.
        *  Given a binary tree, the task is to find the maximum path sum. The path may start and end at any node in the tree.
        *   Examples:
        *   Input: root[] = [10, 2, 10, 20, 1, N, -25, N, N, N, N, 3, 4]
        *   Output: 42
        *   Explanation:
        *    // Tree structure:
        *
        *             -17
        *            /    \
        *          11      4
        *         /  \    /
        *       20   -2  10
        */


public class GFG_87_Maximum_path_sum_from_any_node {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    static int find(Node node){
        int  res[]= {Integer.MIN_VALUE};
        findMaxSum(node,res);
        return res[0];
    }
   static int findMaxSum(Node node , int  res[]) {
        if (node == null)return 0;
        int lh = findMaxSum(node.left,res);
       int rh = findMaxSum(node.right,res);
        int temp = Math.max(Math.max(rh,lh)+ node.data, node.data);
        int ans = Math.max(temp,rh+lh+ node.data);
        res[0] = Math.max(res[0],ans);
        return temp;
    }

    public static void main(String[] args) {
        Node root = new Node(-17);
        Node a = new Node(11);
        Node b = new Node(4);
        Node c = new Node(20);
        Node d = new Node(-2);
        Node e = new Node(10);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        System.out.println(find(root));
    }
}
