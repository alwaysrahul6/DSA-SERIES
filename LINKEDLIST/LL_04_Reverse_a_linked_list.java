/*
            *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/reverse-a-linked-list
            *   Reverse a linked list
            *   Given the head of a linked list, the task is to reverse this list and return the reversed head.
            *   Examples:
            *   Input: head: 1 -> 2 -> 3 -> 4 -> NULL
            *   Output: head: 4 -> 3 -> 2 -> 1 -> NULL
 * */

package LINKEDLIST;

import java.util.Scanner;

public class LL_04_Reverse_a_linked_list {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    /// Iterative Method
    Node reverseList(Node head) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
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
        Node newhead = revercelistt(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }

    /// Print List
    private void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /// Build list from user input
    private Node buildListFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the linked list: ");
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
        LL_04_Reverse_a_linked_list list = new LL_04_Reverse_a_linked_list();

        Node head = list.buildListFromInput();

        System.out.println("\nOriginal List:");
        list.printList(head);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nChoose method to reverse (1 = Iterative, 2 = Recursive): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            head = list.reverseList(head);
        } else {
            head = list.revercelistt(head);
        }

        System.out.println("\nReversed List:");
        list.printList(head);
    }
}
