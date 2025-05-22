package GFG_160_SERIES;
/*     *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/equilibrium-point-1587115620
       *   Equilibrium Point
       *    Q. Given an array of integers arr[], the task is to find the first equilibrium point in the array.
       *     The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists.
       *     Examples:
       *     Input: arr[] = [1, 2, 0, 3]
       *     Output: 2
       *     Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
**/
import java.util.Scanner;
/// Driver Code 
public class GFG_61_Equilibrium_Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(findEquilibrium(arr));

    }
/// Solution
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (sum2 == sum) return i;
            sum2 += arr[i];
        }
        return -1;
    }
}
