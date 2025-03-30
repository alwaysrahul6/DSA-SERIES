package GFG_160_SERIES;
/*https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2
* Q-Stock Buy and Sell – Max one Transaction Allowed
* Given an array prices[] of length n, representing the prices of the stocks on different days.
*  The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed.
*  Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.
* Examples:
Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.*/

import java.util.Scanner;

public class GFG_08Stock_Max_one_Transaction_Allowed {
//    DRIVER CODE
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();
    System.out.println("Enter Element");
    int arr[] = new int[n];
    for (int i =0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(solve(arr));
}
    static int solve(int []arr){
        int min = Integer.MAX_VALUE;
        int max =0;
        for (int i :arr){
            min  = Math.min(min,i);
            max = Math.max(max,(i - min));
        }
        return max;
    }
}
