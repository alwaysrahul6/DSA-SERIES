package GFG_160_SERIES;
/* *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/subarray-with-given-sum-1587115621
*  * Indexes of Subarray Sum
   * Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.
   * Note: If no such array is possible then, return [-1].
   * Examples:
   * Input: arr[] = [1, 2, 3, 7, 5], target = 12
   * Output: [2, 4]
   * Explanation: The sum of elements from 2nd to 4th position is 12.
   * */

import java.util.ArrayList;
import java.util.Scanner;

public class GFG_56_Indexes_of_Subarray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take array input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements (non-negative integers):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Take target input
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        // Call function and print result
        ArrayList<Integer> result = subarraySum(arr, target);
        if (result.size() == 1 && result.get(0) == -1) {
            System.out.println("No subarray found with the given sum.");
        } else {
            System.out.println("Subarray found from index " + result.get(0) + " to " + result.get(1));
        }
        sc.close();
    }
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
            int n = arr.length;
        ArrayList<Integer>result = new ArrayList<>();
        int sum = 0 , start = 0;
        for (int i =0;i<n;i++){
            sum+=arr[i];
            while (sum>target && start < i){
                sum-=arr[start];
                start++;
            }
            if (sum == target){
                result.add(start + 1);
                result.add(i + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
