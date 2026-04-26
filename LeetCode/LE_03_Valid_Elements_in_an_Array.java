package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* https://leetcode.com/contest/weekly-contest-499/problems/valid-elements-in-an-array/description/
 * You are given an integer array nums.
 *  An element nums[i] is considered valid if it satisfies at least one of the following conditions:
 *  It is strictly greater than every element to its left.
 *  It is strictly greater than every element to its right.
 *  The first and last elements are always valid.
 *  Return an array of all valid elements in the same order as they appear in nums.
 *  Example 1:
 *  Input: nums = [1,2,4,2,3,2]
 *  Output: [1,2,4,3,2]
 *  Explanation:
 *  nums[0] and nums[5] are always valid.
 *  nums[1] and nums[2] are strictly greater than every element to their left.
 *  nums[4] is strictly greater than every element to its right.
 *  Thus, the answer is [1, 2, 4, 3, 2].
 *
 * Constraints:
 *  1 <= nums.length <= 100
 *  1 <= nums[i] <= 100
 * */
public class LE_03_Valid_Elements_in_an_Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        List<Integer> ans = findValidElements(arr);
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }

    }

    public static List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        rightMax[n-1] = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1] , nums[i-1]);
        }
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1] , nums[i+1]);
        }

        for(int i = 0; i < n; i++){
            if(i == 0 || i == n-1 || nums[i] > leftMax[i] || nums[i] > rightMax[i]){
                ans.add(nums[i]);
            }
        }
        return ans;

    }
}
