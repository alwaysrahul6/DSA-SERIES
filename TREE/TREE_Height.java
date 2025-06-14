package TREE;

public class TREE_Height {
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    static int height(Node root){
        if (root == null)return -1;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(12);
        Node a = new Node(8);
        Node b = new Node(18);
        root.left = a;
        root.right = b;
        Node c = new Node(5);
        Node d = new Node(11);
        a.left = c;
        a.right = d;
        System.out.println(height(root));
    }
}
