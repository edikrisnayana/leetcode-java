import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new int[]{1, 2, 3, 3, 2, 2};
    arguments[0][1] = 2;

    arguments[1][0] = new int[]{1, 2, 3, 4};
    arguments[1][1] = 1;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] nums = (int[]) arguments[i][0];
      int expected = (int) arguments[i][1];
      System.out.print("input: ");
      ArrayUtils.print(nums);
      System.out.print("output: ");
      int output = solution.longestSubarray(nums);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}