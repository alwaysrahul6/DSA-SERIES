package GFG_160_SERIES;/*
 * https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
 * 
 * Minimum Platforms
 * 
 * Q.You are given the arrival times arr[] and departure times dep[] of all trains that arrive at a railway station on the same day. 
 *   Your task is to determine the minimum number of platforms required at the station to ensure that no train is kept waiting.
 *   At any given time, the same platform cannot be used for both the arrival of one train and the departure of another.
 *   Therefore, when two trains arrive at the same time, or when one arrives before another departs, additional platforms 
 *   are required to accommodate both trains.
 * 
 * Ex.
 *    Input: arr[] = [900, 940, 950, 1100, 1500, 1800], dep[] = [910, 1200, 1120, 1130, 1900, 2000]
 *    Output: 3
 *    Explanation: There are three trains during the time 9:40 to 12:00. So we need a minimum of 3 platforms.

 */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_133_Minimum_Platforms {
    
    /// Driver Code.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Arrival: ");
        String s[] = scanner.nextLine().split(" ");

        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        System.out.println("Enter Departure: ");
        String st[] = scanner.nextLine().split(" ");
        int m = st.length;
        int[] dept = new int[m];
        for (int i = 0; i < m; i++) {
            dept[i] = Integer.parseInt(st[i]);
        }

        System.out.println("Minimum Platform Requird " + findPlatform(arr, dept));

    }
/// Solution

    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int m = dep.length;
        int i = 0, j = 0, ans = 0;
        int count = 0;

        while (i < n && j < m) {
            if (arr[i] <= dep[j]) {
                count++;
                ans = Math.max(ans, count);
                i++;
            } else {
                count--;
                j++;
            }
        }
        return ans;
    }
}
