
/**
 * @ClassName Trees90
 * @Description leetcode 200
 * @Author GZfan
 * @Date 19-5-29
 */
public class Trees90 {
    public int numIslands(char[][] grid) {
        if (grid == null) {
            return 0;
        }
        int rowLen = grid.length;
        int columnLen = grid[0].length;
        int num = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < columnLen; j++) {
                if (grid[i][j] == '1') {
                    mark(grid, i, j, rowLen, columnLen);
                    num++;
                }
            }
        }
        return num;
    }

    private static void mark(char[][] grid, int i, int j, int row, int col) {
        if (i < 0 || i == row || j < 0 || j == col || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        mark(grid, i - 1, j, row, col);
        mark(grid, i + 1, j, row, col);
        mark(grid, i, j - 1, row, col);
        mark(grid, i, j + 1, row, col);

    }
}
