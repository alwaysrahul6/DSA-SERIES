package GFG_160_SERIES;
/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621
* Q-Rotate Array
* Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
* Note: Consider the array as circular.
* Examples :
* Input: arr[] = [1, 2, 3, 4, 5], d = 2
* Output: [3, 4, 5, 1, 2]
* Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
*/
import java.util.Arrays;
import java.util.Scanner;

public class GFG_04_Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int c = sc.nextInt();
        rotate(arr,c);
        System.out.println(Arrays.toString(arr));
    }
    static int[] rotate(int [] arr ,int d){
        int n = arr.length;
        d = d%n;
        swap(arr,0,d-1);
        swap(arr,d,n-1);
        swap(arr,0,n-1);
        return arr;
    }
    static void swap(int arr[],int i ,int j){
        int n = arr.length;
        i =0;
        j = n-1;
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
