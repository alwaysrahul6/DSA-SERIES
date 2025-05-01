package GFG_160_SERIES;
/*  * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-matrix-1587115621
    *  Search in a sorted Matrix.
    *   Q .Given a strictly sorted 2D matrix mat[][] of size n x m and a number x.
    *      Find whether the number x is present in the matrix or not.
    *      In a strictly sorted matrix, each row is sorted in strictly increasing order,
    *      and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.
    *
    * Ex- Input:
    *     mat[][] = [[1, 5, 9],
    *               [14, 20, 21],
    *               [30, 34, 43]],
    *  x = 14
    * Output:
    *         true
    * Explanation:
    *              14 is present in the matrix, so output is true.
*
 */
import java.util.Scanner;
///Driver Code
public class GFG_40_Search_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter Cols:");
        int cols = scanner.nextInt();
        System.out.println("Enter Element:");
        int [][]mat = new int[rows][cols];
        for (int i =0;i< rows;i++){
            for (int j = 0; j< cols;j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter Target:");
        int x = scanner.nextInt();
        if (searchMatrix(mat, x)){
            System.out.println("Yes found ");
        }else
            System.out.println("Not Found");
    }
///Solution
    public static boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;
            long start = 0 , end = (long) n * m-1;
            while (start<=end){
                long mid = start + (end - start)/2;
                int row_index = (int)mid/m;
                int cols_index = (int)mid%m;
                if (mat[row_index][cols_index]==x)return true;
                else if (mat[row_index][cols_index]<x)start = mid +1;
                else end = mid -1;
            }
        return false;
    }
}
