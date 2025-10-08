package GFG_POTD;

/* https://www.geeksforgeeks.org/problems/construct-tree-from-preorder-postorder/1
 * #. Construct Tree from Preorder & Postorder
 *
 * Q. Given two arrays pre[] and post[] that represent the preorder and postorder traversals of a full binary tree.
 *     Your task is to construct the binary tree and return its root.
 *     Note:  Full Binary Tree is a binary tree where every node has either 0 or 2 children. The preorder and postorder traversals contain unique values, and every value present in the preorder traversal is also found in the postorder traversal.
 *
 *     Examples:
 *     Input: pre[] = [1, 2, 4, 8, 9, 5, 3, 6, 7], post[] = [8, 9, 4, 5, 2, 6, 7, 3, 1]
 *     Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *     Explanation: The tree will look like
 * */

import java.util.HashMap;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
public class GFG_POTD_04_Construct_Tree_from_Preorder_Postorder {
    public static void main(String[] args) {
      int pre[] = {1, 2, 4, 8, 9, 5, 3, 6, 7};
      int post[] = {8, 9, 4, 5, 2, 6, 7, 3, 1};
        Node root = constructTree(pre, post);
        printPreorder(root);   // prints: 1 2 4 8 9 5 3 6 7
        System.out.println();
    }


    public static Node constructTree(int[] pre, int[] post) {
       int n = pre.length;
       HashMap<Integer , Integer> map = new HashMap<>();
       for (int i = 0; i < n; i++){
           map.put(post[i],i );
       }
       return construct(0 , 0 , n-1 , pre , post , map);

    }
    public static void printPreorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    private static Node construct(int preStart, int postStart, int preEnd, int[] pre, int[] post , HashMap<Integer , Integer>map) {
        if (preStart > preEnd){
            return null;
        }


        Node root = new Node(pre[preStart]);
        if (preStart == preEnd){
            return root;
        }
        int next = pre[preStart + 1];

        int j = map.get(next);

        int num = j - postStart+1;

        root.left = construct(preStart + 1 , postStart , preStart + num , pre , post, map );
        root.right = construct(preStart + num + 1 , j +1 , preEnd , pre , post , map);
        return root;
    }
}
