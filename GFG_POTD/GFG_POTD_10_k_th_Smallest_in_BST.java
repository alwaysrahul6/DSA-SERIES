package GFG_POTD;
/*
 * k-th Smallest in BST
 *
 * Q. Given the root of a BST and an integer k, the task is to find the
 *    kth smallest element in the BST. If there is no kth smallest element present
 *    then return -1
 * 
 * */
 /*
                 5
                / \
               3   7
              / \ / \
             2  4 6  8
        */
public class GFG_POTD_10_k_th_Smallest_in_BST {

   static class Node {
        int data;
        Node left, right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
///Driver Code
    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        int k = 3;
        int result = kthSmallest(root, k);
        if (result != -1)
            System.out.println("The " + k + "rd smallest element is: " + result);
        else
            System.out.println("Less than " + k + " nodes in the tree.");
    }
//Solution
    public static int kthSmallest(Node root, int k) {
        int ans = solveSmallest(root, new int[]{k});
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }

    private static int solveSmallest(Node root, int[] k) {
        if (root == null) return Integer.MAX_VALUE;
        int left = solveSmallest(root.left , k);
        k[0]--;
        if(k[0] == 0) return root.data;
        int right = solveSmallest(root.right , k);
        return Math.min(left, right);
    }
}
