package GFG_POTD;

import java.util.PriorityQueue;
import java.util.Scanner;

/* https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1
 *
 * #. Nearly sorted
 *
 * Q. Given an array arr[], where each element is at most k positions away from its correct position in the sorted order
 *    Your task is to restore the sorted order of arr[] by rearranging the elements in place.
 *
 *    Note: Don't use any sort() method.
 *
 *   Ex. Input: arr[] = [2, 3, 1, 4], k = 2
 *       Output: [1, 2, 3, 4]
 *       Explanation: All elements are at most k = 2 positions away from their correct positions.
 *       Element 1 moves from index 2 to 0
 *       Element 2 moves from index 0 to 1
 *       Element 3 moves from index 1 to 2
 *       Element 4 stays at index 3
 * */
public class GFG_POTD_18_Nearly_sorted {
    //Driver Code
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        String s[] = scanner.nextLine().split(" ");
        int m = s.length;
        int arr[] = new int[m];
        for (int i = 0; i < m; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter K");
        int k = scanner.nextInt();
        nearlySorted(arr , k);
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j]);
        }
    }

    //Solutions
    public static void nearlySorted(int[] arr, int k) {
        int n = arr.length;
        int idx = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++){
            priorityQueue.add(arr[i]);
        }

        while (!priorityQueue.isEmpty()){
            int m = priorityQueue.poll();
            arr[idx++] = m;
        }
    }
}
