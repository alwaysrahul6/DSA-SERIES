package GFG_POTD;

import java.util.Scanner;

/**  https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1
  *   Q. Strings Rotations of Each Other
  *
  *  #. You are given two strings s1 and s2, of equal lengths. The task is to check if s2 is a rotated version of the string s1.
  *     Note: A string is a rotation of another if it can be formed by moving characters from the start to the end (or vice versa) without rearranging them.
  *     Examples :
  *     Input: s1 = "abcd", s2 = "cdab"
  *     Output: true
  *     Explanation: After 2 right rotations, s1 will become equal to s2.
 * */
public class GFG_POTD_Strings_Rotations_of_Each_Other {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter S1 : ");

        String s1 = scanner.nextLine();
        System.out.println("Enter S2 : ");
        String s2 = scanner.nextLine();

        System.out.println(isRotation(s1,s2));

    }

    public static boolean areRotations(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();

        if ( n != m) return false;

        String rotated = s1;

        for (int i = 0;  i < n; i++){
            rotated = rotated.substring(1) + rotated.charAt(0);

            if (rotated.equals(s2)){
                return true;
            }
        }
        return false;
    }


    /* Approach 2 using KMP */

    public static boolean isRotation(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int lps[] = new int[n];

        lpsArray(s2, lps , n);
        s1 += s1;
        int i = 0, j = 0;
        while (i < 2*n){
            if (s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
                if (j == n){
                    return true;
                }
            } else if (j == 0) {
                i++;
            }else {
                j = lps[ j- 1];
            }
        }
        return false;
    }

    private static void lpsArray(String s2, int[] lps, int n) {
        int i = 0;
        int j = 1;

        while (j < n){
            if (s2.charAt(i) == s2.charAt(j)){
                lps[j] = i+1;
                i++;
                j++;
            }else if (i  == 0){
                lps[j] = 0;
                j++;
            }else {
                i = lps[i-1];
            }
        }
    }
}
