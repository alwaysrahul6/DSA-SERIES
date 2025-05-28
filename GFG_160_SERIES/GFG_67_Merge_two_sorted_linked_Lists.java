package GFG_160_SERIES;

/*      *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/merge-two-sorted-linked-lists
        *  Merge two sorted linked lists
        *  Given the head of two sorted linked lists consisting of nodes respectively. The task is to merge both lists and return the head of the sorted merged list.
        *   Examples:
        *   Input: head1 = 5 -> 10 -> 15 -> 40, head2 = 2 -> 3 -> 20
        *   Output: 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40
        *   Explanation:
* */
import java.util.Scanner;

public class GFG_67_Merge_two_sorted_linked_Lists {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    /// Solution

   static Node sortedMerge(Node head1, Node head2) {
        // code here
        if (head1 == null || head2 == null){
            return head1 == null ? head2 : head1;
        }
        if (head1.data <= head2.data){
            head2.next = sortedMerge(head1.next, head2);
            return head1;
        }
        else {
            head2.next = sortedMerge(head1 , head2.next);
            return head2;
        }
    }
/// Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();

        System.out.println("Enter Element of first linked list ");

        Node head1 = createlist(scanner , n1);

        System.out.println("Enter Size of second linked list ");
        int n2  = scanner.nextInt();
        System.out.println("Enter Element of second linked list ");

        Node head2 = createlist(scanner , n2);

        Node mergedHead = sortedMerge(head1, head2);
        System.out.println("Merge Linked List:");
        printlist(mergedHead);
    }

    /// Print The Linked List
  static void printlist(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    /// Insert A Data by user.
    static Node createlist(Scanner scanner , int n ){
        if (n == 0)return null;
        Node head = new Node(scanner.nextInt());
        Node temp = head;
        for (int i = 1;i< n;i++){
            temp.next = new Node(scanner.nextInt());
            temp = temp.next;
        }
        return head;
    }
}
