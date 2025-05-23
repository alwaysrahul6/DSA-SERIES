package GFG_160_SERIES;
/*  *  Longest Subarray with Sum K
    *  Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.
    *   Examples:
    *   Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
    *   Output: 6
    *   Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.*/
import java.util.*;


public class GFG_62_Longest_Subarray_with_Sum_K {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input the array size
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            // Input array elements
            int[] arr = new int[n];
            System.out.print("Enter elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Input value of k
            System.out.print("Enter value of k: ");
            int k = sc.nextInt();



            // Output the result
            System.out.println("Length of longest subarray with sum " + k + ": " + longestSubarray(arr,k));
        }


        public static int longestSubarray(int[] arr, int k) {
            int n = arr.length;
            int prefixSum = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            int ans = 0;
            map.put(0, -1);
            for (int i = 0; i < n; i++) {
                prefixSum += arr[i];
                int index = (map.getOrDefault(prefixSum - k, i));
                ans = Math.max(ans, i - index);
                if (!map.containsKey(prefixSum)) map.put(prefixSum, i);
            }
            return ans;
        }
    }

