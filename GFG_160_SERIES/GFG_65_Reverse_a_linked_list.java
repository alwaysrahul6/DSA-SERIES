/*
 *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/reverse-a-linked-list
 *   Reverse a linked list
 *   Given the head of a linked list, the task is to reverse this list and return the reversed head.
 *   Examples:
 *   Input: head: 1 -> 2 -> 3 -> 4 -> NULL
 *   Output: head: 4 -> 3 -> 2 -> 1 -> NULL
 * */

package GFG_160_SERIES;

import java.util.Scanner;

public class GFG_65_Reverse_a_linked_list {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    /// Iterative Method (Fixed logic)
    Node revercelist(Node head){
        Node temp = head;
        Node prev = null;
        while (temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    /// Recursive Method
    Node revercelistt(Node head){
        if (head == null || head.next == null) return head;
        Node newHead = revercelistt(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void printlist(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /// Method to build a linked list from user input
    public Node buildListFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        if (n <= 0) return null;

        System.out.print("Enter elements: ");
        Node head = new Node(sc.nextInt());
        Node current = head;

        for (int i = 1; i < n; i++) {
            current.next = new Node(sc.nextInt());
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        GFG_65_Reverse_a_linked_list list = new GFG_65_Reverse_a_linked_list();

        // Build list from user input
        Node head = list.buildListFromUser();

        System.out.println("\nOriginal List:");
        list.printlist(head);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nChoose method to reverse (1 = Iterative, 2 = Recursive): ");
        int choice = sc.nextInt();

        // Reverse using chosen method
        if (choice == 1) {
            head = list.revercelist(head);
        } else if (choice == 2) {
            head = list.revercelistt(head);
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        System.out.println("\nReversed List:");
        list.printlist(head);
    }
}
