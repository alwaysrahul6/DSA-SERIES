package TREE;

public class TREE_Sum_of_Binary_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.right =left = null;
        }
    }
    static int sum(Node root){
        if (root == null)return 0;
        return root.data + sum(root.left) +sum(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(-17);
        Node a = new Node(11);
        Node b = new Node(4);
        Node c = new Node(20);
        Node d = new Node(-2);
        Node e = new Node(10);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        System.out.println(sum(root));
    }
    }

