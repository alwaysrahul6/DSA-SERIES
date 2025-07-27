package BINARY_SEARCH;

/*  * https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1
    * Q- The Painter's Partition Problem-II
    * Dilpreet wants to paint his dog's home that has n boards with different lengths. The length of ith board is given by arr[i] where arr[] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board.
    * Return the minimum time to get this job done if all painters start together with the constraint that any painter will only paint continuous boards, say boards numbered [2,3,4] or only board [1] or nothing but not boards [2,4,5].
    * Examples:
    * Input: arr[] = [5, 10, 30, 20, 15], k = 3
    * Output: 35
    * Explanation: The most optimal way will be: Painter 1 allocation : [5,10], Painter 2 allocation : [30], Painter 3 allocation : [20,15], Job will be done when all painters finish i.e. at time = max(5+10, 30, 20+15) = 35

 * */

import java.util.Scanner;

public class Painter_Partion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input number of walls and painters
        System.out.println("Enter number of walls and painters (separated by space)  : ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        // Input array of time for each wall
        int[] arr = new int[n];
        System.out.println("Enter time required for each wall (space separated):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Calculate and print result
        Painter_Partion solution = new Painter_Partion();
        int result = solution.minTime(arr, k);
        System.out.println("Minimum time required: " + result);

        scanner.close();
    }

    public int minTime(int[] arr, int k) {
        // arr = array of time needed for each wall
        // k = number of painters available

        int n = arr.length;
        int start = 0, end = 0, time = 0, mid;

        // Calculate the search space:
        // - Minimum possible time (start) = time needed for the largest wall
        //   (since one painter must paint the largest wall completely)
        // - Maximum possible time (end) = sum of all wall times
        //   (if only one painter paints all walls)
        for (int i = 0; i < n; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        // Binary search to find the minimum time
        while (start <= end) {
            mid = start + (end - start) / 2;  // Calculate midpoint to avoid overflow

            // Check if current mid (time) is feasible with k painters
            int painter = 1;  // Start with first painter
            int wall = 0;     // Time accumulated by current painter

            for (int i = 0; i < n; i++) {
                wall += arr[i];  // Add current wall to current painter's workload

                // If current painter's workload exceeds mid time
                if (wall > mid) {
                    painter++;    // Need another painter
                    wall = arr[i]; // New painter starts with current wall

                    // If we need more painters than available, break early
                    if (painter > k) {
                        break;
                    }
                }
            }

            // If we can paint all walls with <= k painters in 'mid' time
            if (painter <= k) {
                time = mid;    // Update the answer
                end = mid - 1; // Try to find a smaller time
            } else {
                start = mid + 1; // Need more time, search in upper half
            }
        }
        return time;  // Minimum time found
    }
}
