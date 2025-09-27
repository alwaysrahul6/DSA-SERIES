package LINKEDLIST;

public class LL_13_InsertAtEnd {
    static class Node{
        int data;
        Node add;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);
        a.add = b;
        b.add = c;
        c.add = d;
        d.add = e;
        e.add = null;

        Node temp = insertAtEnd(a , 12);

        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.add;
        }
    }
    static Node insertAtEnd(Node head , int val){
        if (head == null)return new Node(val);

        Node temp = head;
        while ( temp.add != null){
            temp = temp.add;
        }
        Node newNode = new Node(val);
        temp.add = newNode;
        return head;
    }
}
