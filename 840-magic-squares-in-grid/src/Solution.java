public class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        if (row < 3 || col < 3) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                if (valid(grid, i, i + 2, j, j + 2)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean valid(int[][] grid, int topRow, int botRow, int leftCol, int rightCol) {
        boolean[] arr = new boolean[16];
        for (int i = topRow; i <= botRow; i++) {
            int sum = 0;
            for (int j = leftCol; j <= rightCol; j++) {
                sum += grid[i][j];
                arr[grid[i][j]] = true;
            }
            if (sum != 15) {
                return false;
            }
        }

        for (int i = 1; i <= 9; i++) {
            if (!arr[i]) {
                return false;
            }
        }

        for (int j = leftCol; j <= rightCol; j++) {
            int sum = 0;
            for (int i = topRow; i <= botRow; i++) {
                sum += grid[i][j];
            }
            if (sum != 15) {
                return false;
            }
        }

        if (grid[topRow][leftCol] + grid[topRow + 1][leftCol + 1] + grid[topRow + 2][leftCol + 2] != 15) {
            return false;
        }

        if (grid[botRow][leftCol] + grid[botRow - 1][leftCol + 1] + grid[botRow - 2][leftCol + 2] != 15) {
            return false;
        }

        return true;
    }
}
