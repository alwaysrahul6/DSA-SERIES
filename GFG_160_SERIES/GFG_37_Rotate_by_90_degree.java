package GFG_160_SERIES;
/*      * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/rotate-by-90-degree-1587115621
        * Rotate by 90 degree.
        *
        *   Q.Given a square matrix mat[][] of size n x n.
        *     The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.
        * Examples:
        *   Input: mat[][] = [[1, 2, 3],
        *                     [4, 5, 6]
        *                     [7, 8, 9]]
        *   Output: Rotated Matrix:
        *        [3, 6, 9]
        *        [2, 5, 8]
        *        [1, 4, 7]
        *
 */
import java.util.Scanner;

public class GFG_36_Rotate_by_90_degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter cols");
        int cols = scanner.nextInt();
        System.out.println("Enter Element:");
        int [][]arr = new int[rows][cols];
        for (int i =0;i<rows;i++){
            for (int j = 0;j<cols;j++){
                arr[i][j]= scanner.nextInt();
            }
        }
        /// Rotated Matrix
        System.out.println("Rotated Matrix:");
        rotateby90(arr);
        for (int i = 0;i<rows;i++){
            for (int j =0;j<cols;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void rotateby90(int mat[][]) {
           int n = mat.length;
        /// Reverse Of Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - 1 - j];
                mat[i][n - 1 - j] = temp;
            }
        }
        /// Transpose Of Matrix
           for (int i =0;i<n-1;i++){
               for (int j = i+1;j<n;j++){
                   int temp = mat[i][j];
                   mat[i][j]= mat[j][i];
                   mat[j][i] = temp;
               }
           }
    }
}
