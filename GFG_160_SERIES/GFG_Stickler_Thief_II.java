package GFG_160_SERIES;/*
 * https://www.geeksforgeeks.org/problems/house-robber-ii/1
 * Stickler Thief II
 * Q. You are given an array arr[] which represents houses arranged in a circle, where each house has a certain value. A thief aims to maximize the total stolen value without robbing two adjacent houses.
 *    Determine the maximum amount the thief can steal.
 *    Note: Since the houses are in a circle, the first and last houses are also considered adjacent.
 *    Examples:
 *    Input: arr[] = [2, 3, 2]
 *    Output: 3
 *    Explanation: arr[0] and arr[2] can't be robbed because they are adjacent houses. Thus, 3 is the maximum value thief can rob.
 * */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_Stickler_Thief_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String []s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Max Value :" + table(arr));
    }
 /*----------------------------------------Memorization-------------------------------*/
    int maxValue(int[] arr) {
        int n = arr.length;
        int []dp = new int[n];
        Arrays.fill(dp , -1);
        int sp[] = dp.clone();
        return Math.max(solve(n-1 , 1 , arr,dp) , solve(n-2 , 0 , arr,sp));
    }

    int solve(int idx , int k , int []arr , int []dp){
        if (idx < k)return 0;
        if (dp[idx] != -1)return dp[idx];
        int pick = arr[idx] +  solve(idx - 2 , k , arr,dp);
        int notPick = solve(idx - 1 , k , arr,dp);
        return dp[idx] = Math.max(pick , notPick);
    }


    /*--------------------------Tabulation-----------------------------------------*/

    static int table(int arr[]){
        int n = arr.length;
        int []temp1 = new int[n-1];
        int []temp2 = new int[n-1];
        for (int i = 0; i < n; i++){
            temp1[i] = arr[i];
            temp2[i] = arr[i+1];
        }

        int arrt = thief(temp1);
        int arr2 = thief(temp2);
        return Math.max(arrt,arr2);

    }

    private static int thief(int[] arr) {
        int n = arr.length;
        int []dp = new int[n];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++){
            int take = arr[i];
            if (i > 1)take+=dp[i-2];
            int nottake = dp[i-1];
            dp[i] = Math.max(take , nottake);
        }
        return dp[n-1];
    }
}
