package GFG_160_SERIES;
/*    *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/set-matrix-zeroes
      *   Set Matrix Zeroes
      *  Q.You are given a 2D matrix mat[][] of size n×m. The task is to modify the matrix such that if mat[i][j] is 0,
      *     all the elements in the i-th row and j-th column are set to 0 and do it in constant space complexity.
      *      Input:
      *      mat[][] = [[1, -1, 1],
      *                 [-1, 0, 1],
      *                 [1, -1, 1]]
      * 
      *      Output: [[1, 0, 1],
      *               [0, 0, 0],
      *               [1, 0, 1]]
      *  Explanation: mat[1][1] = 0, so all elements in row 1 and column 1 are updated to zeroes.*/


import java.util.Scanner;

public class GFG_41_Set_Matrix_Zeroes {
    /// Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size:");
        int rows  =scanner.nextInt();
        System.out.println("Cols");
        int cols = scanner.nextInt();
        System.out.println("Enter Element:");
        int mat[][] = new int[rows][cols];
        for (int i =0;i<rows;i++){
            for (int j = 0; j< cols;j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Input Matrix:");
        printMatrix(mat);
        System.out.println("Resultant Matrix");

        printMatrix(mat);
        System.out.println("Brute Force");
        printMatrix(mat);
    }

/// Solution

    private static void markedRows (int mat[][], int row){
        for (int i = 0;i< mat.length;i++){
            if (mat[i][row] != 0 && mat[i][row] != -1){
                mat[i][row] = -1;
            }
        }
    }
    private static void markedCols(int mat[][], int cols){
        int m = mat.length;
        for (int i =0;i<m;i++){
            if (mat[i][cols]!=0 && mat[i][cols] != -1){
                mat[i][cols] = -1;
            }
        }
    }

    public static void setMatrixZeroesBrute(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j]==0){
                    markedRows(mat,i);
                    markedCols(mat,j);
                }
            }
        }
        for (int i = 0;i<n;i++){
            for (int j = 0;j < m;j++){
                if (mat[i][j] == -1){
                    mat[i][j] =0;
                }
            }
        }
    }
    public static  void setMatrixZeroes(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int []rows = new int[n];
        int []cols = new int[m];
        /// Marked In Row And Cols
        for (int i =0;i<n;i++){
            for (int j = 0;j<m;j++){
                if (mat[i][j]==0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
///     Marked row And cols is to put is 0
        for (int i = 0;i<n;i++){
            for (int j =0;j<m;j++){
                if (rows[i] ==1 || cols[j] ==1 ){
                    mat[i][j] = 0;
                }
            }
        }
    }


    private static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
