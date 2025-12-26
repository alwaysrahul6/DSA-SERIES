package GFG_POTD;

import java.util.Scanner;
/*
 *  https://www.geeksforgeeks.org/problems/kth-missing-positive-number-in-a-sorted-array/1
 *
 *  Q. Given a sorted array of distinct positive integers arr[],
 *      You need to find the kth positive number that is missing from the arr[].
 *     Examples:
 *     Input: arr[] = [2, 3, 4, 7, 11], k = 5
 *     Output: 9
 *     Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
 * */
public class GFG_POTD_Kth_Missing_Positive_Number_in_a_Sorted_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter k :");
        int k = scanner.nextInt();
        System.out.println(kthMissing(arr , k));

    }

    public static int kthMissing(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i <= j){
            int mid = i + (j - i)/2;
            int num = arr[mid] - (i + 1);

            if (num < k){
                i = mid + 1;
            }else j = mid - 1;
    }
        return i + k;
    }

    /*Brute Force Approach*/

    static int BrutekthMissing(int arr[] , int k){
        int n = arr.length;
        int ans = 1;
        int i = 0;
        while (i < n && k > 0){
            if (arr[i] == ans){
                i++;
            }else  k--;
            ans++;
        }
        while (k-- > 0){
            ans++;
        }
        return ans;
    }
}
