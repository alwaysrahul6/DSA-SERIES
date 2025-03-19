package ARRAYS.TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
/*Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.
Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.
example
Input: arr = [-1, 0, 1, 2, -1, -4]
Output: [[-1, 1]]
 */
public class Two_sumPairswith_Sum {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int i =0,j =n-1;
        while(i<j){
            int sum =arr[i]+arr[j];
            if(sum>0){
                j--;
            }else if(sum<0){
                i++;
            }else{
                ArrayList<Integer> temp = new ArrayList<>() ;
                temp.add(arr[i++]);
                temp.add(arr[j--]);
                res.add(temp);
                while (i<j&&arr[i]==arr[i-1]){
                    i++;
                }
                while (i<j&&arr[j]==arr[j+1]){
                    j--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int []n = {-1, 0, 1, 2, -1, -4};
        System.out.println(getPairs(n));
    }
}

