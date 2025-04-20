package SORTING;

import java.util.Arrays;
import java.util.Scanner;

public class Quick__Sortt {
    /// Driver Code
    /// Main method to test the Quick Sort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create array of given size
        int[] arr = new int[size];

        // Get array elements from user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal array:");
        printArray(arr);

        // Sort the array
        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        printArray(arr);

        scanner.close();
    }
/// Quick Sort
    private static void quickSort(int [] arr,int st ,int end){
        if (st>=end)return;
        int parti = partion(arr, st, end);
        quickSort(arr,st,parti-1);
        quickSort(arr,parti+1,end);
    }
    /// Swap Function 

    private static void swap(int arr[] , int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /// Print Array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    ///Partion 
    
   private static int partion(int arr[] , int st, int end){
        int pivot = arr[st];
        int cnt = 0;
        for (int i =st+1;i<=end;i++){
            if (arr[i]<=pivot)cnt++;
        }
        int pivotindex = st+cnt;
        swap(arr,st,pivotindex);

        int i = st, j = end;
        while (i<pivotindex && j>pivotindex){
            while (arr[i]<=pivot)i++;
            while (arr[j]>=pivot)j--;

            if (i<pivotindex && j>pivotindex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotindex;
    }
}
