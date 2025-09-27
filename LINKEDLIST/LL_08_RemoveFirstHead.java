package LINKEDLIST;

public class LL_08_RemoveFirstHead {

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

        a.add = b;
        b.add = c;
        c.add = d;
        d.add = null;

        Node temp = removeFirstNode(a);
        while ( temp != null){
            System.out.print(temp.data + " ");
            temp = temp.add;
        }
    }

    static Node removeFirstNode(Node head){
        if (head == null) return null;

        head = head.add;

        return head;
    }
}
