package GFG_160_SERIES;
/*https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615
* Q-Stock Buy and Sell – Multiple Transaction Allowed
* The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day.
* Examples:
* Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
* Output: 865
* Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210. Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655. Maximum Profit = 210 + 655 = 865.Find the maximum profit that you can get.
 */
import java.util.Scanner;
//Driver Code 
public class GFG_07_Stock_Buy_and_Sell_Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        System.out.println("Enter N Element");
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }
    //Soultion
    static int solve(int arr[]){
        int n = arr.length;
        int sum =0;
        for (int i =1;i<n;i++){
            if (arr[i]>arr[i-1]){
                sum+= arr[i]-arr[i-1];
            }
        }
        return sum;
    }
}
