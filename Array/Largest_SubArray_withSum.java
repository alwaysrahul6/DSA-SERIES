package ARRAYS;
/*
https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?page=2&category=Arrays,Strings&sortBy=submissionsQ-Largest subarray with 0 sum
Difficulty: MediumAccuracy: 41.84%Submissions: 391K+Points: 4Average Time: 20m
Given an array arr containing both positive and negative integers, the task is to compute the length of the largest subarray that has a sum of 0.
Examples:
Input: arr[] = [15, -2, 2, -8, 1, 7, 10, 23]
Output: 5
Explanation: The largest subarray with a sum of 0 is [-2, 2, -8, 1, 7].
* */
import java.util.HashMap;
import java.util.Scanner;

public class Largest_SubArray_withSum {
    public static int suble(int arr[]) {
        {

            // Map to store the previous sums
            HashMap<Integer, Integer> presum = new HashMap<>();

            int sum = 0;
            int max_len = 0;

            // Traverse through the given array
            for (int i = 0; i < arr.length; i++) {

                // Add current element to sum
                sum += arr[i];

                // If the sum is 0, update max_len
                if (sum == 0) {
                    max_len = i + 1;
                }

                // Check if this sum is seen before
                if (presum.containsKey(sum)) {

                    // If this sum is seen before, update
                    // max_len
                    max_len = Math.max(max_len,
                            i - presum.get(sum));
                } else {

                    // If this sum is not seen before, add it to
                    // the map
                    presum.put(sum, i);
                }
            }

            return max_len;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(suble(arr));
    }
}
