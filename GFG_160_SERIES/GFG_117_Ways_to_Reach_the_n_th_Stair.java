package GFG_160_SERIES;/*
 *
 * https://www.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1
 *
 * # Ways to Reach the n'th Stair
 * 
 *   Q. There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 
 *      stair or 2 stairs at a time. Your task is to count the number of ways, the person can reach the top (order 
 *      does matter).
 *   Ex.
 *      Input : n = 4
 *      Output: 5
 *      Explanation: There are five ways to reach 4th stair: {1, 1, 1, 1}, {1, 1, 2}, {2, 1, 1}, {1, 2, 1} and {2, 2}.
 */

import java.util.Arrays;
import java.util.Scanner;

public class GFG_117_Ways_to_Reach_the_n_th_Stair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element: ");
        int n  = scanner.nextInt();
        System.out.println(count2(n));
    }

    /*----------------------Memorizatio-----------------------------------------------------------*/
    public static int countWays(int n) {
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp, -1);
        }
        return wayss(n - 1, dp);
    }

    private static int wayss(int i, int[] dp) {
        if (i <= 0) return 1;
        if (dp[i] != -1) return dp[i];

        int oneSteps = wayss(i - 1, dp);
        int TwoSteps = wayss(i - 2, dp);
        return dp[i] = oneSteps + TwoSteps;
    }

    /*-----------------------------Tabulation--------------------------------------------------------*/

    static int tabula(int n) {
        if (n <= 0) return 1;
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /*---------------------Space Optimization----------------------------------------------------*/

   static int count2(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 2; i < n; i++) {
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
}
