package LINKEDLIST;

public class LL_12_InsertAtHead {
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
        Node f = new Node(12);

        a.add = b;
        b.add = c;
        c.add = d;
        d.add = e;
        e.add = f;
        f.add = null;
        Node temp = insertHead(a , 1);
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.add;
        }
    }

    static Node insertHead(Node head , int val){
        Node temp = new Node(val);
        temp.add = head;
        return temp;
    }
}
