package GFG_160_SERIES;
/*      *    https://www.geeksforgeeks.org/batch/gfg-160-problems/track/dynamic-programming-gfg-160/problem/min-cost-climbing-stairs
        * Min Cost Climbing Stairs

        *  Q.  Given an array of integers cost[] where cost[i] is the cost of the ith step on a staircase. Once the cost is paid, you can either climb one or two steps. Return the minimum cost to reach the top of the floor.
        *     Assume 0-based Indexing. You can either start from the step with index 0, or the step with index 1.
        *
        *     Examples:
        *             Input: cost[] = [10, 15, 20]
        *             Output: 15
        *     Explanation: Cheapest option is to start at cost[1], pay that cost, and go to the top.
*/
import java.util.Arrays;
import java.util.Scanner;

public class GFG_118_Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int []arr = new int[n];
        for (int i = 0;i < n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Minimum Cost of Climbing Stairs" + minCostClimbingStairs(arr));
    }

    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int []dp = new int[n+1];
        Arrays.fill(dp,-1);
       return Math.min(stairs(cost , n ,dp) , stairs(cost, n-1,dp));
    }

    private static int stairs(int[] cost, int i,int dp[]) {
        if (i <= 0)return 0;
        if (dp[i] != -1)return dp[i];
        int first = stairs(cost, i-1 ,dp);
        int second = stairs(cost , i - 2,dp);
        return dp[i] = Math.min( first + cost[i-1] ,second + cost[i-1]);
    }

    /*Tabulation*/

    static int table(int[] cost) {

        int n = cost.length;
        int dp[] = new int[n+1];
        for (int i = 2; i <= n; i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[n];
    }

    /*Space optimization*/

  
  static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int curr = 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int i = 2; i <= n; i++){
            curr = Math.min(prev1+cost[i-1],prev2+cost[i-2]);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }


}


