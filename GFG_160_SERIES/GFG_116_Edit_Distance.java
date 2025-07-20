package GFG_160_SERIES;
/*
 * https://www.geeksforgeeks.org/problems/edit-distance3702/1
 * Edit Distance
 *  Q. Given two strings s1 and s2. Return the minimum number of operations required to convert s1 to s2.
 *          The possible operations are permitted:
 *          Insert a character at any position of the string.
 *          Remove any character from the string.
 *          Replace any character from the string with any other character.
 * Ex.
 *  Input: s1 = "geek", s2 = "gesek"
 *  Output: 1
 *  Explanation: One operation is required, inserting 's' between two 'e' in s1.
 */
import java.util.Arrays;

public  class GFG_116_Edit_Distance {
    public static void main(String[] args) {
    String s1 = "mdl";
    String s2 = "qhszmmbgi";
        System.out.println(editDistance(s1,s2));

    }

    public static int editDistance(String s1, String s2) {
        // Code here
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        return distance(n-1,m-1,s1 ,s2,dp);
    }

    private static  int distance(int i, int j, String s1, String s2, int[][] dp) {

        /// Base Case

        if (i < 0) return j + 1;
        if (j < 0) return i + 1;
        if (dp[i][j] != -1) return dp[i][j];
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = distance(i - 1, j - 1, s1, s2, dp);
        } else {
            int insert = 1 + distance(i, j - 1, s1, s2, dp);
            int delete = 1 + distance(i - 1, j, s1, s2, dp);
            int replace = 1 + distance(i - 1, j - 1, s1, s2, dp);
            return dp[i][j] = Math.min(delete, Math.min(insert,replace));
        }
    }

}
