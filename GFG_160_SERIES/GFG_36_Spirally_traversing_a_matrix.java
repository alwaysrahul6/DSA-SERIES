package GFG_160_SERIES;
/*  * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/spirally-traversing-a-matrix-1587115621
    * Spirally traversing a matrix.
    *       You are given a rectangular matrix mat[][] of size n x m,
    *       and your task is to return an array while traversing the matrix in spiral form.
    *
    *      Ex:
    *      Input: mat[][] = [[1, 2, 3, 4],
    *                   [5, 6, 7, 8],
    *                   [9, 10, 11, 12],
    *                   [13, 14, 15, 16]]
    *      Output:
    *              [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
 */



import java.util.ArrayList;
import java.util.Scanner;

public class GFG_36_Spirally_traversing_a_matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        printMatrix(arr);

        System.out.println("\nSpiral Traversal:");
        ArrayList<Integer> result = spirallyTraverse(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
private  static  void printMatrix(int[][]mat){
        for (int []row :mat){
            for (int num :row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
}

    public static ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        int row = mat.length, cols = mat[0].length, left = 0, right = cols - 1, top = 0, botom = row - 1;

        while (top <= botom && left <= right) {
            /// Top
            for (int j = left; j <= right; j++) {
                ans.add(mat[top][j]);
            }
            top++;
            /// Right
            for (int i = top; i <= botom; i++) {
                ans.add(mat[i][right]);
            }
            right--;
            ///  bottom
            if (top <= botom) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[botom][i]);
                }
                botom--;
            }
            if (left <= right) {
                for (int i = botom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
