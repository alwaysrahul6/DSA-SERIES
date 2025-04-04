package ARRAYS;

import java.util.Scanner;

/* Q-Minimum Jumps (47 LeetCode)
* You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
* Return true if you can reach the last index, or false otherwise.
* Example 1:
* Input: nums = [2,3,1,1,4]
* Output: true
* Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index. */
public class Minimum_Jumps {
    static boolean solve(int arr[]){
        int n = arr.length;
        int maxIndex =0;
        for (int i =0;i<n;i++){
            if (i>maxIndex)return false;
            maxIndex = Math.max(maxIndex,arr[i]+i);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));

    }
}
