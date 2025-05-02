package HashMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashMap_07_Longest_Subsequence_Consicutive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = scanner.nextInt();
        int []arr = new int [n];
        System.out.println("EnetEr Elemnet");
        for (int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(solve(arr));
    }
    static int solve(int[] arr){
        int n = arr.length;

        Set<Integer>set = new HashSet<>();
        for (int i =0;i<n;i++){
            set.add(arr[i]);
        }
        int max = 0;
        for (int i :set){
            if (!set.contains(i-1)){
                int curr =i;
                int count  = 1;
                while (set.contains(curr+1)){
                    curr++;
                    count++;

                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
