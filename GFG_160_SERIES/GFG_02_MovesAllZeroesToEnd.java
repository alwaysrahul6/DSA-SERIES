package GFG_160_SERIES;
/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751Q-Move All Zeroes to End
* You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.
Examples:
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]*/
import java.util.Arrays;
import java.util.Scanner;

public class GFG_02_MovesAllZeroesToEnd {
    //Driver code 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size ");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int arr[] = new int [n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        zeroes(arr);
        System.out.println("After Zeroes Goes to End");
        System.out.println(Arrays.toString(arr));

    }
    //Solution
    static void zeroes(int arr[]){
    int count =0;
    int n = arr.length;
    for (int i =0;i<n;i++){
        if (arr[i]!=0){
            arr[count++] = arr[i];
        }
    }
    while (count<n){
        arr[count++] = 0;
    }
    }
}
