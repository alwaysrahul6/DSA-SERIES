package ARRAYS;
/*------------------------------------------------------------------Equilibrium Point-------------------------------------------------------------------------------
https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&category=Arrays,Strings&difficulty=Easy,Medium&sortBy=submissions
Q-Equilibrium Point
* Given an array of integers arr[], the task is to find the first equilibrium point in the array.
The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists. 
Examples:
Input: arr[] = [1, 2, 0, 3]
Output: 2 
*/
import java.util.Scanner;
//Solution
public class Equilibrium_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(equi(arr));
    }
    //Driver Code 
   public static int equi(int arr[]){
        int n = arr.length,totalSum =0,leftSum =0;
        for (int i =0;i<n;i++){
            totalSum +=arr[i];
        }
        for (int i =0;i<n;i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) return i;
            leftSum = leftSum + arr[i];
        }
        return -1;
    }
}
