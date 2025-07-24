package GFG_160_SERIES;/*
 * https://www.geeksforgeeks.org/problems/subset-sum-problem2014/1
 * Partition Equal Subset Sum
 * Q. Given an array arr[], determine if it can be partitioned
 *    into two subsets such that the sum of elements in both parts is the same.
 *  Note: Each element must be in exactly one subset.
 *  Ex:
 *   Input: arr = [1, 5, 11, 5]
 *   Output: true
 *   Explanation: The two parts are [1, 5, 5] and [11].
 *  */

import java.util.Scanner;


public class GFG_124_Partition_Equal_Subset_Sum {
    /* Driver Code */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(equalPartition(arr));
    }

    /* Solution---------------------Memorization-----------------------------------*/
    static boolean equalPartition(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        if (sum % 2 != 0) return false;
        sum /= 2;
        Boolean[][] dp = new Boolean[sum + 1][n + 1];

        return equal(arr, sum, n, dp);

    }

    private static boolean equal(int[] arr, int max, int idx, Boolean[][] dp) {
        if (max == 0) return true;
        if (idx == 0) return false;

        if (dp[max][idx] != null) return dp[max][idx];

        boolean pick = false;

        boolean notpick = false;

        if (arr[idx - 1] <= max) {
            pick = equal(arr, max - arr[idx - 1], idx - 1, dp);
        }
        notpick = equal(arr, max, idx - 1, dp);

        return dp[max][idx] = pick || notpick;
    }

    /*---------------------------------Tabulation-------------------------------------------------------*/

    static boolean table(int arr[]) {

        int n = arr.length;
        int sum = 0;
        for (int k : arr) {
            sum += k;
        }
        if (sum % 2 != 0) return false;
        Boolean[][] dp = new Boolean[sum + 1][n + 1];

        for (int i = 0; i <= sum; i++) {
            dp[i][0] = false;
        }

        for (int i = 0; i < n; i++) {
            dp[0][i] = true;
        }


        for (int i = 1; i <= sum; i++) {
            for (int idx = 1; idx <= n; idx++) {
                boolean pick = false;
                boolean notPick = false;
                if (arr[idx - 1] <= i) {
                    pick = dp[i - arr[idx - 1]][idx - 1];
                }
                notPick = dp[i][idx - 1];

                dp[i][idx] = pick || notPick;
            }
        }
        return dp[sum][n];
    }
}
