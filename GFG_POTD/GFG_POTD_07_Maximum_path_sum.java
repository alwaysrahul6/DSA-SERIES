package GFG_POTD;
/*
 * Maximum path sum
 *
 * Q. Given the root of a binary tree, your task is to find the maximum path sum.
 *    The path may start and end at any node in the tree.\
 *    Examples:
 *    Input: root[] = [10, 2, -10, 20, 1]
 *
                10
               /  \
              2   -10
             / \
            20  1

 *
 *    Output: 42
 *    Explanation: Max path sum is represented using green colour nodes in the above binary tree.
 *
 *
 * */
public class GFG_POTD_07_Maximum_path_sum {

   static class Node{
        int data;
        Node left, right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }

    // ✅ Driver code
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(-10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);

        int maxSum = findMaxSum(root);
        System.out.println("Maximum Path Sum = " + maxSum);
    }

    // Solutions

       static int findMaxSum(Node root) {
        int []arr ={Integer
                .MIN_VALUE};

        solveNode(root , arr);
        return arr[0];
    }

    private static int solveNode(Node root, int[] arr) {
        if (root == null) return 0;

        int left = solveNode(root.left , arr);
        int right = solveNode(root.right , arr);

        int case1 = left + right + root.data;

        int case2 = Math.max(left , right) + root.data;

        int case3 = root.data;

        arr[0] = Math.max(arr[0],Math.max(case3 , Math.max(case1 , case2)));

        return Math.max(case2 , case3);
    }
}
