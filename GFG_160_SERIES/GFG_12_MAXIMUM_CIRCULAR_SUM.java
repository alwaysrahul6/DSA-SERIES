package GFG_160_SERIES;
/*
* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/max-circular-subarray-sum-1587115620
* Q-Maximum Circular SubArray Sum
* Given an array of integers arr[] in a circular fashion.
* Find the maximum subarray sum that we can get if we assume the array to be circular.
* Examples:
* Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
* Output: 22
* Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.*/

public class GFG_12_MAXIMUM_CIRCULAR_SUM {
    static int solve(int []arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int s1 =0,s2 =0,totalSum =0;
        for (int i =0;i<n;i++){
            totalSum+=arr[i];
            s1+=arr[i];
            s2+=arr[i];

            max = Math.max(max,s1);
            min = Math.min(min,s2);
            if (s1<0){
                s1 =0;//only max value
            }
            if (s2>0){
                s2 =0;//only min value
            }
        }
        return Math.max(max,totalSum-min);
    }

    public static void main(String[] args) {
        int []arr = {10, -3, -4, 7, 6, 5, -4, -1};
        System.out.println(solve(arr));
    }
}
