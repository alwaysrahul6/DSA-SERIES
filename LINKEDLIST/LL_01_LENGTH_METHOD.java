package LINKEDLIST;
public class LL_01_LENGTH_METHOD {


    /// Implemention Of Node
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
    }
    /// Using While loop
    public static int length(Node head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    /// Reccursive Work

    static int length2(Node head){
        if (head == null)return 0;
        return 1 + length(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(9);
        Node d = new Node(12);
        Node e = new Node(14);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(length(a));
        System.out.println(length2(a));
    }
}
