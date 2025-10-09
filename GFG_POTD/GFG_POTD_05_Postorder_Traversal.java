package GFG_POTD;
/*
 * https://www.geeksforgeeks.org/problems/postorder-traversal/1
 *
 * Postorder Traversal
 *
 * Q. Given the root of a Binary Tree, your task is to return its Postorder Traversal.
 *      Note: A postorder traversal first visits the left child (including its entire subtree), then visits the right child (including its entire subtree), and finally visits the node itself.
 *      Examples:
 *              Input: root = [19, 10, 8, 11, 13]
 *              Output: [11, 13, 10, 8, 19]
 *      Explanation: The postorder traversal of the given binary tree is [11, 13, 10, 8, 19].
 * */


import java.util.ArrayList;

public class GFG_POTD_05_Postorder_Traversal {

    static class Node {
        int data;
        Node left, right;
        Node(int val){
            data = val;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;

        ArrayList<Integer>  res = postOrder(root);

        for (int i : res){
            System.out.println(i);
        }

    }

    public static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        traversPost(root,  res);
        return res;
    }

    private static void traversPost(Node root, ArrayList<Integer> res) {
        if (root == null)return;
        traversPost(root.left , res);
        traversPost(root.right , res);
        res.add(root.data);
    }
}
