package ARRAYS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*Q-Frequencies in a Limited Array
 You are given an array arr[] containing positive integers.
The elements in the array arr[] range from 1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your task is to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).
Examples
Input: arr[] = [2, 3, 2, 3, 5]
Output: [0, 2, 2, 0, 1]
Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.*/
public class Frequencies_in_a_Limited_Array {
    public static  List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        ArrayList<Integer>ans = new ArrayList<>(Collections.nCopies(n,0));
        for (int i:arr){
            ans.set(i-1,ans.get(i-1)+1);
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 2, 5};
        System.out.println(frequencyCount(arr));
    }
}
