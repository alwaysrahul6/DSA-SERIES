package GFG_160_SERIES;
/*https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array
* Q-Reverse an Array
* You are given an array of integers arr[]. Your task is to reverse the given array.
Examples:
Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Note: Modify the array in place.*/
import java.util.Arrays;
import java.util.Scanner;

public class GFG_03_Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       reverce(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverce(int arr[]){
        int n = arr.length,i =0, j =n-1;
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
