package GFG_160_SERIES;
/*https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226
Q-Next Permutation
Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 
Examples:
Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
 */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_05_NEXT_PERMUTATION {
   public static void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int index;
        for (index = n-2; index>=0;index--){
            if (arr[index]<arr[index+1]){
                break;
            }
        }
        if (index == -1){
            reverse(arr,0,n-1);
            return;
        }
        for (int i =n-1;i>=0;i--){
            if (arr[i] > arr[index]){
                int temp = arr[i];
                arr[i]  = arr[index];
                arr[index] = temp;
                break;
            }
        }
        reverse(arr,index+1,n-1);
    }
    public static void reverse(int[]arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        System.out.println("Enter Element:");
        int []arr = new int [n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
//        System.out.println;
        System.out.println(Arrays.toString(arr));
    }
}
