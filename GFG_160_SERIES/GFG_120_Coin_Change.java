package GFG_160_SERIES;

/*        *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/dynamic-programming-gfg-160/problem/coin-change2448
          *  Given an integer array coins[ ] representing different denominations of currency and an integer sum,
          *  find the number of ways you can make sum by using different combinations from coins[ ]. 
          * 
          *  Note: Assume that you have an infinite supply of each type of coin. 
          *        Therefore, you can use any coin as many times as you want.
          *        Answers are guaranteed to fit into a 32-bit integer.
          * 
          *       Examples:
          *             Input: coins[] = [1, 2, 3], sum = 4
          * 
          *             Output: 4
          * 
          *     Explanation: Four Possible ways are: [1, 1, 1, 1], [1, 1, 2], [2, 2], [1, 3]. */


import java.util.Arrays;
import java.util.Scanner;


public class GFG_120_Coin_Change {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int []arr = new int[n];
        for (int i = 0;i < n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter Sum:");
        int sum = scanner.nextInt();
        System.out.println(tabul(arr,sum));
    }


    public static int count(int coins[], int sum) {
        int n = coins.length;
        int [][]dp = new int[n][sum];
        for (int []i:dp){
            Arrays.fill(dp, -1);
        }
        return change(coins , sum , n - 1,dp);
    }

    private static int change(int[] coins, int sum, int i, int[][] dp) {
        // Base case

        if (sum == 0) return 1;
        if (i < 0)return 0;

        if (dp[i][sum] != -1)return dp[i][sum];

        int take = 0;
        //Reccursive Work
        if (coins[i] <= sum) {
            take = change(coins, sum - coins[i], i, dp);
        }
        int nottake = change(coins, sum, i - 1, dp);
        return dp[i][sum] = take + nottake;
    }
    /*Tabulation*/

    static int tabul(int cost[] , int sum){
        int n = cost.length;
        int [][]dp = new int[n][sum+1];

        for (int i = 0; i < n;i++){
            dp[i][0] = 1;
        }

        for (int i = 0; i < n; i++){
            for (int j = 1; j <= sum;j++){
                int take  = 0;
                if (cost[i] <= j){
                    take = dp[i][j - cost[i]];
                }
                int nottake  = 0;
                if (i > 0){
                    nottake = dp[i-1][j];
                }
                dp[i][j] = take + nottake;
            }
        }
        return dp[n-1][sum];
    }

}
