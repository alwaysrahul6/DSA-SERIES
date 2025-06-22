package GFG_160_SERIES;
/*  *   Fixing Two nodes of a BST
    *   Given the root of a Binary search tree(BST), where exactly two nodes were swapped by mistake. Your task is to fix (or correct) the BST by swapping them back. Do not change the structure of the tree.
    *   Note: It is guaranteed that the given input will form BST, except for 2 nodes that will be wrong.
    *   All changes must be reflected in the original Binary search tree(BST).
    * Input: root = [10, 5, 8, 2, 20]
 */ 
// Constructing a BST where 8 and 20 are swapped
        /*
                 10
                /  \
               5    8    <- 8 and 20 are swapped
              / \
             2   20
        */

public class GFG_92_Fixing_Two_nodes_of_a_BST {


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
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(8);        // Should be 20
        root.left.left = new Node(2);
        root.left.right = new Node(20);  // Should be 8

        System.out.println("Inorder Traversal Before Fixing:");
        printInorder(root);
        System.out.println();

        correctBST(root);  // Static call, no object

        System.out.println("Inorder Traversal After Fixing:");
        printInorder(root);
        System.out.println();
    }

    // Utility to print inorder
    public static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    static Node first = null, second = null, prev = null;

    public static void correctBST(Node root) {
        inorder(root);
        if (first != null && second != null) {
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);

        if (prev != null && prev.data > root.data) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }
        prev = root;
        inorder(root.right);
    }
}
