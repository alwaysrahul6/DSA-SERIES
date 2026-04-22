package LeetCode;

import java.util.Scanner; 
/*
 * Smallest Stable Index I
 * Q. You are given an integer array nums of length n and an integer k.
 *    For each index i, define its instability score as max(nums[0..i]) - min(nums[i..n - 1]).\
 *    In other words:
 *    max(nums[0..i]) is the largest value among the elements from index 0 to index i.
 *    min(nums[i..n - 1]) is the smallest value among the elements from index i to index n - 1.
 *    An index i is called stable if its instability score is less than or equal to k.
 *    Return the smallest stable index. If no such index exists, return -1.
 *   Example 1:
 *   Input: nums = [5,0,1,4], k = 3
 *   Output: 3
 *   Explanation:
 *   At index 0: The maximum in [5] is 5, and the minimum in [5, 0, 1, 4] is 0, so the instability score is 5 - 0 = 5.
 *   At index 1: The maximum in [5, 0] is 5, and the minimum in [0, 1, 4] is 0, so the instability score is 5 - 0 = 5.
 *   At index 2: The maximum in [5, 0, 1] is 5, and the minimum in [1, 4] is 1, so the instability score is 5 - 1 = 4.
 *   At index 3: The maximum in [5, 0, 1, 4] is 5, and the minimum in [4] is 4, so the instability score is 5 - 4 = 1.
 *   This is the first index with an instability score less than or equal to k = 3. Thus, the answer is 3.
 *
 * Constraints:
 *   1 <= nums.length <= 100
 *   0 <= nums[i] <= 109
 *   0 <= k <= 109

 * */
public class LE_01_Smallest_Stable_Index {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter K :");
        int k = scanner.nextInt();
        System.out.println(STR."Smallest Stable Index is  : \{firstStableIndex(arr, k)}");

    }

    public static int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int nextmin[] = new int[n];
        nextmin[n-1] = nums[n-1];
        for (int i = n-2; i>=0; i--){
            nextmin[i] = Math.min(nextmin[i+1] , nums[i]);
        }
        int prevMax = nums[0];
        for (int i = 0; i < n; i++){
            prevMax = Math.max(prevMax , nums[i]);

            if (prevMax - nextmin[i] <= k)return i;
        }
        return -1;
    }
}
