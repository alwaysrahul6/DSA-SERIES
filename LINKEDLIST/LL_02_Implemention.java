package LINKEDLIST;

public class LL_02_Implemention {
    /// Node Creation

    public  static class Node{
        int data;
        Node next;
        Node (int data){
            this.data =  data;
        }
    }


    public static class linkedlist{

        Node head = null;
        Node tail = null;
        int size = 0;

        /// Insertion Opration

        void insertAtAnyPoint(int idx , int val){
            Node t = new Node(val);
            Node temp = head;
            if (idx == size){
                insertAtEnd(val);
                return;
            } else if (idx ==0) {
                insertAtBegin(val);
                return;
            }
            for (int i = 1;i < idx - 1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
///  Insertion At End
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
/// Display Linked List
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int getAt(int idx){
            Node temp = head;
            for (int i =0;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void insertAtBegin(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
                tail = temp;
            }else {
                temp.next = head;
                head = temp;
            }
        }
        void deleteNode(int idx ){
            if (idx == 0)head = head.next;
            Node temp = head;
            for (int i = 1;i <= idx - 1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == size-1)tail = temp;
            size--;
        }
    }


    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.display();
        System.out.println();
        ll.display();
        System.out.println(ll.tail.data);
        ll.deleteNode(0);
        System.out.println(ll.head.data);
    }
}
