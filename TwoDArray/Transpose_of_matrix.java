package ARRAYS.TwoDArray;
/*  *    Transpose of Matrix.
    *    
    *    Q. Write a program to find the transpose of a square matrix of size N*N. 
    *       Transpose of a matrix is obtained by changing rows to columns and columns to rows.
    *       Example: 
    *               Original Matrix:
    *               1 2 3 4
    *               5 6 7 8
    *               9 10 11 12
    *               13 14 15 16
    * 
    *               Transpose Of Matrix:
    *                1 5 9 13
    *                2 6 10 14
    *                3 7 11 15
    *                4 8 12 16
 */
import java.util.Scanner;

public class Transpose_of_matrix {

   private static void printMatrix(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Size:");
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter Element:");
        for (int i =0;i<n;i++){
            for (int  j =0;j<n;j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Matrix;");
        printMatrix(mat,n);

        System.out.println("Transpose Matrix:");

        transpose(n,mat);

        printMatrix(mat,n);

        scanner.close();


    }
    public static void transpose(int n, int mat[][]) {
        for (int i =0;i<n-1;i++){
            for (int j =i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
