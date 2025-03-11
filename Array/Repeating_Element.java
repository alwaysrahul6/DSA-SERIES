package ARRAYS;
/*
https://www.geeksforgeeks.org/problems/first-repeating-element4018/1?page=2&category=Arrays&difficulty=Basic,Easy&sortBy=submissionsQ-First Repeating Element
Given an array arr[], find the first repeating element. The element should
occur more than once and the index of its first occurrence should be the smallest.
Note:- The position you return should be according to 1-based indexing.
Examples:
Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
Output: 2
Explanation: 5 appears twice and its first appearance is at index 2 which is less than 3 whose first the occurring index is 3.
 * */
import java.util.HashMap;

//Brute Force Approach
public class Repeating_Element {
    public static int firstRepeated(int[] arr) {
        // Your code here
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])return i+1;
            }
        }
        return -1;
    }
    //Optimal Approach

    public  static int repeated(int arr[]){
       int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i =0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int i =0;i< map.size();i++){
            if (map.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(repeated(arr));
    }
}
