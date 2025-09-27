package LINKEDLIST;

public class LL_11_RemoveEle {
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
        Node g = new Node(14);

        a.add = b;
        b.add = c;
        c.add  = d;
        d.add = e;
        e.add = f;
        f.add = g;
        g.add = null;
        Node temp = removeEle(a , 10);

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.add;
        }
    }

    static Node removeEle(Node head , int ele){
        if (head == null ) return null;

        if (head.data == ele){
            head = head.add;
        }

        Node prev = null;
        Node temp = head;
        while (temp != null){
            if (temp.data == ele){
                prev.add = prev.add.add;
                break;
            }
            prev = temp;
            temp = temp.add;
        }
        return head;
    }

}
