/*
  You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.
Note: Positive number starts from 1. The array can have negative integers too.
Input: arr[] = [2, -3, 4, 1, 1, 7]
Output: 3
Explanation: Smallest positive missing number is 3.
*/
package ARRAYS;

import java.util.Arrays;

public class smallest_positive_missing {
    static int smallest(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        int ans =1;
        for (int i =0;i<n;i++){
            if (arr[i] == ans){
                ans++;
            }else if (arr[i] > ans){
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, -3, 4, 1, 1, 7};

        System.out.println(smallest(arr));
    }
}
