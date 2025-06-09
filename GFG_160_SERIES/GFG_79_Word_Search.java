package GFG_160_SERIES;

/*      *   Word Search
 *       *   Q.You are given a two-dimensional mat[][] of size n*m containing English alphabets and a string word. Check if the word exists on the mat. The word can be constructed by using letters from adjacent cells,
 *       *     either horizontally or vertically. The same cell cannot be used more than once.
 *     Examples :
 *     Input: mat[][] = [['T', 'E', 'E'], ['S', 'G', 'K'], ['T', 'E', 'L']], word = "GEEK"
 *     Output: true*/
public class GFG_79_Word_Search {
    static public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (word.charAt(0) == mat[i][j]) {
                    boolean found = find(mat, i, j, word, 0);
                    if (found) return true;
                }
            }
        }
        return false;

    }

    static boolean find(char[][] board, int r, int c, String word, int wordIndex) {
        int rows = board.length;
        int cols = board[0].length;
        // base case
        //out of bound case
        if (r >= rows || c >= cols) return false;

        //negative case

        if (r < 0 || c < 0) return false;

        //visited case
        if (board[r][c] == '$') return false;

        //all character  character

        if (wordIndex == word.length()) return true;

        // if character doesnt match
        if (board[r][c] != word.charAt(wordIndex)) return false;

        char ch = board[r][c];
        board[r][c] = '$';
        //dfs calls

        if (find(board, r + 1, c, word, wordIndex + 1) ||
                find(board, r, c + 1, word, wordIndex + 1) ||
                find(board, r - 1, c, word, wordIndex + 1) ||
                find(board, r, c - 1, word, wordIndex + 1)) {
            return true;
        }
        board[r][c] = ch;
        return false;
    }

    public static void main(String[] args) {
        char mat[][] = {{'T', 'E', 'E'},
                {'S', 'G', 'K'},
                {'T', 'E', 'L'}};
        String words = "GEEK";
        System.out.println(isWordExist(mat, words));
    }
}
