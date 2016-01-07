public class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        if (row == 0) return 0;
        int col = grid[0].length;
        if (col == 0) return 0;

        int[][] steps = new int[row][col];
        steps[0][0] = grid[0][0];

        //
        for(int i=1; i<row; i++) {
            steps[i][0] = steps[i-1][0] + grid[i][0];
        }

        for(int i=1; i<col; i++) {
            steps[0][i] = steps[0][i-1] + grid[0][i];
        }

        for (int i=1; i<row; i++) {
            for(int j=1; j<col; j++) {
                steps[i][j] = grid[i][j] + Math.min(steps[i-1][j], steps[i][j-1]);
            }
        }

        return steps[row-1][col-1];
    }
}
