class Solution {
  public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
    int[][] grid = new int[m][n];
    for (int[] wall : walls) {
      grid[wall[0]][wall[1]] = 1;
    }

    for (int[] guard : guards) {
      grid[guard[0]][guard[1]] = 2;
    }

    int count = 0;
    for (int[] guard : guards) {
      int row = guard[0];
      int col = guard[1];
      for (int i = row - 1; i >= 0 && grid[i][col] < 1; i--) {
        if (grid[i][col] == 0) {
          count++;
          grid[i][col] = -1;
        }
      }

      for (int i = row + 1; i < m && grid[i][col] < 1; i++) {
        if (grid[i][col] == 0) {
          count++;
          grid[i][col] = -1;
        }
      }

      for (int i = col - 1; i >= 0 && grid[row][i] < 1; i--) {
        if (grid[row][i] == 0) {
          count++;
          grid[row][i] = -1;
        }
      }

      for (int i = col + 1; i < n && grid[row][i] < 1; i++) {
        if (grid[row][i] == 0) {
          count++;
          grid[row][i] = -1;
        }
      }
    }

    return (m * n) - walls.length - guards.length - count;
  }
}