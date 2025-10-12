import com.leetcode.common.ArrayUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = new int[]{1, 3};
    arguments[0][1] = 6;
    arguments[0][2] = 1;

    arguments[1][0] = new int[]{1, 5, 10};
    arguments[1][1] = 20;
    arguments[1][2] = 2;

    arguments[2][0] = new int[]{1, 2, 2};
    arguments[2][1] = 5;
    arguments[2][2] = 0;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] nums = (int[]) arguments[i][0];
      int n = (int) arguments[i][1];
      int expected = (int) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(nums);
      System.out.println(n);
      System.out.print("output: ");
      int output = solution.minPatches(nums, n);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}