package GFG_160_SERIES;
/*  *    https://www.geeksforgeeks.org/batch/gfg-160-problems/track/dynamic-programming-gfg-160/problem/0-1-knapsack-problem0945
*   *    0 - 1 Knapsack Problem
*      Q. Given n items, each with a specific weight and value, and a knapsack with a capacity of W,
*         the task is to put the items in the knapsack such that the sum of weights of the 
*         items <= W and the sum of values associated with them is maximized.
    *   Note: You can either place an item entirely in the bag or leave it out entirely. Also, each item is available in single quantity.
    * 
    *  Examples :
    *   Input: W = 4, val[] = [1, 2, 3], wt[] = [4, 5, 1] 
    *   Output: 3
    *   Explanation: Choose the last item, which weighs 1 unit and has a value of 3.

 *   */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_119_0_1_Knapsack_Problem {
// Driver Code


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Cost");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int[] wt = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter Value: ");
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter Weight of The Bag :");
        int W = scanner.nextInt();
        System.out.println(knapscak(W, wt, val));

    }



    /*--------------------------Memorizaton-----------------------------------------------*/

    static int knapscak(int W, int val[], int wt[]) {

        int n = wt.length;
        int[][] dp = new int[n][W];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return solve(W, val, wt, n - 1, dp);

    }

    private static int solve(int W, int[] val, int[] wt, int idx, int[][] dp) {

        /// Base case
        if (idx < 0 || W == 0) return 0;

        //Dp Check

        if (dp[idx][W] != -1) return dp[idx][W];

        /// Reccursive Work
        int take = 0;

        if (wt[idx] <= W) {

            take = val[idx] + solve(W - wt[idx], val, wt, idx - 1, dp);
        }
        int nottake = solve(W, val, wt, idx - 1, dp);

        return dp[idx][W] = Math.max(take, nottake);
    }

    /*---------------------------Tabulation------------------------------------------*/


    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];
        int m = dp[0].length;

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][W];

    }


}
