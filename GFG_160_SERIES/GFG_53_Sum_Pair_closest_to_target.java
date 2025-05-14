package GFG_160_SERIES;
/*    *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/pair-in-array-whose-sum-is-closest-to-x1124
*     *  Sum Pair closest to target
*     * Q. Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a<=b whose sum is closest to target.
      *  Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.
      *  Examples:
      *  Input: arr[] = [10, 30, 20, 5], target = 25
      *  Output: [5, 20]
      *  Explanation: As 5 + 20 = 25 is closest to 25.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GFG_53_Sum_Pair_closest_to_target {
  ///Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Target:");
        int target = scanner.nextInt();
        System.out.println(sumClosest(arr,target));
    }
    public static List<Integer> sumClosest(int[] arr, int target) {
      ///Solution
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        List<Integer>result = new ArrayList<>();
        int i = 0, j = n-1, min = Integer.MAX_VALUE;
        while (i<j){
            int sum = arr[i] + arr[j];
            int currDiff = Math.abs(sum-target);
            if (min>currDiff){
                min = currDiff;
               result = Arrays.asList(arr[i],arr[j]);
            }
            if (sum>target)j--;
            else if (sum<target)i++;
            else return result;
        }
        return  result;
    }
}
