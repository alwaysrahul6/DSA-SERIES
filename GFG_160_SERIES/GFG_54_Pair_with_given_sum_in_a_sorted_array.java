package GFG_160_SERIES;
/*    *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/pair-with-given-sum-in-a-sorted-array4940
*     *  Q.Pair with given sum in a sorted array
*     *   You are given an integer target and an array arr[]. You have to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.
      *   Note: pairs should have elements of distinct indexes. 
      *   Examples :
      *   Input: arr[] = [-1, 1, 5, 5, 7], target = 6
      *   Output: 3
      *   Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.*/
import java.util.Scanner;

public class GFG_54_Pair_with_given_sum_in_a_sorted_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter target:");
        int target = scanner.nextInt();
        System.out.println(countPairs(arr,target));
    }

   static int countPairs(int arr[], int target) {
       int n = arr.length;
       int count = 0;
       int i = 0, j = n - 1;
       while (i<j){
           int sum = arr[i] + arr[j];
           if (sum>target)j--;
           else if (sum<target)i++;
           else {
               int ele1 = arr[i] , ele2 = arr[j];
               int count1 = 0, count2 = 0;
               while (i<=j && arr[i] == ele1){
                   count1++;
                   i++;
               }
               while (i<=j && arr[j] == ele2){
                   count2++;
                   j--;
               }
               if (ele1 == ele2)count += count1*(count1-1)/2;
               else count += count1 * count2;
           }
       }
       return count;
   }
}
