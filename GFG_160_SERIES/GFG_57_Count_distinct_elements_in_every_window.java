package GFG_160_SERIES;
/*
═══════════════════════════════════════════════════════════════════════════════
        🟩 Problem: Count Distinct Elements in Every Window
        🔗 Link: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-distinct-elements-in-every-window

        📄 Description:
        Given an integer array `arr[]` and an integer `k`, find the count of distinct
        elements in every window of size `k` in the array.

        🧠 Example:
            Input:  arr[] = [1, 2, 1, 3, 4, 2, 3],  k = 4
            Output: [3, 4, 4, 3]

        🪟 Explanation:
            - Window 1: [1, 2, 1, 3] → 3 distinct elements
            - Window 2: [2, 1, 3, 4] → 4 distinct elements
            - Window 3: [1, 3, 4, 2] → 4 distinct elements
            - Window 4: [3, 4, 2, 3] → 3 distinct elements
═══════════════════════════════════════════════════════════════════════════════
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GFG_57_Count_distinct_elements_in_every_window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input window size k
        System.out.print("Enter the window size k: ");
        int k = sc.nextInt();

        if(k > n || k <= 0) {
            System.out.println("Invalid window size!");
            return;
        }

        // Call the function and get result
        ArrayList<Integer> result = countDistinct(arr, k);

        // Print the result
        System.out.println("Count of distinct elements in every window of size " + k + ":");
        for(int count : result) {
            System.out.print(count + " ");
        }
    }
/// Solution
static ArrayList<Integer> countDistinct(int arr[], int k) {
    ArrayList<Integer> ans = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < k; i++) {
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    ans.add(map.size());
    for (int i = k; i < arr.length; i++) {
        if (map.get(arr[i - k]) == 1) {
            map.remove(arr[i - k]);
        } else {
            map.put(arr[i - k], map.getOrDefault(arr[i - k], 0) - 1);
        }
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        ans.add(map.size());
    }
    return ans;
}
}
