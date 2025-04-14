package GFG_160_SERIES;

import java.util.Scanner;
/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/inversion-of-array-1587115620
* Q-Count Inversions
* Given an array of integers arr[]. Find the Inversion Count in the array.
* Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.
* Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
* If an array is sorted in the reverse order then the inversion count is the maximum.
* Examples:
* Input: arr[] = [2, 4, 1, 3, 5]
* Output: 3
* Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
* */
public class GFG_23_COUNT_INVERSION {
    private static int count = 0;

    public static int mergeSort(int arr[], int s, int e) {
        // code here
        if (s >= e) return 0;
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, e, mid);
        return count;
    }

    public static void merge(int[] arr, int s, int e, int mid) {
        int n = mid - s + 1;
        int m = e - (mid + 1) + 1;
        int[] left = new int[n];
        int[] right = new int[m];
        for (int i = s; i <= e; i++) {
            if (i <= mid) {
                left[i - s] = arr[i];
            } else {
                right[i - (mid + 1)] = arr[i];
            }
        }
        int i = 0, j = 0, k = s;
        while (i < n && j < m) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {

                count += n - i;
                arr[k++] = right[j++];
            }
        }
        while (i < n) arr[k++] = left[i++];
        while (j < m) arr[k++] = right[j++];
    }

    public static int solve(int[] arr) {
        int n = arr.length - 1;
        return mergeSort(arr, 0, n);
    }
//Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = scanner.nextInt();
        System.out.println("Enter Element:");
        int arr[] = new int[n];
        for (int  i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        mergeSort(arr,0,n-1);
        System.out.println(count);
    }
}
