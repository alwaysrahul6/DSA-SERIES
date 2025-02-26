package ARRAYS;
/*
https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
* You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.
Examples:
Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except */

public class Missing_Number {
//    method 1 using a two loop or time complexity n^2

    public static int missing(int arr[]){
        int n = arr.length;
        for(int i =1;i<n;i++){
            boolean flag = false;
            for (int  j =0;j<n;j++){
                if (arr[j] ==i){
                    flag = true;
                }
            }
            if (flag==false){
                return i;
            }
        }
        return -1;
    }
  // method 2 missingNumber using a mathmatical equation

    public static int missingnumber(int arr[]){
        long n = arr.length;
        long sum = 0;
        for (int  i =0;i<n-1;i++){
            sum +=arr[i];
        }
        long expeectedsum = (n*(n + 1)) / 2;
        return (int) (expeectedsum - sum);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,5,4,6,7};
        System.out.println(missingnumber(arr));
        System.out.println(missing(arr));
    }
}
