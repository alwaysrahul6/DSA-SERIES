package TREE;
/*      *    https://www.geeksforgeeks.org/problems/symmetric-tree/1
        *    Symmetric Tree
        *    Given the root of a binary tree, check whether it is symmetric, i.e., whether the tree is a mirror image of itself.
        *    A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.
        *    Examples:
        *    Input: root[] = [1, 2, 2, 3, 4, 4, 3]
        *                   1
        *                 /  \
        *                2     2
        *               / \    / \
        *              3  4    4   3*/
public class TREE_Symmetric_Tree {
    /// Structure of the tree
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    /// Driver code of the tree
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(4);
        Node f = new Node(3);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        System.out.println(isSymmetric(root));
    }
    /// Solution
    public static boolean isSymmetric(Node root) {
        // Code here
        if (root == null)return true;
//        return  isMirror(root.left, root.right);
        return  ismir(root.left, root.right);
    }

    private static boolean isMirror(Node left, Node right) {
       if (left == null && right == null)return true;
       if (left == null || right == null)return false;
       return (left.data == right.data)
               && isMirror(left.left, right.right)
               && isMirror(left.right, right.left);
    }
    private static boolean ismir(Node left, Node right) {
       if (left == null && right == null)return true;
       if (left == null || right == null)return false;
       ismir(left.left, right.right);
       ismir(left.right,right.left);
       return left.data == right.data;
    }


}
