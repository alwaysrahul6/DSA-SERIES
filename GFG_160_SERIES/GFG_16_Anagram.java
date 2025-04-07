package GFG_160_SERIES;
/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/anagram-1587115620
* Q-Anagram
* Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different.
* For example, "act" and "tac" are an anagram of each other.
* Strings s1 and s2 can only contain lowercase alphabets.
* Examples :
* Input: s1 = "geeks", s2 = "kseeg"
* Output: true
* Explanation: Both the string have same characters with same frequency. So, they are anagrams.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GFG_16_Anagram {
    static Boolean solve(String s1, String s2){
        if (s1.length()!=s2.length())return false;
      char []a = s1.toCharArray();
      char []b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int n = s1.length();
        int i =0, j =0;
        while (i<n && j<n){
            if (a[i]!=b[j]){
                return false;
            }else {
                i++;
                j++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = scanner.nextLine();
        System.out.println("Enter 2nd String");
        String str2 = scanner.nextLine();
        System.out.println(solve(str,str2));
    }
}
