//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new int[]{2, 6, 4, 1};
    arguments[0][1] = false;

    arguments[1][0] = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
    arguments[1][1] = true;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] arr = (int[]) arguments[i][0];
      boolean expected = (boolean) arguments[i][1];
      System.out.println("input: ");
      ArrayUtils.print(arr);
      System.out.print("output: ");
      boolean output = solution.threeConsecutiveOdds(arr);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}