package GFG_160_SERIES;
/* 
* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/max-circular-subarray-sum-1587115620
* Q- KADANES ALGORITHIM , MAXIMUM SUBARRAY WITH SUM
* Given an array of integers arr[] in a circular fashion. Find the maximum subarray sum that we can get if we assume the array to be circular.
* Examples:
* Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
* Output: 22
* */
import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class GFG_10_KADNES_ALGORITHIM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = scanner.nextInt();
        System.out.println("Enter The Element");
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(solve(arr));
    }
    private static int solve (int arr[]){
        int  n = arr.length;
        int maxSum =Integer.MIN_VALUE;
        int currSum =0;
        for (int i =0;i<n;i++){
            currSum+=arr[i];
            if (currSum>maxSum){
                maxSum = currSum;
            }
            if (currSum<0){
                currSum =0;
            }
        }

        return maxSum;
    }
}
