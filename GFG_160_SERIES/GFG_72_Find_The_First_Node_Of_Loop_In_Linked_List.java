/*    /*
 * Given a head of the singly linked list. If a loop is present in the list then return the first node of the loop else return NULL.
 *
 * Custom Input format:
 * A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to.
 * If pos = 0, it means the last node points to null, indicating there is no loop.
 *
 * Example:
 * Let the linked list be:
 *
 *      10 → 20 → 30 → 40
 *                  ↑   ↓
 *                  ← ← ←
 *
 * pos = 1 means the last node (40) points back to the first node (10), forming a loop.
 *
 * Output: Node with value 10 (start of the loop)
 *
 * If:
 *      10 → 20 → 30 → 40 → null
 *
 * pos = 0 (no loop)
 *
 * Output: null
 */
package GFG_160_SERIES;

import java.util.HashSet;

public class GFG_72_Find_The_First_Node_Of_Loop_In_Linked_List {
    /// Structure Of a Node.

     static class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}
/// Main Method
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = a;
        Node result = firstloop(a);
        if (result != null)
            System.out.println("First node of loop: " + result.data);
        else
            System.out.println("No loop found.");
    }
    /// Solutions
/// Method 1 Using fast and slow pointer
public static Node firstloop(Node head){
    Node fast = head;
    Node slow = head;
    while (fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast){
            slow = head;
            while (slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
    return null;
}

    /// Method 2 using hashSet
     public static Node first(Node head){
         Node curr = head;
         HashSet<Node>set = new HashSet<>();
         while (curr != null){
             if (set.contains(curr))return curr;
             else {
                 set.add(curr);
                 curr = curr.next;
             }
         }
         return null;
     }
}
