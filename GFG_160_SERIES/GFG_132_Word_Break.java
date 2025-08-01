package GFG_160_SERIES;/* 
 * https://www.geeksforgeeks.org/problems/word-break1352/1
 * 
 *  # Word Break
 *   
 *  Q. You are given a string s and a list dictionary[] of words. 
 *     Your task is to determine whether the string s can be formed by concatenating one or more words from the dictionary[].
 *     Note: From dictionary[], any word can be taken any number of times and in any order.
 *     
 *     Ex.
 *        Input: s = "ilikegfg", dictionary[] = ["i", "like", "man", "india", "gfg"]
 *        Output: true
 *        Explanation: s can be breakdown as "i like gfg".
 * */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GFG_132_Word_Break {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String");

        String s = scanner.nextLine();

        System.out.println("Enter dictionary words (space-separated):");
        String[] dictionary = scanner.nextLine().split(" ");

        boolean result = wordBreak(s , dictionary);

        System.out.println("Can be The String Segemented: " + result);
        
    }

    public static boolean wordBreak(String s, String[] dictionary) {

        int n = s.length();
        // Convert dictionary to a HashSet for faster lookup
        Set<String> words = new HashSet<>(Arrays.asList(dictionary));

        boolean dp[] = new boolean[n + 1];

        dp[0] = true;

        //max length
        int maxWordlength = 0;

        for (String string : dictionary) {
            maxWordlength = Math.max(maxWordlength, string.length());
        }

        for (int i = 1; i <= n; i++) {

            for (int j = i - 1; j >= Math.max(0, i - maxWordlength); j--) {
                if (dp[j] && words.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}

