package GFG_160_SERIES;
/*https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote
Q-Majority Element II
* You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array.
* Note: The answer should be returned in an increasing format.
* Examples:
* Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
* Output: [5, 6]
* Explanation: 5 and 6 occur more n/3 times.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GFG_05_MAJORITY_ELEMENT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Majority Element");
        System.out.println(majority(arr));
    }
    private static ArrayList<Integer> majority(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<Integer>ans = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i =0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if  (map.get(arr[i]) ==n/3+1){
//                ans = arr[i];
                ans.add(arr[i]);
            }
        }
        return ans;

    }
}
