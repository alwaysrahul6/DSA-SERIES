package LINKEDLIST;

public class LL_07_convertArrtoLL {
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,7};
        Node head = converLL(arr);
        System.out.println(head.next.data);

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(8907);
        System.out.println(lengthll(head));
        System.out.println(searchll(20 , head));
//        System.out.println(removeFirstNode(head));
        // Removing
        head = removeFirstNode(head);
        Node temp1 = head;
        while (temp1 != null){
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
    }

  static Node converLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1;  i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

  static int lengthll(Node head){
       int size = 0;
       Node temp = head;
       while (temp != null){
           size++;
           temp = temp.next;
       }
       return size;
    }

    /// Searching of Linked List

    static boolean searchll(int val , Node head){
        Node temp = head;
        while (temp != null){
            if (temp.data == val)return true;
            temp = temp.next;
        }
        return false;
    }

    static Node removeFirstNode(Node head){
        if (head == null) return null;
        Node temp = head; // optionally
        head = head.next;
        return head;
    }
}
