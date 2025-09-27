package LINKEDLIST;

public class LL_06_Reverced_A_Group_List {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverseKGroup(Node head, int k) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null)head.next = reverseKGroup(next , k);
        return prev;
    }
}
