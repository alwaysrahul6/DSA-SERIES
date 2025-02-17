package SORTING;

import java.util.stream.IntStream;

public class Insertion_Sort  {
    static void InsertionSort(int [] arr){
        int n = arr.length;
        for (int i=1;i<n;i++){
            int j= i;
            while(j>0 && arr[j]<arr[j-1]){
                //swap a[j],a[j-1]
                int temp= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 2,6,8,3,9,7};
        InsertionSort(a);
        for (int val : a){
            System.out.print(val + " ");
        }
  }
}