package GFG_160_SERIES;
/* *  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/count-subarray-with-given-xor
   *  Count Subarrays with given XOR
   *   Q. Given an array of integers arr[] and a number k, count the number of subarrays having XOR of their elements as k.
   *      Examples:
   *      Input: arr[] = [4, 2, 2, 6, 4], k = 6
   *      Output: 4
   *      Explanation: The subarrays having XOR of their elements as 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], and [6]. Hence, the answer is 4.
* 
 *  */
import java.util.HashMap;
import java.util.Scanner;

public class GFG_50_Count_Subarrays_with_given_XOR {
  ///Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter K:");
        int k = scanner.nextInt();
        System.out.println(subarrayXor(arr,k));
    }
    public static long subarrayXor(int arr[], int k) {
        /// Solution
        int n = arr.length;
        int count = 0;
        int xorSum = 0;
        HashMap<Integer, Integer>map = new HashMap<>();
        map.put(0,1);
        for (int j : arr) {
            xorSum ^= j;
            int x = xorSum ^ k;
            if (map.containsKey(x)) {
                count += map.get(x);
            }
            map.put(xorSum, map.getOrDefault(xorSum, 0) + 1);
        }
        return count;

    }
}
