package GFG_160_SERIES;
/*    *    https://www.geeksforgeeks.org/batch/gfg-160-problems/track/queue-and-deque-gfg-160/problem/longest-bounded-difference-subarray
*     *     Longest Bounded-Difference Subarray
*     *  Q.Given an array of positive integers arr[] and a non-negative integer x, the task is to find the longest sub-array where the absolute difference between any two elements is not greater than x.
      *     If multiple such subarrays exist, return the one that starts at the smallest index.
      *     Examples: 
      *     Input: arr[] = [8, 4, 2, 6, 7], x = 4 
      *     Output: [4, 2, 6] 
      *     Explanation: The sub-array described by index [1..3], i.e. [4, 2, 6] contains no such difference of two elements which is greater than 4.
 */
      
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class GFG_109_Longest_Bounded_Difference_Subarray {
/// Driver Code  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String[] s = scanner.nextLine().split(" ");

        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println(longestSubarray(arr, x));
    }

    /// Solution
    public static ArrayList<Integer> longestSubarray(int[] arr, int x) {
        Deque<Integer> minDeq = new ArrayDeque<>();
        Deque<Integer> maxDeq = new ArrayDeque<>();

        int s = 0, e = 0;
        int ansStart = 0, ansEnd = 0;
        int n = arr.length;
        while (e < n) {
            while (!minDeq.isEmpty() && arr[minDeq.peekLast()] > arr[e]) minDeq.pollLast();
            while (!maxDeq.isEmpty() && arr[maxDeq.peekLast()] < arr[e]) maxDeq.pollLast();
            minDeq.offerLast(e);
            maxDeq.offerLast(e);

            while (arr[maxDeq.peekFirst()] - arr[minDeq.peekFirst()] > x) {
                if (s == minDeq.peekFirst()) minDeq.pollFirst();
                if (s == maxDeq.peekFirst()) maxDeq.pollFirst();
                s++;
            }

            if (e - s > ansEnd - ansStart) {
                ansEnd = e;
                ansStart = s;
            }
            e++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = ansStart; i <= ansEnd; i++) {
            ans.add(arr[i]);
        }
        return ans;

    }
}
