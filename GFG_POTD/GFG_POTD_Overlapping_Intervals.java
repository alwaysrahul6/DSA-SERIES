package GFG_POTD;

import java.util.*;

/*
 * Q. Overlapping Intervals
 *
 *  #. Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.
 *    Examples:
 *       Input: arr[][] = [[1, 3], [2, 4], [6, 8], [9, 10]]
 *       Output: [[1, 4], [6, 8], [9, 10]]
 *       Explanation: In the given intervals we have only two overlapping intervals here, [1, 3] and [2, 4] which on merging will become [1, 4].
 *       Therefore we will return [[1, 4], [6, 8], [9, 10]].
 *       Input: arr[][] = [[6, 8], [1, 9], [2, 4], [4, 7]]
 *       Output: [[1, 9]]
 *       Explanation: In the given intervals all the intervals overlap with the interval [1, 9]. Therefore we will return [1, 9].
 * */
public class GFG_POTD_Overlapping_Intervals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        System.out.println("Enter intervals:");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // start
            arr[i][1] = sc.nextInt(); // end
        }

        // Call your method
        ArrayList<int[]> result = mergeOverlap(arr);

        // Print result
        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
  
    public static ArrayList<int[]> mergeOverlap(int[][] arr) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            int j;

            for (j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(arr[j][1], end);
                } else {
                    break;
                }
            }

            ans.add(new int[]{start, end});
            i = j - 1;
        }
        return ans;
    }
}
