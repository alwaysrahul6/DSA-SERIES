package GFG_160_SERIES;
/*      *   Solve the Sudoku
        *   Given an incomplete Sudoku configuration in terms of a 9x9  2-D interger square matrix, mat[][], the task is to solve the Sudoku. It is guaranteed that the input Sudoku will have exactly one solution.
        *
        *   A sudoku solution must satisfy all of the following rules:
        *   Each of the digits 1-9 must occur exactly once in each row.
        *   Each of the digits 1-9 must occur exactly once in each column.
        *   Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
        *   Note: Zeros represent blanks to be filled with numbers 1-9, while non-zero cells are fixed and cannot be changed.
        *   Example - int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        *   output -{ 5 3 4 6 7 8 9 1 2
                      6 7 2 1 9 5 3 4 8
                      1 9 8 3 4 2 5 6 7
                      8 5 9 7 6 1 4 2 3
                      4 2 6 8 5 3 7 9 1
                      7 1 3 9 2 4 8 5 6
                      9 6 1 5 3 7 2 8 4
                      2 8 7 4 1 9 6 3 5
                      3 4 5 2 8 6 1 7 9 }
 */
public class GFG_78_Solve_the_Sudoku {

    static void solveSudoku(int[][] mat) {
        solve(mat);
    }

    static boolean solve(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    for (int c = 1; c <= 9; c++) {
                        if (isvalid(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isvalid(int[][] board, int row, int col, int c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) return false;
            if (board[row][i] == c) return false;

            int subrow = 3 * (row / 3) + i / 3;
            int subcol = 3 * (col / 3) + i % 3;
            if (board[subrow][subcol] == c) return false;
        }
        return true;
    }

    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        solveSudoku(board);
        printBoard(board);
    }
}
