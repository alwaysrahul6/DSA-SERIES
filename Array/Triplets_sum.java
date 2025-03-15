package ARRAYS;
/*https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1?page=2&category=Arrays&sortBy=submissions
Given an array arr[] and an integer target, determine if there exists a triplet in the array whose sum equals the given target.
Return true if such a triplet exists, otherwise, return false.
Examples
Input: arr[] = [1, 4, 45, 6, 10, 8], target = 13
Output: true
Explanation: The triplet {1, 4, 8} sums up to 13
* */
public class Triplets_sum {
    static boolean triplet(int arr[],int target){
        int n = arr.length;
        for (int i =0;i<n;i++){
            for (int j =i+1;j<n;j++){
                for (int k = j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {40, 20, 10, 3, 6, 7};
        int target = 24;
        System.out.println(triplet(arr,target));
    }
}
