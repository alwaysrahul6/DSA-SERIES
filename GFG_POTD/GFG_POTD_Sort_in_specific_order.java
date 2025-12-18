package GFG_POTD;
/*
 * https://www.geeksforgeeks.org/problems/sort-in-specific-order2422/1
 *
 * Given an array arr[] of positive integers. Your have to sort them so that the first part of the array contains odd numbers sorted in descending order, and the rest of the portion contains even numbers sorted in ascending order.
 *  Examples:
 *  Input: arr[] = [1, 2, 3, 5, 4, 7, 10]
 *  Output: [7, 5, 3, 1, 2, 4, 10]
 *  Explanation: 7, 5, 3, 1 are odd numbers in descending order and 2, 4, 10 are even numbers in ascending order.
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GFG_POTD_Sort_in_specific_order {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0;  i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        sortItArray(arr);

        System.out.println(Arrays.toString(arr));
    }



    public static void sortIt(int[] arr) {
        // code here
        int  n = arr.length;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int index = 0;
        Arrays.sort(arr);

        for (int j : arr) {
            if (j % 2 == 0) {
                even.add(j);
            } else odd.add(j);
        }
        for (int i = odd.size()-1;  i >= 0; i--) {
            arr[index++] = odd.get(i);
        }
        for (int i : even){
            arr[index++] = i;
        }
    }

    /* Approch 2*/

    static void sortItArray(int arr[]){
        int n = arr.length;

        for (int i = 0;  i < n; i++) {
            if (arr[i] % 2 == 1){
                arr[i] = -arr[i];
            }
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++){
            if (arr[i] < 0) arr[i] = -arr[i];
        }
    }
}
