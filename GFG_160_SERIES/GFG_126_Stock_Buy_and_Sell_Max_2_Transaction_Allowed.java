package GFG_160_SERIES;
/* *
 * https://www.geeksforgeeks.org/problems/buy-and-sell-a-share-at-most-twice/1
 * Stock Buy and Sell – Max 2 Transactions Allowed
 * Q. In daily share trading, a trader buys shares and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day,
 *    find out the maximum profit that a share trader could have made.
 *    You are given an array prices[] representing stock prices throughout the day. Note that the second transaction can only start after the first one is complete (buy->sell->buy->sell).
 *   Examples:
 *   Input: prices[] = [10, 22, 5, 75, 65, 80]
 *   Output: 87
 *   Explanation:
 *   Trader will buy at 10 and sells at 22.
 *   Profit earned in 1st transaction = 22 - 10 = 12.
 *   Then he buys at 5 and sell at 80.
 *   Profit earned in 2nd transaction = 80 - 5 = 75.
 *   Total profit earned = 12 + 75 = 87.
 *  */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_126_Stock_Buy_and_Sell_Max_2_Transaction_Allowed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String s[] = scanner.nextLine().split(" ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        // code here
        int n  = prices.length;
        int k = 2;
        int [][][]dp = new int[n][k][2];
        for (int [][]i : dp){
            for (int []j: i){
                Arrays.fill(j , -1);
            }
        }
        return maxStock(0 ,0 , k , prices ,n,dp);

    }
    //buy = 1 , sell = 0;

    private static int maxStock(int idx, int buy , int k, int[] prices, int n, int[][][] dp) {
        //Base case

        if (k == 0)return 0;

        if (idx == n)return  0;

        if (dp[n][k][buy] != -1)return dp[n][k][buy];

        int profit = 0;

        if (buy == 1){
            profit = Math.max(-prices[idx] + maxStock(idx + 1 , 0 ,k , prices , n, dp) , maxStock(idx + 1 ,1,k , prices , n, dp));
        }else{
            profit = Math.max(prices[idx] + maxStock(idx + 1 , 1 ,k-1 ,prices ,n, dp) , maxStock(idx + 1 ,0 ,k , prices , n, dp));
        }
        return dp[n][k][buy] = profit;
    }

 
}
