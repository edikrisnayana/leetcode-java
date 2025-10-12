//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][4];
    arguments[0][0] = new int[]{1, 10, 3, 10, 2};
    arguments[0][1] = 3;
    arguments[0][2] = 1;
    arguments[0][3] = 3;

    arguments[1][0] = new int[]{1, 10, 3, 10, 2};
    arguments[1][1] = 3;
    arguments[1][2] = 2;
    arguments[1][3] = -1;

    arguments[2][0] = new int[]{7, 7, 7, 7, 12, 7, 7};
    arguments[2][1] = 2;
    arguments[2][2] = 3;
    arguments[2][3] = 12;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] bloomDay = (int[]) arguments[i][0];
      int m = (int) arguments[i][1];
      int k = (int) arguments[i][2];
      int expected = (int) arguments[i][3];
      System.out.println("input: ");
      ArrayUtils.print(bloomDay);
      System.out.println(m);
      System.out.println(k);
      System.out.print("output: ");
      int output = solution.minDays(bloomDay, m, k);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}