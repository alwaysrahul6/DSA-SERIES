package GFG_POTD;
/*
 * Given two arrays, a[] and b[], find the length of the longest common increasing subsequence(LCIS).
 *  Note:  LCIS refers to a subsequence that is present in both arrays and strictly increases.
 *  Examples:
 *  Input: a[] = [3, 4, 9, 1], b[] = [5, 3, 8, 9, 10, 2, 1]
 *  Output: 2
 *  Explanation: The longest increasing subsequence that is common is [3, 9] and its length is 2.
 * */
public class GFG_POTD_41_Longest_Common_Increasing_Subsequence {
    //Driver code
    public static void main(String[] args) {

    }

    /// Solutions

    public static int LCIS(int[] a, int[] b) {
        int m = b.length;
        int ans = 0;
        int[] dp = new int[m];

        for (int ele : a) { // check for every ele of a[]
            int curMax = 0;

            // check the longest subsequence ending at position j in b and also common in a.
            for (int j = 0; j < m; j++) {

                if (ele > b[j]) curMax = Math.max(curMax, dp[j]);
                else if (ele == b[j]) {  // for equal ele update the dp array.
                    dp[j] = curMax + 1;
                    ans = Math.max(ans, dp[j]);
                }
            }
        }

        return ans;
    }
}
