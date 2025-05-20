/* *https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/trapping-rain-water-1587115621
    ╔════════════════════════════════════════════════════════════╗
    ║                    Trapping Rain Water                     ║
    ╚════════════════════════════════════════════════════════════╝
    Problem:
    Given an array `arr[]` with non-negative integers representing the height of blocks.
    If the width of each block is 1, compute how much water can be trapped between
    the blocks after it rains.

    Example:
        Input  : arr[] = [3, 0, 1, 0, 4, 0, 2]
        Output : 10
        Explanation:
        Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units
*/

package GFG_160_SERIES;

import java.util.Scanner;

public class GFG_59_Trapping_Rain_Water {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(maxWater(arr));
    }

    public static int maxWater(int arr[]) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int ans = 0;

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        for (int i = 0; i < n; i++) {
            ans += (Math.min(right[i], left[i]) - arr[i]);
        }

        return ans;
    }
}
