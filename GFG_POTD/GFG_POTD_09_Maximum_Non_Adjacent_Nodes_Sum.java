package GFG_POTD;

import java.util.LinkedList;
import java.util.Queue;

/*
 * https://www.geeksforgeeks.org/problems/maximum-sum-of-non-adjacent-nodes/1
 *
 *
 * #. Maximum Non-Adjacent Nodes Sum
 *
 *  Q. Given the root of a binary tree with integer values. Your task is to select a subset of nodes such that the sum of their values is maximized,
 *     with the condition that no two selected nodes are directly connected that is, if a node is included in the subset, neither its parent nor its children can be included.
 *
 *  Ex.
 *  Input:
 *  root = [11, 1, 2]
 *
 *
 *  */
public class GFG_POTD_09_Maximum_Non_Adjacent_Nodes_Sum {

    class Node {
        int data;
        Node left, right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {


    }

    public int getMaxSum(Node root) {
        if (root == null) return 0;
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        int sum = 0;
        int sum2 = 0;
        boolean flag  = true;
        while (!nodes.isEmpty()){
            int n = nodes.size();
            for (int i = 0; i < n; i++){
               Node curr = nodes.poll();
               int s = curr.data;
                if (flag){
                    sum+= s;
                }
                else sum2+=s;
                if (curr.left != null)nodes.add(curr.left);
                if (curr.right != null) nodes.add(curr.right);
            }
            flag = !flag;
        }
        return Math.max(sum2 ,sum);
    }
}
