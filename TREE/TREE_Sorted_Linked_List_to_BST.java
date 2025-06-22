package TREE;
/**https://www.geeksforgeeks.org/problems/sorted-list-to-bst/1
 *  Sorted Linked List to BST
 *  Given a Singly Linked List which has data members sorted in ascending order.
 *  Construct a Balanced Binary Search Tree which has same data members as the given Linked List.
 *  Note: There might be nodes with the same value.
 *  Input: Linked List: 1->2->3->4->5->6->7
 * Output: 4 2 1 3 6 5 7
 *  Explanation : The BST formed using elements of the linked list is -
 *                   4
 *                 /   \
 *                2     6
 *              /  \   / \
 *             1   3  5   7
 *           Hence, preorder traversal of this tree is 4 2 1 3 6 5 7
 * */

import java.util.ArrayList;

public class TREE_Sorted_Linked_List_to_BST {
    //Linked List Node
    static class LNode {
        int data;
        LNode next;

        LNode(int d) {
            data = d;
            next = null;
        }
    }

    //Tree Node
    static class TNode {
        int data;
        TNode left, right;

        TNode(int x) {
            data = x;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        /// Step 1: Create the Linked List: 1 → 2 → 3 → 4 → 5 → 6 → 7
        LNode head = new LNode(1);
        head.next = new LNode(2);
        head.next.next = new LNode(3);
        head.next.next.next = new LNode(4);
        head.next.next.next.next = new LNode(5);
        head.next.next.next.next.next = new LNode(6);
        head.next.next.next.next.next.next = new LNode(7);

        // Step 2: Convert to Balanced BST
        TNode root = sortedListToBST(head); // Static method call, no object

        // Step 3: Print Preorder Traversal of BST
        System.out.println("Preorder Traversal of BST:");
        preorder(root);
    }

    // Static preorder traversal method
    public static void preorder(TNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static TNode sortedListToBST(LNode head) {
        // code here
        ArrayList<Integer> tree = new ArrayList<>();
        while (head != null) {
            tree.add(head.data);
            head = head.next;
        }
        return bst(tree, 0, tree.size() - 1);
    }

    public static TNode bst(ArrayList<Integer> tree, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start + 1) / 2;
        TNode root = new TNode(tree.get(mid));
        root.left = bst(tree, start, mid - 1);
        root.right = bst(tree, mid + 1, end);
        return root;
    }

}
