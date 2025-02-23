package STRINGS;

/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/add-binary-strings3805

Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

Input: s1 = "1101", s2 = "111"
Output: 10100
Explanation:
 1101
+ 111
10100
 */
public class Binary_String_add {
    static String binary(String s1, String s2) {
        int n = Math.max(s1.length(),s2.length());
        s1 = reverce(s1);
        s2 = reverce(s2);
        StringBuilder ans= new StringBuilder();
        int c = 0;
        for (int i=0;i<n;i++){
//            System.out.println(i);
            int a = 0;
            int b = 0;
            if (i < s1.length()) a = s1.charAt(i) - '0';
            if (i < s2.length()) b = s2.charAt(i) - '0';

            int sum = a+b+c;
           if (sum==3){
               ans.append('1');
               c = 1;
           } else if (sum == 2) {
               ans.append('0');
               c =1;

           }else if (sum ==1){
               ans.append('1');
               c=0;
           }else {
               ans.append('0');
           }
        }

        ans.append(c);
//        System.out.println(ans);
//        ans.reverse();
         n = ans.length();
        for (int i=n-1;i>=0;i--){
            if (ans.charAt(i) == '1')
                break;
            ans.deleteCharAt(i);
//
        }
//        ans.reverse();

  return ans.reverse().toString();
    }
    private static String reverce(String s){
        StringBuilder str= new StringBuilder(s);
        str.reverse();
        return str.toString();
    }

    public static void main(String[] args) {
        String s  = "0101";
       String a = "0101";
        System.out.println(binary(s,a));
    }
}

