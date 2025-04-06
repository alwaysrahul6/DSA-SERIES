package GFG_160_SERIES;
/*
* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/implement-atoi
* Q-Implement Atoi
* Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about atoi() function.
* Cases for atoi() conversion:
* Skip any leading whitespaces.
* Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
* Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
* If the integer is greater than 231 – 1, then return 231 – 1 and if the integer is smaller than -231, then return -231.
* Examples:
* Input: s = "-123"
* Output: -123
* Explanation: It is possible to convert -123 into an integer so we returned in the form of an integer
 * */
import java.util.Scanner;

public class GFG_14_IMPLEMENT_ATOI {
        public static int myAtoi(String s) {
            int i = 0, sign = 1;
            long ans = 0;

            // Skip leading whitespace
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }

            // Handle optional sign
            if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                sign = (s.charAt(i) == '-') ? -1 : 1;
                i++;
            }

            // Convert digits to number
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ans = ans * 10 + (s.charAt(i) - '0');

                // Check for overflow
                if (sign * ans >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign * ans <= Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

                i++;
            }

            return (int)(sign * ans);
        }

    public static void main(String[] args) {
        String str = "-1234";
        System.out.println(myAtoi(str));
    }

    }

