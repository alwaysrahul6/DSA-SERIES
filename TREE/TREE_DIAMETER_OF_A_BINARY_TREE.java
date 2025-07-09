package TREE;

public class TREE_DIAMETER_OF_A_BINARY_TREE {
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
    static int diameter(Node root){
        int res[] = {Integer.MIN_VALUE};
        diaa(root,res);
        return res[0]-1;

    }
    static int diaa(Node root , int res[]){
        if (root == null)return 0;
        int lh = diaa(root.left,res);
        int rh = diaa(root.right,res);
        int ans =  rh + lh + 1 ;
        res[0] = Math.max(ans,res[0]);
        return Math.max(lh,rh) + 1;
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
        System.out.println(diameter(root));
    }
}
