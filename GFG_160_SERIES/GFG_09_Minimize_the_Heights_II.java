package GFG_160_SERIES;
/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351
* Q-Minimize the Heights II
* Given an array arr[] denoting heights of N towers and a positive integer K.
* For each tower, you must perform exactly one of the following operations exactly once.
* Increase the height of the tower by K
* Decrease the height of the tower by K
* Examples :
* Input: k = 2, arr[] = {1, 5, 8, 10}
* Output: 5
* 
 * */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_09_Minimize_the_Heights_II {
    //Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int [] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K");
        int k = sc.nextInt();
        System.out.println(solve(arr,k));
    }
    private static int solve(int arr[] , int k){
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n-1]-k;
        int smallestt = arr[0]+k;
        int ans =arr[n-1]-arr[0];
        int max =0,min =0;
        for (int i =1;i<n;i++){
            if(arr[i]-k<0) {
                continue;
            }
           min = Math.min(arr[0]+k,arr[i]-k);
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            ans = Math.min(ans,max-min);
        }
        return ans;

    }
}
