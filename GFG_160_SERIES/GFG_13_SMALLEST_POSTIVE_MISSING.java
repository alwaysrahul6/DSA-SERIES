package GFG_160_SERIES;

/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/smallest-positive-missing-number-1587115621
* Q-Smallest Positive Missing
* You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.
* Examples:
* Input: arr[] = [2, -3, 4, 1, 1, 7]
* Output: 3
* Explanation: Smallest positive missing number is 3.

*/
import java.util.Arrays;
import java.util.Scanner;

public class GFG_13_SMALLEST_POSTIVE_MISSING {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        System.out.println("Enter Element:");
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Missing Number is : ");
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;
        int ans =1;
        for(int i = 0;i<n;i++){
            if(arr[i]==ans)ans++;
            else if(arr[i]>ans);
        }
        return ans;
    }


}
