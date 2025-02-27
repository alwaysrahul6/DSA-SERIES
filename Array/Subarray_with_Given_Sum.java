package ARRAYS;
/*
https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions
Given a 1-based indexing array arr[] of non-negative integers and an integer sum. You mainly need to return the left and right indexes(1-based indexing) of that subarray. In case of multiple subarrays, return the subarray indexes which come first on moving from left to right. If no such subarray exists return an array consisting of element -1.
Examples:
Input: arr[] = [15, 2, 4, 8, 9, 5, 10, 23], target = 23
Output: [2, 5]
Explanation: Sum of subarray arr[2…5] is 2 + 4 + 8 + 9 = 23.
*/
import java.util.ArrayList;
public class Subarray_with_Given_Sum {
    static ArrayList<Integer> subarrasum(int[]arr, int target){
        int n = arr.length;
        ArrayList<Integer>res = new ArrayList<>();
        for (int i =0;i<n;i++){
            int curr =0;
            for (int j = i;j<n;j++){
                curr+= arr[j];
                if (curr==target){
                    res.add(i+1);
                    res.add(j+1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {-4,-2,-6,-1};
        int target = -12;
        ArrayList<Integer>res = subarrasum(arr,target);
        for (int  i:res){
            System.out.println(i + " ");
        }
    }
}
