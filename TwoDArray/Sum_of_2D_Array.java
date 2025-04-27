package ARRAYS.TwoDArray;


import java.util.Scanner;

public class Sum_of_2D_Array {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void sum(int a[][], int b[][], int r1, int r2, int c1, int c2) {
        if (r1 != r2 || c1 != c2){
            System.out.println("Invalid Length");
            return;      /// if the length are not same in two matrix
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of 2 matrix ");
        printMatrix(sum);
    }

    public static void main(String[] args) {

        ///  First Matrix
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows & Enter Cols in matrix 1");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter The values ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        /// Second Matrix
        System.out.println("Enter rows & Enter Cols in matrix 2");
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter The value:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Print Matrix 1:");
        printMatrix(a);
        System.out.println("Print Matrix 2:");
        printMatrix(b);

        sum(a, b, r1, c1, r2, c2);

    }
}
