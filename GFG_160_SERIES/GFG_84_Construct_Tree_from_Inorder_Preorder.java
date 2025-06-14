package GFG_160_SERIES;
/*      *    Construct Tree from Inorder & Preorder
        *    Given two arrays representing the inorder and preorder traversals of a binary tree, construct the tree and return the root node of the constructed tree.
        *    Note: The output is written in postorder traversal.
        *    Examples:
        *    Input: inorder[] = [1, 6, 8, 7], preorder[] = [1, 6, 7, 8]
        *    Output: [8, 7, 6, 1]
        *    Explanation: The tree will look like
        *       1
            *    \
            *     6
            *      \
            *       7
            *       /
                   8
            */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class GFG_84_Construct_Tree_from_Inorder_Preorder {
   static class Node {
        int data;
        Node left, right;

        Node(int key) {
            data = key;
            left = right = null;
        }
    }
    /// Driver Code
    public static void main(String[] args) {

        int[] inorder = {9, 3, 15, 20, 7};
        int[] preorder = {3, 9, 20, 15, 7};
        Node root = buildTree(inorder, preorder);

        System.out.println("Level Order Traversal:");
        printLevelOrder(root);
    }

  private   static void printLevelOrder(Node root) {
        if (root == null) {
            System.out.print("N ");
            return;
        }

        Queue<Node> qq = new LinkedList<>();
        qq.add(root);
        int nonNull = 1;

        while (!qq.isEmpty() && nonNull > 0) {
            Node curr = qq.poll();

            if (curr == null) {
                System.out.print("N ");
                continue;
            }
            nonNull--;

            System.out.print(curr.data + " ");
            qq.add(curr.left);
            qq.add(curr.right);
            if (curr.left != null)
                nonNull++;
            if (curr.right != null)
                nonNull++;
        }
    }

    // Recursive function to build the binary tree.
   private static Node buildTreeRecur(Map<Integer, Integer> mp, int[] preorder,
                               int[] preIndex, int left, int right) {

        // For empty inorder array, return null
        if (left > right)
            return null;

        int rootVal = preorder[preIndex[0]];
        preIndex[0]++;

        // create the root Node
        Node root = new Node(rootVal);

        // find the index of Root element in the in-order array.
        int index = mp.get(rootVal);

        // Recursively create the left and right subtree.
        root.left = buildTreeRecur(mp, preorder, preIndex, left, index - 1);
        root.right = buildTreeRecur(mp, preorder, preIndex, index + 1, right);

        return root;
    }

    // Function to construct tree from its inorder and preorder traversals
    private static Node buildTree(int[] inorder, int[] preorder) {

        // Hash map that stores index of a root element in inorder array
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            mp.put(inorder[i], i);

        int[] preIndex = {0};
        return buildTreeRecur(mp, preorder, preIndex, 0, inorder.length - 1);
    }
}
