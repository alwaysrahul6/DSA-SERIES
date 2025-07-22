package GFG_160_SERIES;/*
 * https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
 * Minimum Jumps
 * Q. You are given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.
 *      For example:
 *      If arr[i] = 3, you can jump to index i + 1, i + 2, or i + 3 from position i.
 *      If arr[i] = 0, you cannot jump forward from that position.
 *      Your task is to find the minimum number of jumps needed to move from the first position in the array to the last position.
 *   Ex.
 *    Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
 *    Output: 3
 *    Explanation: First jump from 1st element to 2nd element with value 3.
 *                 From here we jump to 5th element with value 9, and from here we will jump to the last.
 *  */

import java.util.Arrays;
import java.util.Scanner;

public class GFG_122_Minimum_Jumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(minJumps(arr));
    }

    static int minJumps(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int ans = jump(arr, 0, n, dp);
        return (ans == 1e4) ? -1 : ans;
    }

    private static int jump(int[] arr, int idx, int n, int[] dp) {
        if (idx >= n - 1) return 0;
        if (dp[idx] != -1) return dp[idx];
        int min = (int) 1e4;
        for (int i = 1; i <= arr[idx]; i++) {
            min = Math.min(min, 1 + jump(arr, idx + i, n, dp));
        }
        return dp[idx] = min;
    }
}
