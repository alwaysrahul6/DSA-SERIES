package GFG_160_SERIES;
/*
 * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/dynamic-programming-gfg-160/problem/total-decoding-messages1235
 * Total Decoding Messages
 * Q. A message containing letters A-Z is being encoded to numbers using the following mapping:
 *  'A' -> 1
 *  'B' -> 2
     ...
 *  'Z' -> 26
 *   You are given a string digits. You have to determine the total number of ways that message can be decoded.
 * Ex.
 *   Input: digits = "123"
 *   Output: 3
 *   Explanation: "123" can be decoded as "ABC"(1, 2, 3), "LC"(12, 3) and "AW"(1, 23).
 *  */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_129_Total_Decoding_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String s = scanner.nextLine();
        System.out.println(countWays(s));
    }

    public static int countWays(String digits) {
        if (digits.charAt(0) == '0')return 0;
        int n = digits.length();
        int[]dp = new int[n];

        Arrays.fill(dp, -1);

        return decode(0 , n , digits, dp);
    }

    private static int decode(int idx, int n, String digits, int[] dp) {

        if (idx >= n) return 1;
        if (dp[idx] != -1) return dp[idx];
        if (digits.charAt(idx) == '0') return 0;

        String temp = "";
        int ways = 0;

        for (int i = 0; i < 2; i++) {
            int index = idx + i;

            if (index >= n) break;

            temp += digits.charAt(index);
            int val = Integer.parseInt(temp);

            if (val > 0 && val <= 26) {
                ways += decode(index + 1, n, digits, dp);
            }
        }
        return dp[idx] = ways;
    }
}
