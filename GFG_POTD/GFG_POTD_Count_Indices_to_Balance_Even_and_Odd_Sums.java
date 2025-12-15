package GFG_POTD;

import java.util.Scanner;

/*
 * https://www.geeksforgeeks.org/problems/count-indices-to-balance-even-and-odd-sums/1
 *
 * Q. Count Indices to Balance Even and Odd Sums.
 *
 *  >   Given an array arr[], count the number of indices such that deleting the element at that index and shifting all elements after it one position left
 *     results in an array where the sum of elements at even indices equals the sum at odd indices.
 *
 *  Ex: Examples:
 *  Input: arr[] = [2, 1, 6, 4]
 *  Output: 1
 *  Explaination: After removing arr[1], the resulting array will be [2, 6, 4]
 *                the sums of elements at odd index is arr[1] = 6 and the sum of elements at even index is arr[0] + arr[2] = 6.
 *
 *
 * */
public class GFG_POTD_Count_Indices_to_Balance_Even_and_Odd_Sums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element: ");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(cntWays(arr));
    }

    //Solutions

    public static int cntWays(int[] arr) {
        int n = arr.length;
        int totalEven = 0;
        int totalOdd = 0;
        int prevEven = 0;
        int prevOdd = 0;
        int count  = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) totalEven += arr[i];
            else totalOdd += arr[i];
        }

        for (int i = 0; i  < n; i++){
            int nexEven = totalEven - prevEven;
            int nextOdd = totalOdd - prevOdd;

            int currEven = nextOdd + prevEven;
            int currOdd  = nexEven + prevOdd;

            if (i % 2 == 0) currOdd -= arr[i];
            else currEven -= arr[i];

            if (currOdd == currEven) count++;

            if (i % 2 == 0) prevEven += arr[i];
            else prevOdd += arr[i];
        }
        return count;
    }
}
