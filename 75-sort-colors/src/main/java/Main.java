import com.leetcode.common.ArrayUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new int[]{2, 0, 2, 1, 1, 0};
    arguments[0][1] = new int[]{0, 0, 1, 1, 2, 2};

    arguments[1][0] = new int[]{2, 0, 1};
    arguments[1][1] = new int[]{0, 1, 2};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] nums = (int[]) arguments[i][0];
      int[] expected = (int[]) arguments[i][1];
      System.out.print("input: ");
      ArrayUtils.print(nums);
      System.out.print("output: ");
      solution.sortColors(nums);
      ArrayUtils.print(nums);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(nums, expected));
      System.out.println();
    }
  }
}