package GFG_POTD;
/*
 * Interleaved Strings
 *
 * #. Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.I
 *    Interleaving of two strings s1 and s2 is a way to mix their characters to form a new string s3,
 *    while maintaining the relative order of characters from s1 and s2. Conditions for interleaving:
 *    Characters from s1 must appear in the same order in s3 as they are in s1.
 *    Characters from s2 must appear in the same order in s3 as they are in s2.
 *    The length of s3 must be equal to the combined length of s1 and s2.
 *   Examples :
 *   Input: s1 = "AAB", s2 = "AAC", s3 = "AAAABC"
 *   Output: true
 *   Explanation: The string "AAAABC" has all characters of the other two strings and in the same order.
 * */
public class GFG_POTD_40_Interleaved_Strings {
    public static void main(String[] args) {
        String s1 = "AAB";
        String s2 = "AAC";
        String s3 = "AAAABC";
        System.out.println(isInterleave(s1,s2,s3));

    }

    /// Solutions
    public static boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        int k = s3.length();
        if (n + m != k) return false;
        Boolean dp[][] = new Boolean[n+1][m+1];

        return helperSolve(0,0,0,s1,s2,s3,dp);
    }




    private static boolean helperSolve(int i, int j, int k, String s1, String s2, String s3, Boolean[][] dp) {
        if (k == s3.length())return true;

        boolean a = false , b = false;
        if (dp[i][j] != null)return dp[i][j];

        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)){
            a = helperSolve(i+1 ,j ,k+1 ,s1,s2,s3, dp);
        }
        if (j < s2.length() && s2.charAt(j) == s3.charAt(k)){
            b = helperSolve(i, j+1 ,k+1 , s1,s2,s3, dp);
        }
        return dp[i][j] = (a || b);
    }
}

