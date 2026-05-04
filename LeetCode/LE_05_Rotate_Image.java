package LeetCode;
/*
 * https://leetcode.com/problems/rotate-image/description/?envType=daily-question&envId=2026-05-04
 *
 * Rotate Image
 *  You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 *  You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 *  DO NOT allocate another 2D matrix and do the rotation.
 *  Example 1:
 *  Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 *  Output: [[7,4,1],[8,5,2],[9,6,3]]
 *
 *   +---+---+---+       +---+---+---+
 *   | 1 | 2 | 3 |       | 7 | 4 | 1 |
 *   +---+---+---+       +---+---+---+
 *   | 4 | 5 | 6 |  -->  | 8 | 5 | 2 |
 *   +---+---+---+       +---+---+---+
 *   | 7 | 8 | 9 |       | 9 | 6 | 3 |
 *   +---+---+---+       +---+---+---+
 * 
 * 
 * */
public class LE_05_Rotate_Image {
    public static void main(String[] args) {

        int [][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat);

    }

    /* Solutions */

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        /*Transpose A Matrix */

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


        /* Reverce A Matrix*/

        for (int i = 0; i < n; i++){
            int left = 0;
            int right = matrix[0].length - 1;
            while (left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }
}
