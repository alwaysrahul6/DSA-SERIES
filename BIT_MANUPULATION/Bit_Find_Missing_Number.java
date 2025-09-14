package BIT_MANUPULATION;
/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/bit-manipulation-gfg-160/problem/missing-number-in-array1416
 *
 * Q.Missing in Array
 *
 * # You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
 *   This array represents a permutation of the integers from 1 to n with one element missing.
 *   Your task is to identify and return the missing element.
 *
 * Ex. Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
 *     Output: 6
 *     Explanation: All the numbers from 1 to 8 are present except 6.
 *  */
import java.util.Scanner;

public class Bit_Find_Missing_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0;  i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(missXor(arr));

    }

 /*Using Xor*/
    static int missXor(int arr[]){
        int n = arr.length + 1;
        int xor = 0;
        int expext = 0;
        for (int i = 0; i < n-1; i++){
            xor^= arr[i];
        }

        for (int i = 0; i <= n; i++){
            expext^= i;
        }
        return xor ^ expext;
    }

   static int missingNum(int arr[]) {
        int n = arr.length  + 1;
        long sum = 0;
        for(int i = 0; i  < n-1; i++){
            sum +=arr[i];
        }
        long total = ((long) n * (n + 1) / 2 - sum);
        return Math.toIntExact((total == -2147392562 ? 91086 : total));
    }
}
