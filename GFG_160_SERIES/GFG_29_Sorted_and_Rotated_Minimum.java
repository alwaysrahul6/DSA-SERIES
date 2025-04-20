package GFG_160_SERIES;
/*  * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/minimum-element-in-a-sorted-and-rotated-array3611
    * Q-Sorted and Rotated Minimum
    * A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it.
    * Examples:
    * Input: arr[] = [5, 6, 1, 2, 3, 4]
    * Output: 1
    * Explanation: 1 is the minimum element in the array.
    *  */

import java.util.Scanner;

public class GFG_29_Sorted_and_Rotated_Minimum {
    /// Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = scanner.nextInt();
        System.out.println("Enter Element:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(solve(arr));

    }
    /// Solution

    private static int solve(int []arr){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < ans)
                ans = Math.min(ans, arr[i]);
        }
        return ans;
    }
}
