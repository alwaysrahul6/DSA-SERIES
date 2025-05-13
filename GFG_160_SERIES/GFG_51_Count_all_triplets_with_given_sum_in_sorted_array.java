package GFG_160_SERIES;
/*   *    https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-all-triplets-with-given-sum-in-sorted-array
*    *  Q.Count all triplets with given sum in sorted array
*    *    Given a sorted array arr[] and a target value, the task is to count triplets (i, j, k) of valid indices,
*    *    such that arr[i] + arr[j] + arr[k] = target and i < j < k.
*    *    Examples:
     *    Input: arr[] = [-3, -1, -1, 0, 1, 2], target = -2
     *    Output: 4
     *    Explanation: Four triplets that add up to -2 are:
     *      arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2
     *      arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2
     *      arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2
     *      arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2*/
import java.util.Scanner;

public class GFG_51_Count_all_triplets_with_given_sum_in_sorted_array {
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
        System.out.println("Enter Target:");
        int target = scanner.nextInt();
        System.out.println(countTriplets(arr,target));
    }


    public static int countTriplets(int[] arr, int target) {
      ///Solution
        // Code Here
        int n = arr.length;
        int count  = 0;
        for (int i =0 ; i < n-2; i++){
          int left = i+1 , right = n-1;
          while (left<right){
              int sum = arr[i] + arr[left] + arr[right];
              if (sum == target){
                  count++;
                  for (int j = left+1; j<right && arr[j] == arr[left];j++) {
                      count++;
                  }
                  right--;
              } else if (sum>target) {
                  right--;
              }else left++;
          }
        }
        return count;
    }


}
