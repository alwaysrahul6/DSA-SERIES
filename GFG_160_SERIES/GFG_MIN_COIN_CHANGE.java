package GFG_160_SERIES;/*
 * https://www.geeksforgeeks.org/problems/number-of-coins1824/1
 * Coin Change (Minimum Coins)
 * Q. You are given an array coins[], where each element represents a coin of a different denomination, 
 * and a target value sum. You have an unlimited supply of each coin type {coins1, coins2, ..., coinsm}.
 * Your task is to determine the minimum number of coins needed to obtain the target sum. If it is not possible to form the sum using the given coins, return -1.
 * Examples:
 * Input: coins[] = [25, 10, 5], sum = 30
 * Output: 2
 * Explanation: Minimum 2 coins needed, 25 and 5  
 *  */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_MIN_COIN_CHANGE {
    /*Driver Code */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter Sum:");
        int sum = scanner.nextInt();
        System.out.println(minCoin(arr, sum));
    }
/*----------------------------------------Memorization------------------------------------------------------------------------*/
    static int minCoin(int coin[], int Sum) {

        int n = coin.length;
        int[][] dp = new int[n][Sum + 1];
        for (int[] x : dp) {
            Arrays.fill(x, -1);
        }
        int ans = coins(coin, n - 1, Sum, dp);
        return (ans == 1e9) ? -1 : ans;

    }

    private static int coins(int[] coin, int i, int sum, int[][] dp) {

        //Base case

        if (i == 0) {
            if (sum % coin[i] == 0) return sum / coin[i];
            else return (int) 1e9;
        }

        //Dp check

        if (dp[i][sum] != -1) return dp[i][sum];

        // Reccursive Work

        int nottake = coins(coin, i - 1, sum, dp);

        int take = Integer.MAX_VALUE - 1;

        if (coin[i] <= sum) {
            take = 1 + coins(coin, i, sum - coin[i], dp);
        }
        return dp[i][sum] = Math.min(take, nottake);
    }


    /*  Tabulation  */

    static int tabule(int cost[], int sum) {

        int n = cost.length;
        int dp[][] = new int[n][sum + 1];

        for (int i = 0; i <= sum; i++) {
            if (sum % cost[0] == 0)  dp[0][i] = sum / cost[0];
            else  dp[0][i] = (int) 1e9;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= sum; j++) {

                int nottake = dp[i - 1][j];

                int take = Integer.MAX_VALUE - 1;

                if (cost[i] <= j) {
                    take = 1 + dp[i][j - cost[i]];
                }
                dp[i][j] = Math.min(take, nottake);

            }
        }
        return dp[n - 1][sum];
    }

}
