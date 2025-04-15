package SORTING;

import java.util.Arrays;

public class Merge_Sort {

    /// main method
    public static void main(String[] args) {
        int []arr = {2,5,7,1,3,5,4};
        int m  = arr.length-1;
        mergeSort(arr,0,m);
        System.out.println(Arrays.toString(arr));
    }

    /// Solution
    static void mergeSort(int arr[], int s, int e) {
        // code here
        if (s>=e)return;
        int mid = s+(e-s)/2;
        mergeSort(arr,0,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,e,mid);
    }
    static void merge(int []arr,int s,int e,int mid){
        int n = mid-s+1;
        int m = e-(mid+1)+1;
        int[]left = new int[n];
        int []right = new int[m];
        for (int i =s;i<=e;i++){
            if (i<=mid) {
                left[i - s] = arr[i];
            }else
                right[i-(mid+1)]= arr[i];
        }
        int i=0 , j =0 , k = s;
        while (i<n && j<m){
            if (left[i]<right[j]){
                arr[k++] = left[i++];
            }else arr[k++] = right[j++];
        }
        while (i<n)arr[k++] = left[i++];
        while (j<m)arr[k++] = right[j++];
    }

    
}
