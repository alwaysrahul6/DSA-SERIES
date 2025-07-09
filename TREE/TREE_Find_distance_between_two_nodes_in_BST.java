package TREE;

public class TREE_Find_distance_between_two_nodes_in_BST {
    static class Node {
        int data;
        Node left, right;

        public Node(int d) {
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
       int a1 = 2, b1 = 3;
        System.out.println(findDistanceinNode(root,a1,b1));
    }
    static  Node Lcs(Node root, int n1, int n2){
        while (root!= null){
            if (n1< root.data&& n2 < root.data){
                root = root.left;
            }else if (n1 > root.data && n2> root.data){
                root = root.right;
            }else return root;
        }
        return null;
    }
    static int finddistance(Node root, int val ){
        int distance = 0;
        while (root != null){
            if (val < root.data){
                distance++;
                root = root.left;
            }else if (val > root.data){
                distance++;
                root = root.right;
            }else return distance;
        }
        return -1;
    }
    static int findDistanceinNode(Node root, int a, int b){
       Node lca =  Lcs(root,a,b);
        int d1 = finddistance(lca,a);
        int d2 = finddistance(lca,b);
        return d1 + d2;
    }
}
