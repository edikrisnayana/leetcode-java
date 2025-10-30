import com.leetcode.common.ArrayUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][2];
    arguments[0][0] = new int[]{1, 2, 3, 2, 1};
    arguments[0][1] = 3;

    arguments[1][0] = new int[]{3, 1, 1, 2};
    arguments[1][1] = 4;

    arguments[2][0] = new int[]{3, 1, 5, 4, 2};
    arguments[2][1] = 7;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] target = (int[]) arguments[i][0];
      int expected = (int) arguments[i][1];
      System.out.print("input: ");
      ArrayUtils.print(target);
      System.out.print("output: ");
      int output = solution.minNumberOperations(target);
      System.out.println(output);
      System.out.println("expected: " + expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}