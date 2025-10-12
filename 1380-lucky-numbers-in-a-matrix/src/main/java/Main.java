import com.leetcode.common.ArrayUtils;
import com.leetcode.common.ListUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][2];
    arguments[0][0] = new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
    arguments[0][1] = new int[]{15};

    arguments[1][0] = new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
    arguments[1][1] = new int[]{12};

    arguments[2][0] = new int[][]{{7, 8}, {1, 2}};
    arguments[2][1] = new int[]{7};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[][] metrics = (int[][]) arguments[i][0];
      int[] expected = (int[]) arguments[i][1];
      System.out.print("input: ");
      ArrayUtils.print(metrics);
      System.out.print("output: ");
      int[] output = ListUtils.toArray(solution.luckyNumbers(metrics));
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}