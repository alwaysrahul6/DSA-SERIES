package TREE;

import java.util.ArrayList;

public class TREE_Merge_two_BST {
    class Node
    {
        int data;
        Node left, right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // Write your code here
        ArrayList<Integer>ans1 = new ArrayList<>();
        ArrayList<Integer>ans2 = new ArrayList<>();
        inorder(root1 , ans1);
        inorder(root2 , ans2);
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0 , j = 0;
        while (i < ans1.size() && j < ans2.size()){
            if (ans1.get(i) < ans2.get(j)){
                ans.add(ans.get(i++));
            }else
                ans.add(ans2.get(j++));
        }
        while (i < ans1.size()){
            ans.add(ans1.get(i++));
        }
        while (j < ans2.size()){
            ans.add(ans2.get(j++));
        }
        return ans;
    }
    public void inorder(Node root, ArrayList<Integer>ans){
        if (root == null)return;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }
}
