package LINKEDLIST;

public class LL_15_InsertAtGivenVal {
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

        Node temp = insertAtGivenEle(a , 5 , 4);
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.add;
        }
    }

    static Node insertAtGivenEle(Node head , int  val , int ele){
        if (head == null)return null;

        if (head.data == ele){
            Node newNode = new Node(val);
            newNode.add = head;
            return newNode;
        }
        Node prev = null;
        Node temp = head;
        while ( temp != null){
            if (temp.data == ele){
                Node newNode  = new Node(val);
                prev.add = newNode;
                newNode.add = temp;
            }
            prev = temp;
            temp = temp.add;
        }
        return head;
    }
}
