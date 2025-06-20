package GFG_160_SERIES;
// k-th Smallest in BST
import java.util.Set;
import java.util.TreeSet;

public class GFG_90_k_th_Smallest_in_BST {
    static class Node
 {
     int data;
     Node left, right;

         public Node(int d)
     {
         data = d;
         left = right = null;
     }
 }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(1);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        int k = 2;
        System.out.println(kthSmallest(root,k));
    }
    public static int kthSmallest(Node root, int k) {
        // Write your code here
        Set<Integer>set = new TreeSet<>();
        ksmalltest(root,set);
        int ans = -1;
        int count  = 1;
        for (int val : set) {
            if (count == k) {
                ans = val;
                break;
            }
            count++;
        }
        return ans;

    }

    private static void ksmalltest(Node root, Set<Integer> set) {
        if (root == null )return;
        set.add(root.data);
        ksmalltest(root.left ,  set);
        ksmalltest(root.right , set);
    }
}
