package BINARY_SEARCH;
/*      * Smallest Divisor
        * Given an integer array arr[] and an integer k (where k ≥ arr.length), 
        * find the smallest positive integer divisor such that the sum of the ceiling values of each element in arr[] divided 
        * by this divisor is less than or equal to k.
        *    Examples:
        *    Input: arr[] = [1, 2, 5, 9], k = 6
        *    Output: 5
        *    Explanation: 5 is the smallest divisor having sum of quotients (1 + 1 + 1 + 2 = 5) less than or equal to 6.*/
import java.util.Scanner;
/// Driver Code 
public class Searching_Smallest_Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter k");
        int k = scanner.nextInt();
        System.out.println(smallestDivisor(arr, k));
    }
/// Solution
    static int smallestDivisor(int[] arr, int k) {
        // Code here
        int i = 1, j = getamx(arr);
        int ans = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (sum(arr, mid) <= k) {
                ans = mid;
                j = mid - 1;
            } else
                i = mid + 1;
        }
        return ans;
    }
/// Get Max Elemnt into array
    private static int getamx(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }

/// sum all ceiling values
    private static int sum(int[] arr, int mid) {
        int ans = 0;
        for (int j : arr) {
            ans += (int) Math.ceil((double) j / mid);
        }
        return ans;
    }
}
