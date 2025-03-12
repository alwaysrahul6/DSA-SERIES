package ARRAYS;
/*https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays,Strings&difficulty=Basic,Easy&sortBy=submissions
Q-Array Duplicates
Given an array arr of integers, find all the elements that occur more than once in the array. If no element repeats, return an empty array.
Examples:
Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3]
Explanation: 2 and 3 occur more than once in the given array.
* */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dublicate_Array {
    public List<Integer> findDuplicates(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i =0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>res= new ArrayList<>();
        for (Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getValue()>1){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
