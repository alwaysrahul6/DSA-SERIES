package GREEDY;/*
 * https://www.geeksforgeeks.org/problems/maximize-partitions-in-a-string/1
 * Maximize partitions in a String
 * 
 * Q. Given a string s of lowercase English alphabets, your task is to return the maximum number of substrings formed, 
 *    after possible partitions (probably zero) of s such that no two substrings have a common character.
 *    
 * Ex.
 *    Input: s = "ababcbacadefegdehijhklij"
 *    Output: 3
 *    Explanation: Partitioning at the index 8 and at 15 produces three substrings: 
 *               “ababcbaca”, “defegde”, and “hijhklij” such that none of them have a common character.
 *    So, the maximum number of substrings formed is 3.
 * */
import java.util.Scanner;

public class GFG_137_Maximize_partitions_in_a_String {
/// Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = scanner.nextLine();
        System.out.println("Max Partion of the String: " + maxPartitions(s));
    }

    /// Solution

    public static int maxPartitions(String s) {
        // code here

        int n  = s.length();

        int []lastindex = new int[26];

        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            lastindex[ch - 'a'] = i ;
        }

        int end = 0 , count = 0;

        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            end = Math.max(end , lastindex[ch - 'a']);

            if (i == end){
                count++;
            }
        }
        return count;
    }

}
