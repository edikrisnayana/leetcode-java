import com.leetcode.common.ArrayUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][5];
    arguments[0][0] = 4;
    arguments[0][1] = 6;
    arguments[0][2] = new int[][]{{0, 0}, {1, 1}, {2, 3}};
    arguments[0][3] = new int[][]{{0, 1}, {2, 2}, {1, 4}};
    arguments[0][4] = 7;

    arguments[1][0] = 3;
    arguments[1][1] = 3;
    arguments[1][2] = new int[][]{{1, 1}};
    arguments[1][3] = new int[][]{{0, 1}, {1, 0}, {2, 1}, {1, 2}};
    arguments[1][4] = 4;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int m = (int) arguments[i][0];
      int n = (int) arguments[i][1];
      int[][] guards = (int[][]) arguments[i][2];
      int[][] walls = (int[][]) arguments[i][3];
      int expected = (int) arguments[i][4];
      System.out.println("input: ");
      System.out.println(m);
      System.out.println(n);
      ArrayUtils.print(guards);
      ArrayUtils.print(walls);
      System.out.print("output: ");
      int output = solution.countUnguarded(m, n, guards, walls);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (expected == output));
      System.out.println();
    }
  }
}