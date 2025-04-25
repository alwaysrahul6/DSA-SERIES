package BINARY_SEARCH;
/*   * https://www.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1
     *
     * Capacity To Ship Packages Within D Days
     *
     *   Q.Given an array arr[] of n weights. Find the least weight capacity of a boat to ship all weights
     *     within d days.
     *
     *
     *   The ith weight has a weight of arr[i]. Each day, we load the boat with weights given by arr[i].
     *    We may not load more weight than the maximum weight capacity of the ship.
     *
     *   Note: You have to load weights on the boat in the given order.
     * Ex:
     *   Input:
     *       n = 3
     *       arr[] = {1, 2, 1}
     *       d = 2
     *   Output:
     *      3
     *   Explanation:
     *       We can ship the weights in 2 days
     *       in the following way:-
     *       Day 1- 1,2
     *       Day 2- 1
 * */



import java.util.Scanner;

public class Searching_SHIP_PACKAGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elements: ");
        String[] s = scanner.nextLine().split(" ");

        int n = s.length;
        int []arr = new int[n];

        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Number of Days:");
        int d= scanner.nextInt();
        System.out.println(leastWeightCapacity(arr,n,d));
    }

    private static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        int start = 0, end = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, d, mid)) {
                ans = mid;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int d, int boatCapacity) {
        int days = 1, sum = 0;
        for (int j : arr) {
            sum += j;
            if (sum > boatCapacity) {
                sum = j;
                days++;
            }
        }
        return days <= d;
    }

}
