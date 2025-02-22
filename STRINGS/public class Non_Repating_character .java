/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/non-repeating-character-1587115620

Non Repeating Character
Difficulty: EasyAccuracy: 40.43%Submissions: 273K+Points: 2Average Time: 30m
Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
 */

package STRINGS;

 public class Non_Repating_character {
    static char reopeating(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return s.charAt(i);
            }

        }
        return '$';

    }

    public static void main(String[] args) {
        String s = "RAhul";
        System.out.println(reopeating(s));
    }
}
