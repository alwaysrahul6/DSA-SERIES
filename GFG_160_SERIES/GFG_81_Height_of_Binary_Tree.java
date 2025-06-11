package GFG_160_SERIES;
/*      *  Height of Binary Tree
        *  Given a binary tree, find its height.
        *
        *  The height of a tree is defined as the number of edges on the longest path from the root to a leaf node.
        *  A leaf node is a node that does not have any children.
        *
        * Example : 12
        *           / \
        *          8   18
        *         / \ 
        *        5   11
        * 
        * Output = 2
        * */
public class GFG_81_Height_of_Binary_Tree {
  ///  Structure of Tree
    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
/// Driver Code 
    public static void main(String[] args) {
        Node root = new Node(12);
        Node a = new Node(8);
        Node b = new Node(18);
        root.left = a;
        root.right = b;
        Node c = new Node(5);
        Node d = new Node(11);
        a.left = c;
        a.right = d;
        System.out.println(height(root));
    }
  /// Solution
   static int height(Node node) {
        if (node == null || (node.left == null && node.right  == null))return 0;
        return 1 + Math.max(height(node.left),height(node.right));
    }
}
