package BACKTARCKING;/*
 * https://www.geeksforgeeks.org/problems/combination-sum-1587115620/1
 * Combination Sum
 * Given an array arr[] and a target, your task is to find all unique combinations in the array where the sum is equal to target. The same number may be chosen from the array any number of times to make target.
 * You can return your answer in any order.
 * Examples:
 *  Input: arr[] = [2, 4, 6, 8], target = 8
 *  Output: [[2 2 2 2] [2 2 4] [2 6] [4 4] [8]]
 *  Explanation: Total number of possible combinations are 5.
 *  */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BT_Combination_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter Target:");
        int target = scanner.nextInt();
        System.out.println(combinationSum(arr , target));
    }
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        HashSet<ArrayList<Integer>> set = new HashSet<>();

        f(0, n, target, arr, new ArrayList<>(), set);

        return new ArrayList<>(set);
    }
    private static void f(int idx, int n, int target, int[] arr, ArrayList<Integer> list, HashSet<ArrayList<Integer>> set) {
        // base case
        if (target == 0) {
            set.add(new ArrayList<>(list));
            return;
        }
        if (idx >= n) return;

        // recursive work
        if (target >= arr[idx]) {
            list.add(arr[idx]);
            f(idx, n, target - arr[idx], arr, list, set);
            list.remove(list.size()-1);
        }
        f(idx + 1, n, target, arr, list, set);
    }
}
