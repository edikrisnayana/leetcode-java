import com.leetcode.common.ArrayUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new int[][]{{1, 2}, {2, 5}, {4, 3}};
    arguments[0][1] = 5.00000;

    arguments[1][0] = new int[][]{{5, 2}, {5, 4}, {10, 3}, {20, 1}};
    arguments[1][1] = 3.25000;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[][] customers = (int[][]) arguments[i][0];
      double expected = (double) arguments[i][1];
      System.out.print("input: ");
      ArrayUtils.print(customers);
      System.out.print("output: ");
      double output = solution.averageWaitingTime(customers);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}