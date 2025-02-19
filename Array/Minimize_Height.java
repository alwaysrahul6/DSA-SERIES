/*
  Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.
Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5.
*/

package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Minimize_Height {
    static int minimize(int arr[], int k){
        int n = arr.length;
        Arrays.sort(arr);
        int max = arr[n-1];
        int min = arr[0];
        int ans = max - min;

        for(int i = 1;i < n;i++){
            max = Math.max(arr[n-1]-k, arr[i-1]+k);
            min = Math.min(arr[0]+k, arr[i]-k);
            if( min < 0) continue;
            ans = Math.min(ans, max - min);
        }
        return ans;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Size:");
//        int n = sc.nextInt();
//        System.out.println("Element");
//        int arr [] = new int[n];
//        for (int i =0;i<n;i++){
//            sc.nextInt();
//        }
//        System.out.println("Enter K");
//        int k = sc.nextInt();
//        System.out.println(minimize(arr,k));
        int arr[] = {2,4,6,3,10};
        int k = 3;
        System.out.println(minimize(arr,k));
    }
}
