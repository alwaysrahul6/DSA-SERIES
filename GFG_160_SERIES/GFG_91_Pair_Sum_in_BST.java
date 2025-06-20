package GFG_160_SERIES;
/*  * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/find-a-pair-with-given-target-in-bst
    * Pair Sum in BST
    * Given a Binary Search Tree(BST) and a target. Check whether there's a
    * pair of Nodes in the BST with value summing up to the target.
    * Input: root = [7, 3, 8, 2, 4, N, 9], target = 12
                        7
                       / \
                      3   8
                     / \    \
                    2   4    9
    * Output : True
    *
    */
import java.util.ArrayList;

public class GFG_91_Pair_Sum_in_BST {
    /// STRUCTURE OF THE TREE
     class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = right = null;
        }
    }
/// Driver Code
    public  void main(String[] args) {
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
        System.out.println(findTarget(root,target));

    }
    /// Solution
    boolean findTarget(Node root, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        kSum(root,res);
        int i = 0, j = res.size()-1;
        while (i<j){
            int sum = res.get(i) + res.get(j);
            if (sum == target)return true;
            else if (sum < target)i++;
            else j--;
        }
        return false;
    }
    /// Reccursive  Method
    private void kSum(Node root, ArrayList<Integer> res) {
        if (root == null)return;
        kSum(root.left,res);
        res.add(root.data);
        kSum(root.right,res);
    }

}
