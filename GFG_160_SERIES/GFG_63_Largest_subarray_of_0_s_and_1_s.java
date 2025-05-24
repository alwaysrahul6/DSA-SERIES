package GFG_160_SERIES;
/*      *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/largest-subarray-of-0s-and-1s
        *     Largest subarray of 0's and 1's.
        *     Given an array arr of 0s and 1s.
        *     Find and return the length of the longest subarray with equal number of 0s and 1s.
        *   Examples:
        *   Input: arr[] = [1, 0, 1, 1, 1, 0, 0]
        *   Output: 6
        *   Explanation: arr[1...6] is the longest subarray with three 0s and three 1s.
 */
import java.util.HashMap;
import java.util.Scanner;

public class GFG_63_Largest_subarray_of_0_s_and_1_s {
    /// Driver Code.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(maxLen(arr));
    }
    /// Solution

    public static int maxLen(int[] arr) {
        // Your code here
        int n = arr.length;
        int sum = 0, length = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) arr[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) length = i + 1;
            if (map.containsKey(sum)) {
                int index = map.get(sum);
                length = Math.max(length, i - index);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return length;
    }
}
