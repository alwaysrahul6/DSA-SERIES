package GFG_160_SERIES;
/*    *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/dynamic-programming-gfg-160/problem/count-palindrome-sub-strings-of-a-string0652
      *  Palindrome SubStrings.
      * 
      * Q. Given a string s, count all palindromic sub-strings present in the string. The length of the palindromic sub-string must be greater than or equal to 2.

      *     Note: A substring is palindromic if it reads the same forwards and backwards.
      *     Examples:
      *     Input: s = "abaab"
      *     Output: 3
      *     Explanation: All palindromic substrings (of length > 1) are: "aba", "aa", "baab".
 */
import java.util.Scanner;

public class GFG_115_Palindrome_SubStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element");
        String s = scanner.nextLine();
        System.out.println("Count Of All Pallindromic " + countPS(s));
    }

    public static int countPS(String s) {

        int n = s.length();
        int count = 0;
        //Even Case
        for (int i = 1; i < n;i++){
            count+=palli(i-1 , i,s);
        }
        // odd case
        for (int i = 1; i < n-1;i++){
          count+=palli(i-1 ,i+1,s);
        }
        return count;

    }
    /*Find Valid Pallindromic Function */
    
    private static int palli(int i, int j, String s) {
        int count = 0;
        while (i >= 0 && j  < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
                count++;
            }else break;
        }
        return count;
    }
}
