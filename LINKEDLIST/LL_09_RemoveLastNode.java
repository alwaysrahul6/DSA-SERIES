package LINKEDLIST;

public class LL_09_RemoveLastNode {

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
        Node temp = removeLastNode(a);
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.add;
        }
    }

    static Node removeLastNode(Node head){
        if (head == null)return null;
        Node temp = head;

        while (temp.add.add != null){
            temp = temp.add;
        }
        temp.add = null;
        return head;
    }
}
