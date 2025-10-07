package TREE;
/* https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
 * Bottom View of Binary Tree
 *
 * Q.You are given the root of a binary tree, and your task is to return its bottom view.
 *   The bottom view of a binary tree is the set of nodes visible when the tree is viewed from the bottom.
 *   Note: If there are multiple bottom-most nodes for a horizontal distance from the root, then the latter one in the level order traversal is considered.
 *
 *   Examples :
 *   Input: root = [1, 2, 3, 4, 5, N, 6]
 *              1
 *             / \
 *            2   3
 *           / \   \
 *          4   5   6
 *   Output: [4, 2, 5, 3, 6]
 *   Explanation: The Green nodes represent the bottom view of below binary tree.
 * */

import java.util.*;

public class GFG_POTD_03_Bottom_View_of_Binary_Tree {
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

    static class Pair{
        Node node;
        int line;

        Pair(Node n , int l){
            this.node = n;
            this.line = l;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(20);
        Node a = new Node(8);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(16);
        Node e = new Node(19);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        e.right = null;
        d.right = null;
        d.left = null;
        System.out.println(bottomView(root));
    }

    public static ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();

        Map<Integer , Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root , 0));

        while (!queue.isEmpty()){
            Pair pair = queue.poll();

            Node node = pair.node;
            int line = pair.line;
            map.put(line , node.data);

            if (node.left != null){
                queue.add(new Pair(node.left , line - 1));
            }
            if (node.right != null){
                queue.add(new Pair(node.right , line + 1));
            }
        }

        for (int i :map.values()){
            res.add(i);
        }
        return res;

    }
}
