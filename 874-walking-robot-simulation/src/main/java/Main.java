import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = new int[]{4, -1, 3};
    arguments[0][1] = new int[][]{};
    arguments[0][2] = 25;

    arguments[1][0] = new int[]{4, -1, 4, -2, 4};
    arguments[1][1] = new int[][]{{2, 4}};
    arguments[1][2] = 65;

    arguments[2][0] = new int[]{6, -1, -1, 6};
    arguments[2][1] = new int[][]{};
    arguments[2][2] = 36;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] commands = (int[]) arguments[i][0];
      int[][] obstacles = (int[][]) arguments[i][1];
      int expected = (int) arguments[i][2];
      System.out.print("input: ");
      ArrayUtils.print(commands);
      ArrayUtils.print(obstacles);
      System.out.print("output: ");
      int output = solution.robotSim(commands, obstacles);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}