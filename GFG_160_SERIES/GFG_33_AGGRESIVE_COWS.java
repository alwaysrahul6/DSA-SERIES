package GFG_160_SERIES;
/*  * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/aggressive-cows
    * Q-Aggressive Cows
    * You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.
    * Examples :
    * Input: stalls[] = [1, 2, 4, 8, 9], k = 3
    * Output: 3
    * Explanation: The first cow can be placed at stalls[0], 
    * the second cow can be placed at stalls[2] and 
    * the third cow can be placed at stalls[3]. 
    * The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.
 * */
import java.util.Arrays;
import java.util.Scanner;
public class GFG_33_AGGRESIVE_COWS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = scanner.nextInt();
        System.out.println("Enter Element:");
        int []stalls = new int[n];
        for (int i =0;i<n;i++){
            stalls[i] = scanner.nextInt();
        }
        System.out.println("Enter K:");
        int k = scanner.nextInt();
        System.out.println(aggressiveCows(stalls,k));
    }

    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int ans = 0;
        int start = 1;
        int end = stalls[n - 1] - stalls[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 1, pos = stalls[0];
            for (int i = 1; i < n; i++) {
                if (pos + mid <= stalls[i]) {
                    count++;
                    pos = stalls[i];
                }
            }
            if (count < k) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }

        }
        return ans;
    }
}

