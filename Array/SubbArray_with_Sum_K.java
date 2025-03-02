package ARRAYS;
/*
https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
Given an unsorted array of integers, the task is to find the number of subarrays
having a sum exactly equal to a given number k.
Examples:
Input : arr[] = [10, 2, -2, -20, 10], k = -10
Output : 3
Explanation: Subarrays: arr[0…3], arr[1…4], arr[3…4] have sum equal to -10.
* */
import java.util.HashMap;

public class SubbArray_with_Sum_K {
    public static int subarraySUm(int arr[], int k){
        int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int prefixSum =0;
        int count =0;
        for (int i =0;i<n;i++){
            prefixSum +=arr[i];
            int remove  = prefixSum -k;
            count+=map.getOrDefault(remove,0);
//            if (map.containsKey(remove)){
//                count+=map.get(remove);
//                System.out.println(remove);

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
    public static int longestsubaary(int arr[],int k ){
       int res =0;
        int n = arr.length;
        for (int i =0;i<n;i++){
            int ans =0;
            for (int j =i;j<n;j++){
                ans +=arr[j];
                if (ans ==k){
                    int length = j-i-1;
                    res = Math.max(res,length);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,3,2,1};
//        subarraySUm(arr);
        System.out.println(subarraySUm(arr,6));
    }
}
