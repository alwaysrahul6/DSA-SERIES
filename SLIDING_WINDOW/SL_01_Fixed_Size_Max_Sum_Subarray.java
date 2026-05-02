package SLIDING_WINDOW;

import java.util.Arrays;
import java.util.Scanner;

public class SL_01_Fixed_Size_Max_Sum_Subarray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String []s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter K");
        int k = scanner.nextInt();
        System.out.println(Arrays.toString(new int[]{maxSum(arr, k)}));

    }

    static int maxSum(int arr[] , int k){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i = 0;
        int j = 0;
        while (j < n){
            if (j - i + 1 < k )j++;
            sum += arr[j];
            if (j - i + 1 == k){
                max = Math.max(max , sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }

}
