package ARRAYS;
/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-voteQ-Majority Element II
You are given an array of integer arr[] where each number represents a vote to a candidate.
Return the candidates that have votes greater than one-third of the total votes,
Note: The answer should be returned in an increasing format.
Examples:
Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.If there's not a majority vote, return an empty array
 * */
import java.util.*;

public class majority_element3 {
    static List<Integer> number(int arr[]){
        ArrayList<Integer>ans = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int  i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i] ,0)+1 );
            if (map.get(arr[i]) ==n/3+1){
                ans.add(arr[i]);
            }
        }
        return ans;

    }
//    public static ArrayList<Integer> majorityii(int[] arr){
//        int n = arr.length;
//        HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
//        ArrayList<Integer>res = new ArrayList<>();
//        for (int i =0;i<n;i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
//            if (map.get(arr[i]==n/3+1){
//                res.add(arr[i]);
//            }
//        }
//        return res;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(number(arr));
    }
}

