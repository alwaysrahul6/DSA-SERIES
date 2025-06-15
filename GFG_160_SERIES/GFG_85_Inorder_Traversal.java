package GFG_160_SERIES;
/*      *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/inorder-traversal
        *   Inorder Traversal
        *   Given a Binary Tree, your task is to return its In-Order Traversal.
        *   An inorder traversal first visits the left child (including its entire subtree), then visits the node, and finally visits the right child (including its entire subtree).
        *   Follow Up: Try solving this with O(1) auxiliary space.
        *   Examples:
        *   Input: root[] = [1, 2, 3, 4, 5] */
import java.util.ArrayList;

public class GFG_84_Inorder_Traversal {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
  /// Driver Code 
   public static void main(String[] args) {
        Node root = new Node(10);
        Node a  = new Node(2);
        Node b  = new Node(2);
        Node c  = new Node(2);
        Node d  = new Node(2);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        System.out.println(inOrder(root));
    }
/// Solution
    static ArrayList<Integer> inOrder(Node root) {
        // Code
       ArrayList<Integer> ans = new ArrayList<>();
       helperinorder(root,ans);
       return ans;
    }
    private static void helperinorder(Node root, ArrayList<Integer> ans) {
        if (root == null)return;
        helperinorder(root.left,ans);
        ans.add(root.data);
        helperinorder(root.right,ans);
    }
}
