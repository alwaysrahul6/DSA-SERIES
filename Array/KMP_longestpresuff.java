package STRINGS;
/*
Given a string s, the task is to find the length of the longest proper prefix which is also a suffix. A proper prefix is a prefix that doesn’t include whole string. For example, prefixes of “abc” are “”, “a”, “ab” and “abc” but proper prefixes are “”, “a” and “ab” only.
Examples:
Input: s = “aabcdaabc”
Output: 4
Explanation: The string “aabc” is the longest proper prefix which is also the suffix.
Input: s= “ababab”
Output: 4
Explanation: The string “abab” is the longest proper prefix which is also the suffix.
Input: s = “aaaa”
Output: 3
Explanation: The string “aaa” is the longest proper prefix which is also the suffix.
 */
public class KMP_longestpresuff {
    public static int longest(String s){
        int n = s.length();
        int[]lps = new int[n];
        int len =0;
        lps[0] = 0;
        int i=1;
        while (i<n){
            if (s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else
                if (len!=0){
                    len = lps[len-1];
                }else {
                    lps[i] =0;
                    i++;
                }
        }
        return lps[n-1];
    }

    public static void main(String[] args) {
        String str = "ababab";
        System.out.println(longest(str));
    }
}
