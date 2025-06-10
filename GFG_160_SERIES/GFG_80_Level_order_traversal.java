package GFG_160_SERIES;
/*  *
    *  Given a root of a binary tree with n nodes, the task is to find its level order traversal.
    *  Level order traversal of a tree is breadth-first traversal for the tree.
    *           5
               / \
             12   13
            /  \    \
           7    14   2
         /  \   /  \  / \
        17 23 27    3 8 11
     *  Output : 5 12 13 7 14 2 17 23 27 3  8 11*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GFG_80_Level_order_traversal {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(7);
        root.left.right = new Node(14);

        root.right.right = new Node(2);

        root.left.left.left = new Node(17);
        root.left.left.right = new Node(23);

        root.left.right.left = new Node(27);
        root.left.right.right = new Node(3);

        root.right.right.left = new Node(8);
        root.right.right.right = new Node(11);

        // Perform level order traversal and get the result
        ArrayList<ArrayList<Integer>> res = levelOrder(root);

        // Print the result in the required format
        for (List<Integer> level : res) {
            System.out.print("[");
            for (int i = 0; i < level.size(); i++) {
                System.out.print(level.get(i));
                if (i < level.size() - 1) System.out.print(", ");
            }
            System.out.print("] ");
        }
    }


    public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        if (root == null)
            return new ArrayList<>();

        // Create an empty queue for level order traversal
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        // Enqueue Root
        q.offer(root);
        int currLevel = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            res.add(new ArrayList<>());

            for (int i = 0; i < len; i++) {
                // Add front of queue and remove it from queue
                Node node = q.poll();
                res.get(currLevel).add(node.data);

                // Enqueue left child
                if (node.left != null)
                    q.offer(node.left);

                // Enqueue right child
                if (node.right != null)
                    q.offer(node.right);
            }
            currLevel++;
        }
        return res;
    }
}

