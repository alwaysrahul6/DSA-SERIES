package ARRAYS;

import java.util.Arrays;

public class Trapping_RAinwater {
    static int trapping(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int temp =0;
        for (int i =0;i<n;i++){
            temp = Math.max(arr[i],temp);
            left[i] = temp;
        }
        temp=0;
        for (int i =n-1;i>=0;i--){
            temp = Math.max(arr[i],temp);
            right[i] = temp;
        }
        temp =0;
        for (int i =0;i<n;i++){
            temp += Math.min(right[i],left[i])-arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[]= { 1,2,5,2,2,6,3,4};
        System.out.println(trapping(arr));
    }
}
