package LINKEDLIST;

public class LL_05_Reverce_LinkedList {
    public class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next =  null;
        }
    }
    static Node revercelinked(Node head){
        Node curr= head;
          Node prev = null;
          Node next = null;
          while (curr != null){
              next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
          }
          return curr;
    }
}
