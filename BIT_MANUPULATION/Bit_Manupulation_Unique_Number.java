package BIT_MANUPULATION;   
/*
 * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/bit-manipulation-gfg-160/problem/find-unique-number
 *
 * Unique Number I
 * 
 * Q. Given a unsorted array arr[] of positive integers having all the numbers occurring exactly twice,
 *    except for one number which will occur only once. Find the number occurring only once.
 *    Examples :
 *              Input: arr[] = [2, 30, 2, 15, 20, 30, 15]
 *              Output: 20
 *              Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.
 * 
 * */
import java.util.Scanner;

public class Bit_Manupulation_Unique_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element:");
        String s[] = sc.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0;  i  < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }

        System.out.println(findUnique(arr));

    }
    public static int findUnique(int[] arr) {
        int n = arr.length + 1;
        int xor = 0;
        for (int i = 0; i < n - 1; i++) {
            xor ^= arr[i];
        }
        return xor;
    }
}
  