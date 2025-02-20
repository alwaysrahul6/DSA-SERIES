/*
https://www.geeksforgeeks.org/problems/check-if-a-given-string-is-a-rotation-of-a-palindrome0317/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
Given a string s, check if it can be rotated to form a palindrome.

Example 1:

Input:
s = aaaab
Output: 1
Explanation: "aaaab" can be rotated to
form "aabaa" which is a palindrome.
 */


package STRINGS;

public class is_rotation_Pallindrome {
    static  boolean palliandrome(String s){
        int left = 0;
        int right =s.length() -1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }


    static boolean isPallindrome(String s) {
        if (palliandrome(s))
            return true;

        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            String str1 = s.substring(i + 1);
            String str2 = s.substring(0, i + 1);
            System.out.println(str1);
            System.out.println(str2);
            if (palliandrome(str1 + str2))
                return true;

        }

        return false;

    }

    public static void main(String[] args) {
        String a = "aaaab";
//        isPallindrome(a);
        System.out.println(isPallindrome(a));
    }
}

