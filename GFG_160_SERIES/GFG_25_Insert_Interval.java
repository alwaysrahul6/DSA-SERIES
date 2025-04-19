package GFG_160_SERIES;
/*
    * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/insert-interval-1666733333
    *  Q-Insert Interval
    * Geek has an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith event and intervals is sorted in ascending order by starti. He wants to add a new interval newInterval= [newStart, newEnd] where newStart and newEnd represent the start and end of this interval.
    * Help Geek to insert newInterval into intervals such that intervals is still sorted in ascending order by starti
    * and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
    * Examples:
    * Input: intervals = [[1,3], [4,5], [6,7], [8,10]], newInterval = [5,6]
    * Output: [[1,3], [4,7], [8,10]]
    * Explanation: The newInterval [5,6] overlaps with [4,5] and [6,7].
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class GFG_25_Insert_Interval {
    /// Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read existing intervals
        System.out.print("Enter the number of intervals: ");
        int n = scanner.nextInt();
        int[][] intervals = new int[n][2];
        System.out.println("Enter each interval as 'start end' (sorted by start time):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        // Read new interval
        System.out.print("Enter the new interval as 'start end': ");
        int[] newInterval = new int[2];
        newInterval[0] = scanner.nextInt();
        newInterval[1] = scanner.nextInt();

        // Merge intervals
        ArrayList<int[]> merged = insertInterval(intervals, newInterval);

        // Print result
        System.out.println("Merged intervals:");
        for (int[] interval : merged) {
            System.out.println("[" + interval[0] + " , " + interval[1] + "]");
        }

        scanner.close();
    }

    /// Solution
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        int i = 0;
        /// If overlape doesnt occur
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i++]);
        }
        /// if overlape occur then upadate
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        ans.add(newInterval);
        /// Remaning Element
        while (i < intervals.length) {
            ans.add(intervals[i++]);
        }
        return ans;
    }


}
