package GFG_160_SERIES;
/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735Q-Second Largest
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element.
Examples:
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34*/
import java.util.Scanner;

public class GFG_01_Second_Largest {
    public static void main(String[] args)  {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int []arr = new int[n];
        for (int i = 0; i < n; i++){
             arr[i] =  sc.nextInt();
        }
        System.out.println("Second Largest");
        System.out.println(slargest(arr));
    }
    static int slargest(int arr[]){
        int n = arr.length,largest = arr[0],slargest =Integer.MIN_VALUE;
        for (int i =0;i<n;i++){
            if (arr[i]>largest){
                slargest= largest;
                largest = arr[i];
            }else if (arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
}
