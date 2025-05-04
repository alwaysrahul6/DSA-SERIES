package GFG_160_SERIES;

/* * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/count-pairs-with-given-sum--150253
   * Count pairs with given sum.
   * Q. Given an array arr[] and an integer target.
   *    You have to find numbers of pairs in array arr[] which sums up to given target.
   *    Examples:
   *            Input: arr[] = [1, 5, 7, -1, 5], target = 6
   *            Output: 3
   *            Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5).
   * 
   * */


import java.util.HashMap;
import java.util.Scanner;
/// Solution
public class GFG_43_Count_pairs_with_given_sum {
    static  int countPairs(int arr[], int target) {
        // Your code here
        int count  =0;
        HashMap<Integer,Integer>map  =new HashMap<>();
        for (int i =0;i<arr.length;i++){
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                count+= map.get(complement);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        return count;
    }
///Driver Code
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Element");
        String [] s = scanner.nextLine().split(" ");
        int n = s.length;
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter Target");
        int target = scanner.nextInt();
        System.out.println(countPairs(arr,target));
    }
}
