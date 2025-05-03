package GFG_160_SERIES;

/*      * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/key-pair5616
        * Two Sum - Pair with Given Sum.
        * Given an array arr[] of positive integers and another integer target.
        * Determine if there exist two distinct indices such that the sum of their elements is equal to the target.
        * Examples:
        * Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
        * Output: true.
        * Explanation: arr[3] + arr[4] = 6 + 10 = 16.
 * */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class GFG_42_Two_Sum_Pair_with_Given_Sum {

    /// Driver Code.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Element:");
    String []s = scanner.nextLine().split(" ");
    int n = s.length;
    int arr[] = new int[n];
    for (int i =0;i<n;i++){
        arr[i] = Integer.parseInt(s[i]);
    }
    System.out.println("Enter Target");
    int target = scanner.nextInt();
    System.out.println(twosumSet(arr,target));
}


    static  boolean twoSum(int arr[], int target) {
      Arrays.sort(arr);
      int n = arr.length;
      int i = 0;
      int j = n-1;
      while (i<=j){
          int sum = arr[i] + arr[j];
          if (sum==target)return true;
          else if (sum>target)j--;
          else i++;;
      }
      return false;
}
/// Approach 2
/// Solution
    static boolean twosumSet(int arr[] , int target){
        int n = arr.length;
        Set<Integer>set = new HashSet<>();
        for (int j : arr) {
            int complement = target - j;
            if (set.contains(complement)) return true;
            else set.add(j);
        }
        return false;
    }
}
