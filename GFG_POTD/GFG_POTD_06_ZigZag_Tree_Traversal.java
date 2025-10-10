package GFG_POTD;/*
 * https://www.geeksforgeeks.org/problems/zigzag-tree-traversal/1
 *
 * Q. Given the root of a binary tree. You have to find the zig-zag level order traversal of the binary tree.
 *    Note: In zig zag traversal we traverse the nodes from left to right for odd-numbered levels, and from right to left for even-numbered levels.
 *    Examples: Input: root = [1, 2, 3, 4, 5, 6, 7]
 *            1
 *           / \
 *          2   3
 *         / \ / \
 *        4  5 6  7
 *      Output: [1, 3, 2, 4, 5, 6, 7]
 *      Explanation:
 *      Level 1 (left to right): [1]
 *      Level 2 (right to left): [3, 2]
 *      Level 3 (left to right): [4, 5, 6, 7]
 *      Final result: [1, 3, 2, 4, 5, 6, 7]
 *
 * */

import java.util.*;

public class GFG_POTD_06_ZigZag_Tree_Traversal {
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(8);
        Node c = new Node(10);

        root.left = a;
        root.right = b;
        a.left = c;

        ArrayList<Integer> temp = zigZagTraversal(root);
        for (int i : temp){
            System.out.print(i + " ");
        }
    }

   static ArrayList<Integer> zigZagTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()){
            int size = queue.size();
            Stack<Node> stack = new Stack<>();

            for (int i = 0;  i < size; i++){
                Node Tree = queue.poll();
                if (flag) stack.push(Tree);
                else list.add(Tree.data);
                if (Tree.left != null) queue.add(Tree.left);
                if (Tree.right != null) queue.add(Tree.right);
                }
            flag =! flag;
                while (!stack.isEmpty()){
                    Node node = stack.pop();
                    list.add(node.data);
                }
            }
        return list;
    }
}
