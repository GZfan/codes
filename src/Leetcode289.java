/**
 * @ClassName Leetcode289
 * @Description
 * @Author GZfan
 * @Date 2019/12/23
 */
public class Leetcode289 {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = board[i][j] << 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                adjust(board, m, n, i, j);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = board[i][j] & 1;
            }
        }
    }

    private static void adjust(int[][] board, int m, int n, int i, int j) {
        int count = 0;
        if (i != 0 && j != 0 && board[i - 1][j - 1] >> 1 == 1) {
            count++;
        }
        if (i != 0 && board[i - 1][j] >> 1 == 1) {
            count++;
        }
        if (j != 0 && board[i][j - 1] >> 1 == 1) {
            count++;
        }
        if (i + 1 < m && board[i + 1][j] >> 1 == 1) {
            count++;
        }
        if (j + 1 < n && board[i][j + 1] >> 1 == 1) {
            count++;
        }
        if (i != 0 && j + 1 < n && board[i - 1][j + 1] >> 1 == 1) {
            count++;
        }
        if (i + 1 < m && j != 0 && board[i + 1][j - 1] >> 1 == 1) {
            count++;
        }
        if (i + 1 < m && j + 1 < n && board[i + 1][j + 1] >> 1 == 1) {
            count++;
        }
        if ((board[i][j] & 1) == 1) {
            if (count == 2 || count == 3) {
                board[i][j] = board[i][j] | 1;
            }
        } else if (count == 3) {
            board[i][j] = board[i][j] | 1;
        }
    }


}
