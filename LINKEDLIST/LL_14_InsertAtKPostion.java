package LINKEDLIST;

public class LL_14_InsertAtKPostion {
    static class Node {
        int data;
        Node add;

        Node(int data) {
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
            c.add = d;
            d.add = e;
            e.add = f;
            f.add = g;
            g.add = null;

            Node temp = insertAtpostion(a , 3 , 3);
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.add;
            }
        }

        static Node insertAtpostion(Node head , int val , int k){
            if (head == null){
                if (k == 1){
                    return new Node(val);
                }else {
                    return head;
                }
            }
            if(k == 1){
                Node newnode = new Node(val);
                newnode.add = head;
                return newnode;
            }

            int count  = 0;
            Node temp = head;
            while (temp != null){
                count++;
                if (count == k - 1){
                    Node newNode = new Node(val);
                    newNode.add = temp.add;
                    temp.add = newNode;
                }
                temp = temp.add;
            }
            return head;
        }
    }
