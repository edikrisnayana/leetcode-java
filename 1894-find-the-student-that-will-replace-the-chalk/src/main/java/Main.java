import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = new int[]{5, 1, 5};
    arguments[0][1] = 22;
    arguments[0][2] = 0;

    arguments[1][0] = new int[]{3, 4, 1, 2};
    arguments[1][1] = 25;
    arguments[1][2] = 1;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] chalk = (int[]) arguments[i][0];
      int k = (int) arguments[i][1];
      int expected = (int) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(chalk);
      System.out.println(k);
      System.out.print("output: ");
      int output = solution.chalkReplacer(chalk, k);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}