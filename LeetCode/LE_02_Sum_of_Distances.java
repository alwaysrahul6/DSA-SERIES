package LeetCode;

import java.util.*;

/*
 * https://leetcode.com/problems/sum-of-distances/description/
 *  Sum of Distances
 * Q.You are given a 0-indexed integer array nums. There exists an array arr of length nums.length, where arr[i] is the sum of |i - j| over all j such that nums[j] == nums[i] and j != i. If there is no such j, set arr[i] to be 0.
 *  Return the array arr.
 *  Example 1:
 *  Input: nums = [1,3,1,1,2]
 *  Output: [5,0,3,4,0]
 *  Explanation:
 *  When i = 0, nums[0] == nums[2] and nums[0] == nums[3]. Therefore, arr[0] = |0 - 2| + |0 - 3| = 5.
 *  When i = 1, arr[1] = 0 because there is no other index with value 3.
 *  When i = 2, nums[2] == nums[0] and nums[2] == nums[3]. Therefore, arr[2] = |2 - 0| + |2 - 3| = 3.
 *  When i = 3, nums[3] == nums[0] and nums[3] == nums[2]. Therefore, arr[3] = |3 - 0| + |3 - 2| = 4.
 *  When i = 4, arr[4] = 0 because there is no other index with value 2.

 * */
public class LE_02_Sum_of_Distances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        long[] ans = distance(arr);
        System.out.println(Arrays.toString(Arrays.stream(ans).toArray()));

    }

    public static long[] distance(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            List<Integer> list = map.get(val);
            int sum = 0;
            for (Integer integer : list) {
                if (integer != i) {
                    sum += Math.abs(i) - Math.abs(integer);
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}
