package GFG_160_SERIES;

import java.util.Scanner;

/*  *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/remove-loop-in-linked-list
    *   Remove loop in Linked List
*   *   Given the head of a linked list that may contain a loop.  A loop means that the last node of the linked list is connected back to a node in the same list.
*   *   The task is to remove the loop from the linked list (if it exists).
    *   Custom Input format:
    *   A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to. If pos = 0, it means the last node points to null, indicating there is no loop.
    *   The generated output will be true if there is no loop in list and other nodes in the list remain unchanged, otherwise, false.
    *   Examples:
    *   Input: head = 1 -> 3 -> 4, pos = 2*/
public class GFG_73_Remove_Loop_in_Linked_List {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Scanner sc = new Scanner(System.in);

    private static Node createList (int size, int pos){
        System.out.println("Elements: ");
        Node head = new Node(-1);
        int count  = 0;
        Node temp = head, temp1 = null;
        for (int i = 0;i < size;i++){
            count++;
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
            if (count == pos) temp1 = temp;
        }
        temp.next = temp1;
        return head.next;
    }
    private static void printList (Node head){
        Node slow = head, fast = head, tail = null;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                for (slow = head; slow != fast; slow = slow.next){
                    tail = fast;
                    fast = fast.next;
                }
                if (slow == head){
                    tail = slow;
                    while (tail.next != slow) tail = tail.next;
                }
                break;
            }
        }
        slow = head;
        System.out.print("List is: ");
        while (slow != tail){
            System.out.print(slow.data + " ");
            slow = slow.next;
        }
        if (tail != null) System.out.println(tail.data + " -> " + tail.next.data);
        else System.out.println("-> NULL");
    }

    /// main Method
    public static void main(String[] args) {

        System.out.println("Size: ");
        int n = sc.nextInt();

        System.out.println("loop at position: ");
        int pos = sc.nextInt();

        Node head = createList(n, pos);

        printList(head);
        removeLoop(head);
        printList(head);

        Node s = head, f = head;
        while (f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            if (s == f) break;
        }
        System.out.println(s != f);
    }


    public static void removeLoop(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        while (slow.next != fast) {
            slow = slow.next;
        }
        slow.next = null;
    }
}
