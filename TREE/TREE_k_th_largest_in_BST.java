package TREE;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TREE_k_th_largest_in_BST {
    /// Structure of the Tree
    static class Node{
        int data;
        Node left = null;
        Node right = null;
        Node(int data){
            this.data = data;
            this.left = right = null;
        }
        static int result = 1;
        static int count  = 1;

        public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(1);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        int k = 1;
        System.out.println(Klargest(root,k));
    }
        static int Klargest(Node root , int k){
            TreeSet<Integer> res = new TreeSet<>();
            NavigableSet<Integer> dset = res.descendingSet();
            klarge(root , k , res);
            int ans = -1;
            int count = 1;
            for (int i : dset){
                if (count ==k){
                    ans = i;
                    break;
                }
                count++;
            }


            return ans;
        }

        private static void klarge(Node root, int k, TreeSet<Integer> res) {
            if (root == null)return;
            res.add(root.data);
            klarge(root.left,k,res);
            klarge(root.right,k,res);
        }

        ///  Space Optimisation

        private static void klargee(Node root, int k){
            if (root == null || count >=k)return;

            /// Traverde right

            klargee(root.right , k);

            count++;
            if (count ==k){
                result = root.data;
                return;
            }
            klargee(root.left , k);
        }

        static int Klargetss(Node root, int k){
            count = 0;
            result = -1;
            klargee(root,k);
            return result;
        }
    }
}
