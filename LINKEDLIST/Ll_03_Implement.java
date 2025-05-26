package LINKEDLIST;

public class Ll_03_Implement {
    /// Step 1 To create a Node

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linked{
        Node head;
        Node tail;
        int size  = 0;
        ///  Insert begin


        void insertBegin(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        ///  Display


         void display(){
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        /// Insert At End


        void insertATEnd(int val){
            Node temp = new Node(val);
               
        }
    }

    public static void main(String[] args) {
        linked ll = new linked();
        ll.insertBegin(5);
        ll.display();
        System.out.println(ll.size);
    }
}
