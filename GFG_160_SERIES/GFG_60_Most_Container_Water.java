/* *    https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/container-with-most-water0535
   *    Container With Most Water
   *   Q. Given an array arr[] of non-negative integers, where each element arr[i] represents the height of the vertical lines, find the maximum amount of water that can be contained between any two lines, together with the x-axis.
   *    Note: In the case of a single vertical line it will not be able to hold water.
   *    Examples:
   *    Input: arr[] = [1, 5, 4, 3]
   *    Output: 6
   *    Explanation: 5 and 3 are 2 distance apart. So the size of the base is 2. Height of container = min(5, 3) = 3. So, total area to hold water = 3 * 2 = 6.
 * */
package GFG_160_SERIES;


import java.util.Scanner;

public class GFG_60_Most_Container_Water {
    /// Driver Code
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter Element:");
        String []s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new  int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(maxWater(arr));
    }
    /// Solution
    public static int maxWater(int arr[]) {
        int n = arr.length;
        int ans = 0;
        int i = 0, j = n - 1;
        while (i<j){
            int h = Math.min(arr[i], arr[j]);
            int area = (j - i) * h;
            ans = Math.max(ans, area);
            if (arr[i] < arr[j])
                i++;
            else
                j--;
        }
        return ans;
    }
}
