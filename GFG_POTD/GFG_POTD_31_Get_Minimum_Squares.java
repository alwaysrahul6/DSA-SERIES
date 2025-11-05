package GFG_POTD;
import java.util.Arrays;
import java.util.Scanner;

/*
 * http://geeksforgeeks.org/problems/get-minimum-squares0538/1
 *
 * #. Get Minimum Squares
 *
 * Q. Given a positive integer n, find the minimum number of perfect squares (square of an integer) that sum up to n.
 *    Note: Every positive integer can be expressed as a sum of square numbers since 1 is a perfect square, and any number can be represented as 1*1 + 1*1 + 1*1 + ....
 *    Examples:
 *    Input: n = 100
 *    Output: 1
 *    Explanation: 10 * 10 = 100
 * */
public class GFG_POTD_31_Get_Minimum_Squares {

    public static int dp[] = new int[100001];
// Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");

        int n = scanner.nextInt();
        System.out.println("Min Number is : " + minSquares(n));
    }
// Solutions
    public static int minSquares(int n) {
        Arrays.fill(dp , -1);
        return helper(n);
    }

    private static int helper(int n) {
        if (n == 0)return 0;

        if (dp[n] != -1)return dp[n];

        int min = Integer.MAX_VALUE;

        for (int i =1; i*i<= n; i++){
            int result = 1 + helper(n - i * i);
            min = Math.min(result , min);
        }
        return min;
    }

}
