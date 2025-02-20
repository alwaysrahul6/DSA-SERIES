/*
Given two strings s1 and s2 consisting of lowercase characters.
The task is to check whether two given strings are an anagram of each
other or not. An anagram of a string is another string that contains the
same characters, only the order of characters can be different.
For example, "act" and "tac" are an anagram of each other.
Strings s1 and s2 can only contain lowercase alphabets.
Input: s1 = "geeks", s2 = "kseeg"
Output: true
Explanation: Both the string have same characters with same frequency.
So, they are anagrams.

Note: You can assume both the strings s1 & s2 are non-empty.
 */

package STRINGS;

import java.util.Arrays;

public class anagram {
    static boolean anagram(String s1,String s2){
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);// sort array
        Arrays.sort(s2Array); //sort array
        return Arrays.equals(s1Array,s2Array); //compare each other
    }

    public static void main(String[] args) {
        String str1 = "geeks";
        String str2 = "kseeg";
        System.out.println(anagram(str1,str1));
    }
}
