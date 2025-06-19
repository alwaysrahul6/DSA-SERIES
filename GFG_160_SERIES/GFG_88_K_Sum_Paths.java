package GFG_160_SERIES;
/*      *  K Sum Paths
        *  Given a binary tree and an integer k,
        *  determine the number of downward-only paths where the sum of 
        *  the node values in the path equals k. A path can start and end 
        *  at any node within the tree but must always move downward 
        *  (from parent to child).
        *   Examples:
        *
                         2
                        / \
                       1   3
                             \
                              5
            K = 6
         * output : 2
        */
import java.util.ArrayList;
import java.util.HashMap;

public class GFG_88_K_Sum_Paths {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = right = null;
        }
    }
    public static void main(String[] args) {

        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(5);

        int k = 6;

        System.out.println("Count using brute-force approach: " + sumK(root, k));
        System.out.println("Count using hashmap approach: " + sumKHashMap(root, k));
    }
    public static int sumK(Node root, int k){
        ArrayList<Integer>path = new ArrayList<>();
        int[]count = new int[1];
        sumkk(root,k,count,path);
        return count[0];
    }

    private static void sumkk(Node root, int k, int[] count, ArrayList<Integer> path) {
        if (root == null)return;

        path.add(root.data);

        sumkk(root.left,k,count,path);
        sumkk(root.right,k,count,path);

        int sum = 0;
        for (int i = path.size()-1;i>=0;i--){
            sum+= path.get(i);
            if (sum==k)count[0]++;
        }
       path.removeLast();
    }
    /// alternative option using hashmap

    static int sumKHashMap(Node root, int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,-1);
      int []count = new int[1];
      solveSum(root,k,map,count,0);
      return count[0];
    }

    private static void solveSum(Node root, int k, HashMap<Integer, Integer> map, int []count , int currSum) {
        if (root == null)return;
        currSum+=root.data;
        if (currSum == k)count[0]++;
        if (map.containsKey(currSum - k)){
            count[0]+=map.get(currSum - k);
        }
        map.put(currSum , map.getOrDefault(currSum, 0) + 1);
        solveSum(root.left,k,map,count,currSum);
        solveSum(root.right,k,map,count,currSum);
        /// backtarck
        map.put(currSum,map.get(currSum)- k);
    }
}
