package ARRAYS;
/*
https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_cardGiven an array arr[] containing integers and an integer k,
your task is to find the length of the longest subarray
where the sum of its elements is equal to the given value k.
If there is no subarray with sum equal to k, return 0.
Examples:
Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
Output: 6
Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10].
The length of the longest subarray with a sum of 15 is 6.*/
import java.util.HashMap;

public class Longest_Subarray_with_Sum_K {
    public static  int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int prefixSum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int ans =0;
        for(int  i=0;i<n;i++){
            prefixSum+=arr[i];
            int index = (map.containsKey(prefixSum-k)? map.get(prefixSum -k) : i);
            ans = Math.max(ans,i-index);
            if(!map.containsKey(prefixSum))map.put(prefixSum,i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, -10};
        int k =15;
        System.out.println(longestSubarray(arr,k));
    }
}
