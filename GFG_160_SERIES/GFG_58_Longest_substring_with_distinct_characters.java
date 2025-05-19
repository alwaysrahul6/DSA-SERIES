                /***************************************************************************
                 *                           ✨ GFG Problem Series ✨                      *
                 * ----------------------------------------------------------------------- *
                 * 🧠 Problem: Longest Substring with Distinct Characters                  *
                 * 📌 Description:                                                         *
                 *     Given a string s, find the length of the longest substring with     *
                 *     all distinct characters.                                            *
                 *                                                                         *
                 * 🔗 Problem Link:                                                        *
                 *     https://www.geeksforgeeks.org/batch/gfg-160-problems/track/         *
                 *     two-pointer-technique-gfg-160/problem/                              *
                 *     longest-distinct-characters-in-string5848                           *
                 *                                                                         *
                 * 🧪 Example:                                                             *
                 *     Input: s = "geeksforgeeks"                                          *
                 *     Output: 7                                                           *
                 *     Explanation: "eksforg" is the longest substring with all            *
                 *                  distinct characters.                                   *
                 * ----------------------------------------------------------------------- *
                 * 💻 Language: Java                                                       *
                 * 🗂️  Category: Sliding Window, Two Pointer                               *
                 ***************************************************************************/

package GFG_160_SERIES;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GFG_58_Longest_substring_with_distinct_characters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = scanner.nextLine();
        scanner.close();
        System.out.println("Length of Longest Substring with Distinct Characters: " + longestUniqueSubstr(s));
    }

    public static int longestUniqueSubstr(String s) {
        int n = s.length();
        int i = 0, j = 0, maxLength = 0;
        Set<Character> seenChars = new HashSet<>();

        while (j < n) {
            char currentChar = s.charAt(j);

            if (!seenChars.contains(currentChar)) {
                seenChars.add(currentChar);
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                seenChars.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
