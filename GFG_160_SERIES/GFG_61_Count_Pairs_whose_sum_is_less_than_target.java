package GFG_160_SERIES;
/*   *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-pairs-whose-sum-is-less-than-target
     *  Count Pairs whose sum is less than target
     *
     * Q. Given an array arr[] and an integer target. You have to find the number of pairs in the array whose sum is strictly less than the target.
     *   Examples:
     *   Input: arr[] = [7, 2, 5, 3], target = 8
     *   Output: 2
     *   Explanation: There are 2 pairs with sum less than 8: (2, 5) and (2, 3).  */
import java.util.Arrays;
import java.util.Scanner;
///Driver Code.
public class GFG_61_Count_Pairs_whose_sum_is_less_than_target {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Element:");
        String[] s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter Target:");
        int target = scanner.nextInt();
        System.out.println(countPairs(arr, target));
    }
///Solution
    private static int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] >= target) j--;
            else {
                count += j - i;
                i++;
            }
        }
        return count;
    }
}
