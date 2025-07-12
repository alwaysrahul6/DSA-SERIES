package GFG_160_SERIES;

/*  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/dynamic-programming-gfg-160/problem/longest-palindromic-subsequence-1612327878
 *  Longest Palindromic Subsequence

 *  Q. Given a string s, return the length of the longest palindromic subsequence.
 *     A subsequence is a sequence that can be derived from the given sequence by deleting some or no elements without changing the order of the remaining elements.
 *     A palindromic sequence is a sequence that reads the same forward and backward.

 *    Examples:
 *        Input: s = "bbabcbcab"
 *        Output: 7
 *        Explanation: Subsequence "babcbab" is the longest subsequence which is also a palindrome.*/


import java.util.Arrays;
import java.util.Scanner;

public class GFG_113_Longest_Palindromic_Subsequence {
    /*--------------------Driver Code-------------------------------------------------------*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = new StringBuilder(s1).reverse().toString();
        System.out.println(longestPalinSubseq(s1));
        System.out.println(tabul(s1));
    }

    /*------------------Solution--------------------------------------------------------------*/
    public static int longestPalinSubseq(String s) {
        // code here
        String s2 = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int[] x : dp) {
            Arrays.fill(x, -1);
        }
        return lcs(s, s2, n, m, dp);
    }

    /*-----------------------Memorization--------------------------------------------------*/
    static int lcs(String s1, String s2, int n, int m, int[][] dp) {

        /// Base case

        if (n <= 0 || m <= 0) return 0;

        if (dp[n][m] != -1) return dp[n][m];

        /// Reccursive Work

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return dp[n][m] = 1 + lcs(s1, s2, n - 1, m - 1, dp);
        } else {
            int picks1 = lcs(s1, s2, n - 1, m, dp);
            int picks2 = lcs(s1, s2, n, m - 1, dp);
            return dp[n][m] = Math.max(picks1, picks2);
        }

    }

    /*------------------------Tabulation-------------------------------------------*/

    static int tabul(String s1) {
        String s2 = new StringBuilder(s1).reverse().toString();
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

}
