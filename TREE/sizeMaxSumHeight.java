package TREE;

public class sizeMaxSumHeight {
    static int count = 0;
    public static class Node {
         int val;
         Node left;
         Node right;
        public  Node(int data){
            this.val = data;
        }
    }
    public static int size(Node root){
        if (root == null)return 0;
        count++;
        size(root.left);
        size(root.right);
        return count;
    }

    public static int sizee(Node root){
        if (root == null)return 0;
        return 1 + sizee(root.left) + sizee(root.right);
    }
    public static int sum(Node root){
        if (root == null)return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int max(Node root){
        if (root == null)return Integer.MIN_VALUE;
       return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    public static void main(String[] args) {

        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);

        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        System.out.println(sum(root));
        System.out.println(max(root));

    }
}
