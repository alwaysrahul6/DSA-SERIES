package GFG_160_SERIES;

/*    * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/non-overlapping-intervals
      * Q-Non-overlapping Intervals
      * Given a 2D array intervals[][] of representing intervals where intervals [i] = [starti, endi ]. Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
      * Examples:
      * Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]
      * Output: 1
      * Explanation: [1, 3] can be removed and the rest of the intervals are non-overlapping.

 * */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GFG_26_Non_overlapping_Intervals {
    /// Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = scanner.nextInt();

        int[][] intervals = new int[n][2];
        System.out.println("Enter intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        System.out.println("Minimum intervals to remove: " + solve(intervals));

        scanner.close();
    }
///  Driver Code
    private static int solve(int interval[][]) {

        int n = interval.length;
        if (n == 0) return 0;
        Arrays.sort(interval, Comparator.comparingInt(a -> a[1]));
        int count = 1;
        int prev = 0;
        for (int i = 1; i < n; i++) {
            if (interval[i][0] >= interval[prev][1]) {
                prev = i;
                count++;
            }
        }
        return interval.length - count;
    }
}
