package ARRAYS;
/*
https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=2&category=Arrays,Strings&sortBy=submissions
Q-Reverse array in groups
Given an array arr of positive integers. Reverse every sub-array group of size k.
Note: If at any instance, k is greater or equal to the array size, then reverse the entire array.
You shouldn't return any array, modify the given array in place.
Examples:
Input: arr[] = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_array_in_groups {
// method 1
//   public  static void reverce(ArrayList<Long> arr, int k, int start, int end){
//        while (start<end){
//            long temp = arr.get(start);
//            arr.set(start,arr.get(end));
//            arr.set(end,temp);
//            start++;
//            end--;
//        }
//    }
//    static void reverce(ArrayList<Long> arr, int k){
//        int n = arr.size();
//        for (int i =0;i<n;i+=k){
//            if (i+k-1<n){
//               reverce(arr,n,i,i+k-1);
//            } else reverce(arr,n,i,n-1);
//        }
//    }
//    method2
    static void reverce(ArrayList<Long> arr, int k) {
        int n = arr.size();
        for (int i = 0; i < n; i += k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);
            while (start < end) {
                Collections.swap(arr, start, end);
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        ArrayList<Long> arr = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextLong());
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        reverce(arr, k);

        System.out.println("Reversed array in groups of " + k + ": " + arr);

        scanner.close();
    }
}
