package GFG_POTD;

import java.util.Arrays;
import java.util.Scanner;

/* https://www.geeksforgeeks.org/problems/buy-stock-with-cooldown/1
 * Stock Buy and Sell with Cooldown
 *
 * Q. Given an array arr[], where the ith element of arr[] represents the price
 *    of a stock on the ith day (all prices are non-negative integers).
 *    Find the maximum profit you can make by buying and selling stocks such that after selling a stock,
 *    you cannot buy again on the next day (i.e., there is a one-day cooldown).
 *
 *  Examples:
 *  Input: arr[] = [0, 2, 1, 2, 3]
 *  Output: 3
 *  Explanation: You first buy on day 1, sell on day 2 then cool down, then buy on day 4, and sell on day 5.
 *               The total profit earned is (2-0) + (3-2) = 3, which is the maximum achievable profit.
 *
 *
 * */
public class GFG_POTD_37_Stock_Buy_and_Sell_with_Cooldown {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter stock prices: ");
            String[] s = sc.nextLine().split(" ");
            int n = s.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);
            System.out.println("Max profit: " + maxProfit(arr));
    }

    public static int maxProfit(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][2];

        for (int []rows : dp){
            Arrays.fill(rows , -1);
        }

        int ans = solve(0 , n , arr ,0 , dp);
        return ans;
    }

    private static int solve(int i, int n, int[] arr, int bought, int[][] dp) {
        ///  Base Case
        if (i >= n) return 0;
        if(dp[i][bought] != -1){
            return dp[i][bought];
        }
        int profit = 0;
        if (bought == 0){
          profit =   Math.max(-arr[i] + solve(i+1 , n ,arr, 1,dp) ,  solve(i+1 , n, arr, 0, dp));
        }else {
           profit =  Math.max(arr[i] + solve(i+2 , n ,arr, 0,dp) ,  solve(i+1 , n, arr, 1, dp));
        }
        return profit;
    }
}
