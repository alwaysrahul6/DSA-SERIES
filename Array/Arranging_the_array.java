package ARRAYS;    
/*https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers/
Rearrange positive and negative numbers with constant extra space
Last Updated : 09 Nov, 2024
Given an array arr[] of integers, the task is to arrange them such that all negative integers appear before all the positive integers
in the array without using any additional data structure like a hash table, arrays, etc.
The order of appearance should be maintained.
* */   

public class Arranging_the_array {  
    static void rearrange(int arr []){
        int n = arr.length;
//        int n = arr.length;
        int pos[] = new int[n];
        int neg[] = new int[n];
        int postindex =0,negIndex =0;
        for (int i =0;i<n;i++){
            if (arr[i]>0){
                pos[postindex++] = arr[i];
            }else if (arr[i]<0){
                neg[negIndex++] = arr[i];
            }
        }
        int index =0;
        for (int i =0 ;i<postindex;i++){
            arr[index++] = pos[i];
        }
        for (int i=0;i<negIndex;i++){
            arr[index++] = neg[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,-1,3,-4,-5,9};
        rearrange(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
