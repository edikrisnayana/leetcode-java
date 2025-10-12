import com.leetcode.common.ArrayUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = new int[]{3, 8};
    arguments[0][1] = new int[]{4, 7};
    arguments[0][2] = new int[][]{{3, 0}, {1, 7}};

    arguments[1][0] = new int[]{5, 7, 10};
    arguments[1][1] = new int[]{8, 6, 8};
    arguments[1][2] = new int[][]{{5, 0, 0}, {3, 4, 0}, {0, 2, 8}};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] rowSum = (int[]) arguments[i][0];
      int[] colSum = (int[]) arguments[i][1];
      int[][] expected = (int[][]) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(rowSum);
      ArrayUtils.print(colSum);
      System.out.print("output: ");
      int[][] output = solution.restoreMatrix(rowSum, colSum);
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}