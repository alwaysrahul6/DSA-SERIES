package LINKEDLIST;

public class LL_10_RemoveinKthPostion {
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

        int k = 4;

        Node temp = removeKthNode(a, k);
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.add;
        }
    }

    static Node removeKthNode(Node head , int k){
        if (head == null)return null;
        if (k == 1){
            head = head.add;
        }
        int count  = 0;
        Node prev = null;

        Node temp = head;
        while (temp != null){
            count++;
            if (count == k){
                prev.add = prev.add.add;
            }
            prev = temp;
            temp = temp.add;
        }
        return head;
    }
}
