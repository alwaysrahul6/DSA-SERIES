package ARRAYS;

import java.util.Arrays;

public class Rotate_Class {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        int k = 2;
        System.out.println(Arrays.toString(reverce(arr,k)));
    }

    static int[] reverce(int arr[] ,int k ){
        int n = arr.length;
        k = k%n;
        swap(arr,0,n-1);
        swap(arr,0,k-1);
        swap(arr,k,n-1);
        return arr;

    }




    static void swap(int arr[] ,int st,int end){
        while(st<=end){
            int temp = arr[st];
             arr[st] = arr[end];
             arr[end] = temp;
            st++;
            end--;
        }
    }
}
