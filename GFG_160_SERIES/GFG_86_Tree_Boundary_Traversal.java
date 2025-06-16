package GFG_160_SERIES;
/*      *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/boundary-traversal-of-binary-tree
        *  Tree Boundary Traversal
        *  Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order:
        *  Left Boundary: This includes all the nodes on the path from the root to the leftmost leaf node. You must prefer the left child over the right child when traversing. Do not include leaf nodes in this section.
        *  Leaf Nodes: All leaf nodes, in left-to-right order, that are not part of the left or right boundary.
        *  Reverse Right Boundary: This includes all the nodes on the path from the rightmost leaf node to the root, traversed in reverse order. You must prefer the right child over the left child when traversing. Do not include the root in this section if it was already included in the left boundary.
        *                          *   [1]
        *                             /     \
        *                          [2]       [3]
        *                         /   \     /   \
        *                       [4]  [5]  [6]   [7]
        *                           /  \
        *                        [8]  [9]
        *  Example : Input: root[] = [1, 2, 3, 4, 5, 6, 7, N, N, 8, 9, N, N, N, N]
        *  Output: [1, 2, 4, 8, 9, 6, 7, 3]
        * */
import java.util.ArrayList;
import java.util.Stack;

public class GFG_86_Tree_Boundary_Traversal {
    /// Structure of Tree
    static class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
/// Driver Code
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(12);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        d.left = e;
        b.right = f;
        ArrayList<Integer>res = boundaryTraversal(root);
        System.out.println(res);

    }

    /// Solution

    static ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if (!isleaf(node)) {
            res.add(node.data);
        }
        insertLeft(res, node);
        insertleaf(res, node);
        insertRight(res, node);
        return res;
    }
/// Insert LeftSubtree
   static void insertLeft(ArrayList<Integer> res, Node node) {
        Node ln = node.left;
        while (ln != null) {
            if (isleaf(ln)) {
                break;
            }
            res.add(ln.data);
            if (ln.left != null) {
                ln = ln.left;
            } else ln = ln.right;
        }
    }
    /// Insert RightSubtree

   static void insertRight(ArrayList<Integer> res, Node node) {
        Node rn = node.right;
        Stack<Integer> stack = new Stack<>();
        while (rn != null) {
            if (isleaf(rn)) {
                break;
            }
            stack.push(rn.data);
            if (rn.right != null) {
                rn = rn.right;
            } else rn = rn.left;
        }
        while (!stack.isEmpty()) res.add(stack.pop());
    }
/// Insert Leaf Node
   static void insertleaf(ArrayList<Integer> res, Node node) {
        if (node == null) return;

        insertleaf(res, node.left);
        if (isleaf(node)) {
            res.add(node.data);
        }
        insertleaf(res, node.right);
    }
/// check is leafNode  or not
    private static boolean isleaf(Node node) {
        return node.left == null && node.right == null;
    }
}
