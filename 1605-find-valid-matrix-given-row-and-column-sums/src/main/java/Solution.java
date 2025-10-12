public class Solution {
  public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
    int m = rowSum.length;
    int n = colSum.length;
    int[][] result = new int[m][n];
    for (int i = 0, j = 0; i < m && j < n; ) {
      int val = Math.min(rowSum[i], colSum[j]);
      result[i][j] = val;
      rowSum[i] -= val;
      colSum[j] -= val;
      if (rowSum[i] == 0) {
        i++;
      }
      if (colSum[j] == 0) {
        j++;
      }
    }
    return result;
  }
}
