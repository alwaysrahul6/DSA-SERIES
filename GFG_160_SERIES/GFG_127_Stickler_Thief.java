package GFG_160_SERIES;/*
 * https://www.geeksforgeeks.org/problems/stickler-theif-1587115621/1
 * Stickler Thief
 * Q. Stickler the thief wants to loot money from the houses arranged in a line.
 *   He cannot loot two consecutive houses and aims to maximize his total loot.
 *   Given an array, arr[] where arr[i] represents the amount of money in the i-th house.
 *   Determine the maximum amount he can loot.
 *   Ex. 
 *     Input: arr[] = [6, 5, 5, 7, 4]
 *     Output: 15
 *     Explanation: Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6 + 5 + 4 = 15.
 *  */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_127_Stickler_Thief {
    //Driver Code 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0 ;i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(findMaxSum(arr));
    }
    
/*-----------------Memorization--------------------------------------------------------------*/
    public static int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp , -1);
        return solve(n - 1 , arr,dp);

    }
    static int solve(int idx , int[] arr, int[] dp){
        if (idx < 0)return 0;
        if (dp[idx] != -1)return dp[idx];
        int pick = arr[idx] + solve(idx - 2 , arr, dp);
        int notPick = solve(idx -1 , arr, dp);
        return dp[idx] = Math.max(pick,notPick);
    }

    /*-----------------------------------------Tabulation------------------------------------------------------------*/

    static int SticklerThief(int arr[]){
        int n = arr.length;
        int []dp = new int[n];

        dp[0] = arr[0];

        int neg = 0;

        for (int i = 1; i < n; i++){
            int take  = arr[i];if (i > 1) take+=dp[i-2];
            int nottake = dp[i-1];
            dp[i] = Math.max(take , nottake);
        }
        return dp[n-1];
    }


    /*-----------------Space Optimization-----------------------------------------------------------------------*/

    static int spaceOpt(int arr[]){
        int n = arr.length;
        int prev = arr[0];
        int prev2 = 0;
        for (int i = 1; i < n; i++){
            int take  = arr[i];
            if (i > 1)take+= prev2;
            int nottake  = prev;

            int curri = Math.max(take , nottake);

            prev2 = prev;
            prev = curri;
        }
        return prev;
    }
}
