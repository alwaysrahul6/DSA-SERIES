package LEETCODE_POTD;
/*
 * Minimum Element After Replacement With Digit Sum
 * Q.  You are given an integer array nums.
 *     You replace each element in nums with the sum of its digits.
 *     Return the minimum element in nums after all replacements.
 *     Example 1:
 *     Input: nums = [10,12,13,14]
 *     Output: 1
 *     Explanation:
 *     nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1.
 * */
import java.util.Scanner;

public class LeetCode_Potd_Minimum_Element_After_Replacement_With_Digit_Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        String []s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(minElement(arr));
    }

    public static int minElement(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int tem;
        for (int num : nums) {
            tem = solvemin(num);
            if (tem < ans) {
                ans = tem;
            }
        }
        return ans;
    }

    private static int solvemin(int num) {
        int last = 0;
        while (num > 0){
            last += num % 10;
            num/= 10;
        }
        return last;
    }
}
