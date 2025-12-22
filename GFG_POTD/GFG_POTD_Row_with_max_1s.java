package GFG_POTD;

import java.util.Scanner;
/*
 * https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1
 *
 * You are given a 2D binary array arr[][] consisting of only 1s and 0s. Each row of the array is sorted in non-decreasing order. Your task is to find and return the index of the first row that contains the maximum number of 1s. If no such row exists, return -1.
 *  Note:
 *  The array follows 0-based indexing.
 *  The number of rows and columns in the array are denoted by n and m respectively.
 *   Examples:
 *   Input: arr[][] = [[0,1,1,1], [0,0,1,1], [1,1,1,1], [0,0,0,0]]
 *   Output: 2
 *   Explanation: Row 2 contains the most number of 1s (4 1s). Hence, the output is 2.
 * */
public class GFG_POTD_Row_with_max_1s {

/*Driver Code */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element: ");
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0;j  < n;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(rowWithMax1s(arr));

    }
    
    /* Solutions */
    public static int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int idx = m;
        int ans = -1;
        for (int i = 0; i < n; i++){
            int loweBound = lowerSearch(arr[i] , 1);
            if (loweBound != -1 && loweBound < idx){
                idx = loweBound;
                ans = i;
            }
        }
        return ans;

    }

    private int lowerSearch(int[] ints, int target) {
        int i = 0;
        int j = ints.length-1;
        int ans = -1;
        while (i <= j){
            int mid = i + (j - i)/2;
            if (ints[mid] == target){
                ans = mid;
                j = mid - 1;
            } else if (ints[mid] < target) {
                i = mid + 1;
            }
        }
        return ans;
    }

}
