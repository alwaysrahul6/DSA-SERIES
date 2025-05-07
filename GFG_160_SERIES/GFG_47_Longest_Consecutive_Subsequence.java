package GFG_160_SERIES;
/*   *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/longest-consecutive-subsequence2449
     *  Longest Consecutive Subsequence.
     *  Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
     *  Examples:
     *  Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
     *  Output: 6
     *  Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.
 **/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GFG_47_Longest_Consecutive_Subsequence {
    /// Driver Code 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String s[] = scanner.nextLine().split(" ");
        int n =s.length;
        int a[] = new int[n];
        for (int i  =0;i<n;i++){
            a[i] = Integer.parseInt(s[i]);
        }
        System.out.println(longestConsecutive(a));
    }
    
    /// Solution
    public static int longestConsecutive(int[] arr) {
        // code here
        int n = arr.length;
        int max = 0;
        Set<Integer>set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        for (int i : set){
            if (!set.contains(i - 1)){
                int curr  = i;
                int count  = 1;
                while (set.contains(curr +  1)){
                    count++;
                    curr++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
