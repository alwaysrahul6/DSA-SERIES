package BINARY_SEARCH;
/*      *    https://www.geeksforgeeks.org/problems/equalize-the-towers2804/1
*       *    Equalize the Towers
        *    Difficulty: MediumAccuracy: 48.36%Submissions: 5K+Points: 4
        *    You are given an array heights[] representing the heights of towers and another array cost[] where each element represents the cost of modifying the height of respective tower.
        *    The goal is to make all towers of same height by either adding or removing blocks from each tower.
        *    Modifying the height of tower (add or remove) 'i' by 1 unit costs cost[i].
        *    Return the minimum cost to equalize the heights of all towers.
        *    Examples:
        *    Input: heights[] = [1, 2, 3], cost[] = [10, 100, 1000]
        *    Output: 120
        *    Explanation: The heights can be equalized by either "Removing one block from 3 and adding one in 1" or "Adding two blocks in 1 and adding one in 2". Since the cost of operation in tower 3 is 1000, the first process would yield 1010 while the second one yields 120.*/
import java.util.Arrays;

public class Searching_Equalize_the_Towers {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int cost[] = {10, 100, 1000};
        System.out.println(minCost(arr,cost));
    }
    public static int minCost(int[] heights, int[] cost) {
        int lo = Arrays.stream(heights).min().getAsInt();
        int hi = Arrays.stream(heights).max().getAsInt();
        int ans = Integer.MAX_VALUE;
        while (lo <= hi){
            int mid = (lo + hi)/2;
            int costmid = getcost(heights, cost , mid);
            int leftmid = getcost(heights, cost , mid-1);
            int rightmid = getcost(heights, cost , mid+1);
            ans = Math.min(ans,costmid);

            if (leftmid < costmid){
                hi = mid -1;
            } else if (rightmid <= costmid) {
                lo = mid +1;
            }
            else break;
        }
        return ans;
    }
    private static int getcost(int[] heights, int[] cost, int mid) {
        int total = 0;
        for (int i = 0;i<heights.length;i++){
            total+=Math.abs(heights[i] - mid)* cost[i];
        }
        return total;
    }
}
