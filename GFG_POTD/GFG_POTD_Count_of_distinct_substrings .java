package GFG_POTD;

import java.util.HashSet;
import java.util.Scanner;

/*
 * https://www.geeksforgeeks.org/problems/count-of-distinct-substrings/1
 *
 * # Count of distinct substrings
 *
 * Q. Count of distinct substrings
 *
 *  Given a string s consisting of lowercase English characters, determine the total number of distinct non-empty substrings present in the string. A substring is defined as a contiguous block of characters within the string.
 *  Two substrings are considered distinct if their contents differ, even if they originate from different positions in the string.
 *  Note: The empty substring is not counted.
 *  Examples :
 *  Input: s = "ababa"
 *  Output: 9
 *  Explanation: All distinct substrings of "ababa" are: "a", "b", "ab", "ba", "aba", "bab", "abab", "baba", "ababa".
 *
 * */
public class GFG_POTD_Count_of_distinct_substrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        System.out.println(count(scanner.next()));

    }

    ///  Solutions

    public static int countSubs(String s) {

        int n  = s.length();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++){
            String temp = " ";

            for (int j = i; j<n; j++){
                temp += s.charAt(j);
                set.add(temp);
            }

        }
        return set.size();
    }

    static int count(String s){
        int n = s.length();
        Trie trie = new Trie();
        for (int i = 0; i < n; i++){
            trie.add(s.substring(i ,n));
        }
        return trie.count;
    }


    static class Trie {
        private final Trie[] chars;
        private int count;

        Trie() {
            chars = new Trie[26];
            count = 0;
        }

        void add(String s){
            int n = s.length();
            Trie t = this;

            for (int i = 0; i < n; i++){
                int idx = s.charAt(i) - 'a';

                if (t.chars[idx] == null){
                    t.chars[idx] = new Trie();
                    count++;
                }

                t = t.chars[idx];
            }
        }
        int getCount(){
            return count;
        }
    }
}
