package TREE;
import java.util.ArrayList;

public class TREE_Two_Sum_in_BST {
    /// Structure of Tree

    public static class Node {
               int val;
        Node left;
        Node right;
        public  Node(int data){
            this.val = data;
            this.left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(7);
        Node a = new Node(3);
        Node b = new Node(8);
        Node c = new Node(2);
        Node d = new Node(4);
        Node e = new Node(9);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        int target = 12;
        System.out.println(twoSum(root,target));
    }
    static boolean twoSum(Node root , int k){
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);
        int i = 0, j = res.size()-1;
        while (i < j){
            int sum = res.get(i) + res.get(j);
            if (sum == k)return true;
            else if (sum < k) {
                i++;
            }else j--;
        }
        return false;
    }

    private static void inorder(Node root, ArrayList<Integer> res) {
        if (root == null)return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
