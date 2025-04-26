package GFG_160_SERIES;
/*     * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/kth-missing-positive-number-in-a-sorted-array
       *
       * Kth Missing Positive Number in a Sorted Array
       *
       * Q. Given a sorted array of distinct positive integers arr[],
       *    we need to find the kth positive number that is missing from arr[].\
       * 
       * Examples :
       * Input: 
       *        arr[] = [2, 3, 4, 7, 11], k = 5
       * Output: 
       *        9
       * Explanation:
       *        Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
* */
import java.util.Scanner;

public class GFG_35_Kth_Missing_Positive_Number_Sorted_Array {
    /// DRIVER CODE
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String [] s  = scanner.nextLine().split(" ");
        int n = s.length;
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter K");
        int k = scanner.nextInt();
        int solution = kthMissing(arr,k);
        System.out.println(solution);
    }


    public static int kthMissing(int[] arr, int k) {
        /// SOLUTION
        int n = arr.length;
        int start  = 0 ;
        int end = n-1;
        int ans =arr.length;
        while (start<=end){
            int mid = start + (end - start)/2;
            if ((arr[mid]-mid-1)>=k){
                ans = mid ;
                end = mid -1;
            }else
                start = mid +1;
        }
        return ans + k;
    }
}
