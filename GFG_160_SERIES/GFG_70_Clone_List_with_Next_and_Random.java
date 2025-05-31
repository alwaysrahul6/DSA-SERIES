package GFG_160_SERIES;
/*           https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/clone-a-linked-list-with-next-and-random-pointer            Clone List with Next and Random
 *       Q.  You are given a special linked list with n nodes where each node has two pointers a next pointer that points to the next node of the singly linked list, and a random pointer that points to the random node of the linked list.
 *        Construct a copy of this linked list. The copy should consist of the same number of new nodes, where each new node has the value corresponding to its original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list, such that it also represent the same list state. None of the pointers in the new list should point to nodes in the original list.
 *        Return the head of the copied linked list.
 *        NOTE : Original linked list should remain unchanged.
 *        Examples:
 *        Input: head = [[1, 3], [3, 3], [5, NULL], [9, 3]]
 */

import java.util.HashMap;

public class GFG_70_Clone_List_with_Next_and_Random {

    /// Structure
    private static class Node {
        int data;
        Node next;
        Node random;

        Node(int x) {
            data = x;
            next = null;
            random = null;
        }
    }

    /// main Method
    public static void main(String[] args) {
        // Create list: 10 -> 20 -> 30 -> 40
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Set random pointers
        n1.random = n3; // 10 -> 30
        n2.random = n1; // 20 -> 10
        n3.random = n4; // 30 -> 40
        n4.random = n2; // 40 -> 20

        // Clone the list
        Node clonedHead = cloneLinkedList(n1);

        // Print both lists
        System.out.println("Original List:");
        printList(n1);

        System.out.println("\nCloned List:");
        printList(clonedHead);
    }

    // Print helper function
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            int randomData = (temp.random != null) ? temp.random.data : -1;
            System.out.println("Node: " + temp.data + ", Random: " + randomData);
            temp = temp.next;
        }
    }


    /// Solution
  /// Method 1 using Hashmap 
    public static Node cloneLinkedList1(Node head) {
        // rand ()
        Node temp = head;
        HashMap<Node, Node> map = new HashMap<>();

        while (temp != null) {
            map.put(temp, new Node(temp.data));
            temp = temp.next;
        }

        for (Node n : map.keySet()) {
            Node t1 = map.get(n);
            Node t2 = map.get(n.next);
            Node t3 = map.get(n.random);
            t1.next = t2;
            t1.random = t3;
        }

        return map.get(head);
    }

    /// method 2 in using to between in the Node

    static Node cloneLinkedList(Node head) {
        insertcopy(head);
        connectrandom(head);
        return getlist(head);
    }

    static void insertcopy(Node head) {
        /// Create a Copy node  in between the two node
        Node temp = head;
        while (temp != null) {
            Node ans = new Node(temp.data);
            ans.next = temp.next;
            temp.next = ans;
            temp = temp.next.next;
        }
    }

    /// Connect random Pointer

    static void connectrandom(Node head) {
        Node temp = head;
        while (temp != null) {
            Node copynode = temp.next;
            if (temp.random != null) {
                copynode.random = temp.random.next;
            } else {
                copynode.random = null;
            }
            temp = temp.next.next;
        }
    }

    /// Seprating a list

    static Node getlist(Node head) {
        Node temp = head;
        Node dummy = new Node(-1);
        Node res = dummy;
        while (temp != null) {
            res.next = temp.next;
            temp.next = temp.next.next;
            res = res.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}
