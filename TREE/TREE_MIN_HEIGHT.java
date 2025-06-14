package TREE;

public class TREE_MIN_HEIGHT {
    static class Node {
        int val;
        Node left;
        Node right;
       public Node(int val){

              this.val  = val;
        }
    }
    static int minHeight(Node root){
        if (root == null || (root.left == null && root.right == null) )return 0;
        return 1 + Math.min(minHeight(root.left), minHeight(root.right));
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
        System.out.println( minHeight(root));
    }

}
