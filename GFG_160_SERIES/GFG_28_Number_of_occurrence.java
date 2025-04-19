package GFG_160_SERIES;
/*  * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/number-of-occurrence2259
    * Q- Number of occurrence
    * Given a sorted array, arr[] and a number target, 
    * you need to find the number of occurrences of target in arr[].
    * Examples :
    * Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
    * Output: 4
    * Explanation: target = 2 occurs 4 times in the given array so the output is 4.
 * */
import java.util.Scanner;
/// Driver Code
public class GFG_28_Number_of_occurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = scanner.nextInt();
        System.out.println("Enter Element:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter Target:");
        int target = scanner.nextInt();
        System.out.println(occurence(arr, target));
    }
/// Solution
    private static int occurence(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) count++;
        }
        return count;
    }
}
