package GFG_160_SERIES;
/*   * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/subarrays-with-sum-k.
*    *  Subarrays with sum K
*    *
     *  Q. Given an unsorted array of integers, find the number of subarrays having sum exactly equal to a given number k.
     *   Examples:
     *   Input: arr = [10, 2, -2, -20, 10], k = -10
     *   Output: 3
     *   Explaination: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10. */

import java.util.HashMap;
import java.util.Scanner;

public class GFG_49_Subarrays_with_sum_K {
/// Driver Code 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element");
        String [] s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter k:");
        int k  = scanner.nextInt();
        System.out.println(countSubarrays(arr,k));
    }

  /// Solution

    public static  int countSubarrays(int arr[], int k) {
     int n  = arr.length;
     int count = 0;
     int sum = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for (int i = 0;i<n;i++){
            sum+=arr[i];
            int remove = sum - k;
            if (map.containsKey(remove)){
                count+=map.get(remove);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
      return count;
    }
}
