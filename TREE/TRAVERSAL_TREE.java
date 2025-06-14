package TREE;

public class TRAVERSAL_TREE {
    public static class Node {
        int val;
        Node left;
        Node right;
        public  Node(int data){
            this.val = data;
        }
    }
static void preorder(Node root){
        if (root == null)return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
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
      Node f= new Node(12);
      b.left = f;
      b.right = e;
      preorder(root);
    }
}
