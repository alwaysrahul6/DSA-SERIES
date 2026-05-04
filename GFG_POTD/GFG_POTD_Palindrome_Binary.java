package GFG_POTD;
/*  https://www.geeksforgeeks.org/problems/palindrome-numbers0942/1
 * Palindrome Binary
 *
 *  Q.  Check if the binary representation of a number is palindrome or not.
 *   Example 1:
 *   Input:
 *   N = 17
 *   Output:
 *   1
 *   Explanation:
 *   (17)10 = (10001)2
 *   Which is pallindrome hence
 *   output is 1.
 * 
 *  Constraints:
 *   1 <= N <= 1018
 * */
import java.util.Scanner;

public class GFG_POTD_Palindrome_Binary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N :");
        long n  = scanner.nextInt();
        System.out.println(isPallindromeBinary(n));
    }

    /* Solutions */

    static long isPallindrome(long N) {
        // code here
       String s = Long.toBinaryString(N);
       StringBuilder sb = new StringBuilder(s);
       sb.reverse();
       if (s.contains(sb))return 1;
       else return 0;
    }

  /*Second appraoch */

    static long isPallindromeBinary(long N){


        int arr[] = new int[100001];
        int idx = 0;
        int f = 1;

        while (N > 0){
            arr[idx++] = (int)N % 2;
            N = N/2;
        }

        for (int i = 0; 2 * i < idx ;i++){
            if (arr[i] != arr[idx - i - 1]) {
                f = 0;
                break;
            }
        }
        return f;
    }

}
