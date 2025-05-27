package GFG_160_SERIES;
/*
        * https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1
        *
        * # Rotate a Linked List
        *
        *   Q. Given the head of a singly linked list, your task is to left rotate the linked list k times.
        *    Ex.
        *      Input : head = 10 -> 20 -> 30 -> 40 -> 50, k = 4
        *      Output: 50 -> 10 -> 20 -> 30 -> 40
        *      Explanation:
        *              Rotate 1: 20 -> 30 -> 40 -> 50 -> 10
        *              Rotate 2: 30 -> 40 -> 50 -> 10 -> 20
        *              Rotate 3: 40 -> 50 -> 10 -> 20 -> 30
        *              Rotate 4: 50 -> 10 -> 20 -> 30 -> 40
        */
import java.util.Scanner;

public class GFG_66_Rotate_a_Linked_List {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node rotate(Node head, int k) {
        if (head == null || k == 0) return head;
        Node tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        if (k % length == 0) return head;
        k = k % length;
        tail.next = head; // Make it circular
        Node newtail = head;
        int lastnode = length - k;
        for (int i = 1; i < lastnode; i++) {
            newtail = newtail.next;
        }
        Node newHead = newtail.next;
        newtail.next = null; // Break the circular link
        return newHead;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node createListFromInput(Scanner sc, int n) {
        if (n <= 0) return null;
        System.out.print("Enter node 1: ");
        Node head = new Node(sc.nextInt());
        Node current = head;
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter node " + i + ": ");
            current.next = new Node(sc.nextInt());
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes in the linked list: ");
        int n = sc.nextInt();

        Node head = createListFromInput(sc, n);

        System.out.print("Enter number of positions to rotate: ");
        int k = sc.nextInt();

        System.out.println("Original List:");
        printList(head);

        Node rotated = rotate(head, k);

        System.out.println("Rotated List by " + k + " positions:");
        printList(rotated);

        sc.close();
    }
}
