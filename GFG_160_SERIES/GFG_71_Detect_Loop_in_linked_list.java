package GFG_160_SERIES;
/*     * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/detect-loop-in-linked-list
       *  Detect Loop in linked list
       * Q.You are given the head of a singly linked list. Your task is to determine if the linked list contains a loop. A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.
       *      Custom Input format:
       *        A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to. If pos = 0, it means the last node points to null, indicating there is no loop.
       *        Examples:
       *        Input: head: 1 -> 3 -> 4, pos = 2
       *        Output: true
       *        Explanation: There exists a loop as last node is connected back to the second node.*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GFG_71_Detect_Loop_in_linked_list {
  /// Structure Of Node 
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
/// Driver Code 
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        System.out.println(detect(a));
    }
    /// Method 1 
    
    
    static boolean isvisted(List<Node> visited, Node curr){
        for (Node node: visited){
            if (node == curr)return true;
        }
        return false;
    }
    public static boolean detectLoop(Node head) {
        Node curr = head;
        List<Node>visited = new ArrayList<>();
        while (curr != null){
            if (isvisted(visited,curr)){
                return true;
            }else {
                visited.add(curr);
                curr = curr.next;
            }
        }
        return false;
    }

    /// Methdod 2 Using Hashset
    public static boolean detectloop(Node head){
        Node curr = head;
        HashSet<Node>visted = new HashSet<>();
        while (curr != null){
            if (visted.contains(curr)){
                return true;
            }else{
                visted.add(curr);
                curr = curr.next;
            }
        }
        return false;
    }
    /// Method 2 Using Fast And Slow pointer
    static boolean detect(Node head){
        Node fast = head.next;
        Node slow = head;
         while (fast != slow){
             if (fast == null || fast.next == null)return false;
             fast = fast.next.next;
             slow = slow.next;
         }
         return true;
    }


}
