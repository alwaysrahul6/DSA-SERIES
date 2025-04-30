package GFG_160_SERIES;
/*    * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-row-wise-sorted-matrix
      * Search in a row-wise sorted matrix.
      * Q.  Given a row-wise sorted 2D matrix mat[][] of size n x m and an integer x, find whether element x is present in the matrix.
      *  Note: In a row-wise sorted matrix, each row is sorted in itself, i.e. for any i, j within bounds, mat[i][j] <= mat[i][j+1].
      *
      * Exa: Input:
      *       mat[][] = [[3, 4, 9],
      *                 [2, 5, 6],
      *                 [9, 25, 27]],
      *          x = 9
      *  Output:true
      *
      *  Explanation:9 is present in the matrix, so the output is true.
      *

 */

import java.util.Scanner;

public class GFG_39_Search_in_a_row_wise_sorted_matrix {
    /// Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size:");
        int n = scanner.nextInt();;
        System.out.println("Enter Cols:");
        int m = scanner.nextInt();
        System.out.println("Enter Element");
        int [][] mat = new int[n][m];
        for (int i =0;i<n;i++){
            for (int j = 0;j<m;j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter Element That You Find:");
        int x = scanner.nextInt();
        System.out.println(searchRowMatrix(mat, x));

    }
    /// Solution
    public static boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        for (int[] ints : mat) {
            int start = 0, end = m - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (ints[mid] == x) return true;
                else if (ints[mid] < x) start = mid + 1;
                else end = mid - 1;
            }
        }
       return false;
    }
}
