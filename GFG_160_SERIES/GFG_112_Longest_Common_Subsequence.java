package GFG_160_SERIES;
/*      *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/dynamic-programming-gfg-160/problem/longest-common-subsequence-1587115620

 *      * Longest Common Subsequence

        * Q. Given two strings s1 and s2, return the length of their longest common subsequence (LCS). If there is no common subsequence, return 0.

        *   A subsequence is a sequence that can be derived from the given string by deleting some or no elements without changing the order of the remaining elements.
        *   For example, "ABE" is a subsequence of "ABCDE".

        * Examples:

         *   Input: s1 = "ABCDGH", s2 = "AEDFHR"
 *   Output: 3
 *   Explanation: The longest common subsequence of "ABCDGH" and "AEDFHR" is "ADH", which has a length of 3.
 *
 * */

import java.util.Arrays;
import java.util.Scanner;

public class GFG_112_Longest_Common_Subsequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elememt A:");
        String a = scanner.nextLine();

        System.out.println("Enter Element B:");
        String b = scanner.nextLine();

        System.out.println("Longest Common Sequence of Element a and b is length of  :  ");

        System.out.println(lcs(a, b));


    }

    static int lcs(String s1, String s2) {
        // code here

        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for (int[] x : dp) {
            Arrays.fill(x, -1);
        }
        return longestSeq(n, m, s1, s2, dp);
    }
/// Memorization
 

    private static int longestSeq(int n, int m, String s1, String s2, int[][] dp) {
        if (n <= 0 || m <= 0) return 0;

        if (dp[n][m] != -1) return dp[n][m];

        if (s1.charAt(n-1) == s2.charAt(m-1)) {
            return dp[n][m] = 1 + longestSeq(n - 1, m - 1, s1, s2, dp);
        } else {
            int pickS1 = longestSeq(n - 1, m, s1, s2, dp);
            int pickS2 = longestSeq(n, m - 1, s1, s2, dp);
            return dp[n][m] = Math.max(pickS1, pickS2);
        }
    }
    
    
    /// Space Optimization 
    
    static int lcs2(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int[] cur = new int[m+1];
        int[] nxt = new int[m+1];

        for (int i = n-1;i >= 0;i--) {
            for (int j = m-1;j >= 0;j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    cur[j] = 1 + nxt[j + 1];
                } else {
                    cur[j] = Math.max(nxt[j], cur[j+1]);
                }
            }
            nxt = cur.clone();
        }

        return cur[0];
    }

///  Tabulation Method
    static int lcss(String s1, String s2){

        int n = s1.length();
        int m = s2.length();
        int [][]dp = new int[n+1][m+1];
        for (int i = 1; i <= n; i++){
            for (int j = 1 ;j <= m; j++){
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                   dp[i][j] =  Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
