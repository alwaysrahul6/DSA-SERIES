package LINKEDLIST;


import ARRAYS.Check_Array_equal;

public class basicll {

    /// Traversing LinkedList Using Reccursion

    public static void display1(Node head){
        if (head == null)return;
        System.out.println(head.data + " ");
        display1(head.next);

    }

    /// traverse linkedList using While loop

    public  static void display(Node head){
        Node Temp = head;
        while (Temp!= null){
            System.out.print(Temp.data + " ");
            Temp = Temp.next;
        }
    }
    public static class Node{
        int data;/// value
        Node next;
        Node(int data){
            this.data  = data;
        }
    }


public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(7);
    Node c = new Node(8);
    Node d = new Node(9);
    Node e = new Node(11);
    // 5 7 8 9 11

    a.next = b; ///  5 -> 7
    b.next = c; ///  5 -> 7 -> 8
    c.next = d; ///  5 -> 7 -> 8 -> 9
    d.next = e; ///  5 -> 7 -> 8 -> 9 ->11
    display(a);
    System.out.println("Using While Loop");

    System.out.println("Reccursion");
    display1(a);
//    Node temp = a;
/// Priting A LinkedList in Using For Loop.

    /*
        for (int i = 0; i < 5; i++){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }*/

    /// Traverce Linked List Using While loop.

   /* while (temp != null){
        System.out.println(temp.data +  " ");
        temp = temp.next;
    }*/


}
}
