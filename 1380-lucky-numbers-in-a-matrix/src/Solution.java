import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int minCol = minInRow(matrix, n, i);

            int min = matrix[i][minCol];
            if (maxInCol(matrix, m, minCol, min)) {
                result.add(min);
            }
        }

        return result;
    }

    private int minInRow(int[][] matrix, int n, int row) {
        int min = matrix[row][0];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (min > matrix[row][i]) {
                min = matrix[row][i];
                index = i;
            }
        }
        return index;
    }

    private boolean maxInCol(int[][] matrix, int m, int col, int val) {
        int max = val;
        for (int i = 0; i < m; i++) {
            if (max < matrix[i][col]) {
                max = matrix[i][col];
            }
        }

        return max == val;
    }
}
