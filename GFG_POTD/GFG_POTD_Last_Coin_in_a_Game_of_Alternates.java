package GFG_POTD;
/*
 * Last Coin in a Game of Alternates
 *
 * Q. Given an array integer arr[] , representing the values of coins arranged in a row.
 *  Two players play a game by picking coins alternately.
 *  At each turn, a player can pick a coin from either the beginning or the end of the array. Both players follow a greedy strategy, i.e., they always pick the coin with the maximum value among the two available ends.
 *  The game continues until only one coin remains.
 *  Find the value of the last remaining coin.
 *  Examples:
 * Input : arr[] = [5, 3, 1, 6, 9]
 * Output : 1
 * Explanation:
 * Players always pick the larger coin from the two ends.
 * Pick 9, remaining array: [5, 3, 1, 6]
 * Pick 6, remaining array: [5, 3, 1]
 * Pick 5, remaining array: [3, 1]
 * Pick 3, remaining array: [1]
 * Final Output: 1
 * */

import java.util.Scanner;

public class GFG_POTD_Last_Coin_in_a_Game_of_Alternates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(coin(arr));
    }

    public static int coin(int[] arr) {
        // code here
        int i = 0;
        int j = arr.length - 1;
        while ( i < j){
            if( arr[i] >= arr[j]) i++;
            else j--;
        }
        return arr[i];
    }
}
