/*      *       https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/add-two-numbers-represented-by-linked-lists
        *       Add Number Linked Lists
        *       Q.Given the head of two singly linked lists num1 and num2 representing two non-negative integers.
        *         The task is to return the head of the linked list representing the sum of these two numbers.

        *       For example, num1 represented by the linked list : 
        *       1 -> 9 -> 0, similarly num2 represented by the linked list:
        *       2 -> 5.      Sum of these two numbers is represented by 
        *       2 -> 1 -> 5.

        *       Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

        *       Examples:

        *       Input: num1 = 4 - > 5, num2 = 3 -> 4 -> 5
        *       Output:  3 -> 9 -> 0

 * */
package GFG_160_SERIES;


public class GFG_68_Add_Number_Linked_Lists {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node revecelist(Node head){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node addTwoLists(Node num1, Node num2) {
        num1 = revecelist(num1);
        num2 = revecelist(num2);
        int carry = 0;
        Node ans = new Node(0);
        Node first = ans;
        while (num1 != null || num2 != null || carry != 0) {
            int sum = carry;
            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }
            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }
            ans.data = sum % 10;
            carry = sum / 10;
            if (num1 != null || num2 != null || carry != 0) {
                ans.next = new Node(0);
                ans = ans.next;
            }
        }
        return revecelist(first);
    }

    // Create list from array
    static Node createList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Print list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" → ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3}; // 123
        int[] arr2 = {4, 5};    // 45

        Node num1 = createList(arr1);
        Node num2 = createList(arr2);

        System.out.print("List 1: ");
        printList(num1);

        System.out.print("List 2: ");
        printList(num2);

        Node result = addTwoLists(num1, num2);

        System.out.print("Sum List: ");
        printList(result); // Should print 1 → 6 → 8
    }
}
