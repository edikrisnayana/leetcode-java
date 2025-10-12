import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][4];
    arguments[0][0] = new int[]{1, 2, 3, 4};
    arguments[0][1] = 2;
    arguments[0][2] = 2;
    arguments[0][3] = new int[][]{{1, 2}, {3, 4}};

    arguments[1][0] = new int[]{1, 2, 3};
    arguments[1][1] = 1;
    arguments[1][2] = 3;
    arguments[1][3] = new int[][]{{1, 2, 3}};

    arguments[2][0] = new int[]{1, 2};
    arguments[2][1] = 1;
    arguments[2][2] = 1;
    arguments[2][3] = new int[][]{};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] original = (int[]) arguments[i][0];
      int m = (int) arguments[i][1];
      int n = (int) arguments[i][2];
      int[][] expected = (int[][]) arguments[i][3];
      System.out.println("input: ");
      ArrayUtils.print(original);
      System.out.println(m);
      System.out.println(n);
      System.out.print("output: ");
      int[][] output = solution.construct2DArray(original, m, n);
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}