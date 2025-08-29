package ARRAYS;  
/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/sort-an-array-of-0s-1s-and-2s4231
Sort 0s, 1s and 2s
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
You need to solve this problem without utilizing the built-in sort function .
Examples:
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
 */
public class countOcuurence {
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
///Solution
    static void sort(int arr[]){
        int mid = 0;
        int low  =0 ;
        int n = arr.length;
        int h = n-1;
        while (mid<=h){
            if (arr[mid]==0){
                swap(arr,mid,low );
                low++;
                mid++;
            }
            else if (arr[mid] == 1)
            {
                mid++;
            }
          else   {
              swap(arr,mid,h);
              h--;


            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,0,2 };
        sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
