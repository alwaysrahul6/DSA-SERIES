package GFG_160_SERIES;

import java.util.ArrayList;
/*      *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/serialize-and-deserialize-a-binary-tree
        *   Serialize and deserialize a binary tree
        *   Serialization is to store a tree in an array so that it can be later restored and deserialization is reading tree back from the array.
        *   Complete the functions
        *   serialize() : stores the tree into an array a and returns the array.
        *   deSerialize() : deserializes the array to the tree and returns the root of the tree.
        *   Note: Multiple nodes can have the same data and the node values are always positive integers.
        *   Your code will be correct if the tree returned by deSerialize(serialize(input_tree)) is same as the input tree.
        *   Driver code will print the in-order traversal of the tree returned by deSerialize(serialize(input_tree)).
        *    /*
        *     1
        *    / \
        *   2   3
        *      / \
        *     4   5

       * Examples :
       * Input: root = [1, 2, 3].
       * Output: [2, 1, 3]
 */


public class GFG_94_Serialize_and_deserialize_a_binary_tree {

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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        // Serialize
        ArrayList<Integer> serializedTree = serialize(root);
        System.out.println("Serialized Tree: " + serializedTree);

        // Reset index before deserializing
        i = 0;

        // Deserialize
        Node deserializedRoot = deSerialize(serializedTree);

        // Print inorder of deserialized tree
        System.out.print("Inorder of Deserialized Tree: ");
        inorderPrint(deserializedRoot);
    }

    /// Printing Function OF a tree

    public static void inorderPrint(Node root) {
        if (root == null) return;
        inorderPrint(root.left);
        System.out.print(root.data + " ");
        inorderPrint(root.right);
    }


    public static void preorder(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            ans.add(-1);
            return;
        }
        ans.add(root.data);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }


    public static ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

    static int i = 0;

    public static Node deSerialize(ArrayList<Integer> arr) {

        int val = arr.get(i++);
        if (val == -1) return null;
        Node tree = new Node(val);
        tree.left = deSerialize(arr);
        tree.right = deSerialize(arr);
        return tree;
    }
}
