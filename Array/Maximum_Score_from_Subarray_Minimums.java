package ARRAYS;
/*
* Maximum Score from Subarray Minimums
 Given an array arr[], with 0-based indexing, select any two indexes, i and j such that i < j. From the subarray arr[i...j], select the smallest and second smallest numbers and add them, you will get the score for that subarray.
 *  Return the maximum possible score across all the subarrays of array arr[].
Examples :
Input : arr[] = [4, 3, 1, 5, 6]
Output : 11*/

import java.util.Scanner;

public class Maximum_Score_from_Subarray_Minimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = pairwithaxSum(arr);
        System.out.println(result);
    }
    public static int pairwithaxSum(int arr[]){
        int ans=0;
        int n = arr.length;
        for (int i =1;i<n;i++){
            ans = Math.max(ans,arr[i]+arr[i-1]);
        }
        return ans;
    }
}
