import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = new int[]{1, 3, 4, 8};
    arguments[0][1] = new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}};
    arguments[0][2] = new int[]{2, 7, 14, 8};

    arguments[1][0] = new int[]{4, 8, 2, 10};
    arguments[1][1] = new int[][]{{2, 3}, {1, 3}, {0, 0}, {0, 3}};
    arguments[1][2] = new int[]{8, 0, 4, 4};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] arr = (int[]) arguments[i][0];
      int[][] queries = (int[][]) arguments[i][1];
      int[] expected = (int[]) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(arr);
      ArrayUtils.print(queries);
      System.out.print("output: ");
      int[] output = solution.xorQueries(arr, queries);
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}