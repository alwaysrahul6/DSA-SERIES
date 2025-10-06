package GFG_POTD;

import java.util.ArrayList;

/* https://www.geeksforgeeks.org/problems/the-knights-tour-problem/1
 * The Knight's tour problem
 *
 * You are given an integer n, there is a n × n chessboard with a Knight starting at the top-left corner (0, 0). Your task is to determine a valid Knight's Tour,
 * where the Knight visits every square exactly once, following the standard movement rules of a chess Knight (two steps in one direction and one step perpendicular),
 * for example if a Knight is placed at cell (2, 2), in one move it can move to any of the following cells:
 *  (4, 3), (4, 1), (0, 3), (0, 1), (3, 4), (3, 0), (1, 4) and (1, 0).
 *  You have to return the order in which each cell is visited. If a solution exists, return the sequence of numbers (starting from 0) representing the order of visited squares. If no solution is possible, return an empty list.
 *  Note: You can return any valid ordering, if it is correct the driver code will print true else it will print false.
 *
 * Input: n = 5
 * Output: true
 * Explanation: A possible Knight's Tour in a 5x5 chessboard is given below where Each number represents the step at which the Knight visits that cell, starting from (0, 0) as step 0.
                [[0, 11, 2, 17, 20],
                 [3, 16, 19, 12, 7],
                 [10, 1, 6, 21, 18],
                 [15, 4, 23, 8, 13],
                 [24, 9, 14, 5, 22]]
 * */
package GFG_POTD;

import java.util.ArrayList;

public class GFG_POTD_02_The_Knight_tour_problem {
    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Integer>> result = knightTour(n);

        if (result.isEmpty()) {
            System.out.println("No solution exists for n = " + n);
        } else {
            System.out.println("Knight's Tour for " + n + "x" + n + " board:\n");
            printBoard(result);
        }
    }

    private static void printBoard(ArrayList<ArrayList<Integer>> board) {
        int n = board.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", board.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> knightTour(int n) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        // Initialize result board with -1
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) temp.add(-1);
            res.add(temp);
        }

        int[] di = {-2, -2, -1, 1, 2, 2, 1, -1};
        int[] dj = {-1, 1, 2, 2, 1, -1, -2, -2};

        boolean[][] visited = new boolean[n][n];

        // Start from (0,0)
        res.get(0).set(0, 0);
        visited[0][0] = true;

        if (solveTour(0, 0, 0, n, di, dj, res, visited)) {
            return res;
        } else {
            return new ArrayList<>();
        }
    }

    private static boolean solveTour(int i, int j, int step, int n,
                                     int[] di, int[] dj,
                                     ArrayList<ArrayList<Integer>> res,
                                     boolean[][] visited) {

        if (step == n * n - 1) return true;

        for (int k = 0; k < 8; k++) {
            int ni = i + di[k];
            int nj = j + dj[k];

            if (ni >= 0 && nj >= 0 && ni < n && nj < n && !visited[ni][nj]) {

                visited[ni][nj] = true;
                res.get(ni).set(nj, step + 1);

                if (solveTour(ni, nj, step + 1, n, di, dj, res, visited)) return true;

                // backtrack
                visited[ni][nj] = false;
                res.get(ni).set(nj, -1);
            }
        }
        return false;
    }
}

