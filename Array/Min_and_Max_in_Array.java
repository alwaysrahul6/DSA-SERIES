package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* Q-Min and Max in Array
* Given an array arr. Your task is to find the minimum and maximum elements in the array.

Note: Return a Pair that contains two elements
*  the first one will be a minimum element and the second will be a maximum.
* Input: arr[] = [3, 2, 1, 56, 10000, 167]
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.*/
//solution
public class Min_and_Max_in_Array {
    public  static List<Integer> maxMin(int arr[]){
        ArrayList<Integer>res = new ArrayList<>();
        int n = arr.length;
        Integer max = arr[0];
        Integer min = arr[0];
        for (int i =0;i<n;i++){
           max = Math.max(max,arr[i]) ;
           min = Math.min(min,arr[i]) ;
        }
       res.add(min);
        res.add(max);
       return res;
    }
//Driver Code
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 56, 10000, 167};
        System.out.println(maxMin(arr));;
    }
}
