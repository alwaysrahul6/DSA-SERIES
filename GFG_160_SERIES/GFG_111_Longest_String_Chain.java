package GFG_160_SERIES;
/*      *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/dynamic-programming-gfg-160/problem/longest-string-chain
*       *   Longest String Chain
        *  Q.  You are given an array of words where each word consists of lowercase English letters.
        *   wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA without changing the order of the other characters to make it equal to wordB. For example,
        *   "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
        *    A word chain is a sequence of words [word1, word2, ..., wordk] with k >= 1,
        *    where word1 is a predecessor of word2, word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k = 1.
        *    Return the length of the longest possible word chain with words chosen from the given list of words in any order.
        * 
        *    Examples:
        *   Input: words[] = ["ba", "b", "a", "bca", "bda", "bdca"]
        *   Output: 4
        *   Explanation: One of the longest word chains is ["a", "ba", "bda", "bdca"].
            * */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GFG_111_Longest_String_Chain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Elements: ");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        String []words = new String[n];
        for (int i = 0; i<n;i++){
            words[i] = scanner.next();
        }
        System.out.println(longestStringChain(words));
    }


    public static int longestStringChain(String words[]) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        Map<String, Integer> map = new HashMap<>();
        int maxlength = 1;
        for (String word : words) {
            int length = 1;


            for (int i = 0; i < word.length(); i++) {
                String pred = word.substring(0, i) + word.substring(i + 1);
                if (map.containsKey(pred)) {
                    length = Math.max(length, map.get(pred) + 1);
                }
                map.put(word, length);
                maxlength = Math.max(maxlength, length);
            }
        }
        return maxlength;
    }
}
