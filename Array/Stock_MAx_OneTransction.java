package ARRAYS;
/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2
Given an array prices[] of length n,
representing the prices of the stocks on different days.
The task is to find the maximum profit possible by buying and
selling the stocks on different days when at most one transaction is allowed.
Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.
Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9.
Hence, the profit is 8.

 */
public class Stock_MAx_OneTransction {
    static int stock(int prices[]){
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int res =0;
        for (int i : prices){
            min = Math.min(i,min );
            res = Math.max(res,(i - min));
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = {2,5,7,8,6,10};
        System.out.println(stock(arr));
    }
}
