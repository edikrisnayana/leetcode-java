import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = new int[]{2, 7, 11, 15};
    arguments[0][1] = 9;
    arguments[0][2] = new int[]{0, 1};

    arguments[1][0] = new int[]{3, 2, 4};
    arguments[1][1] = 6;
    arguments[1][2] = new int[]{1, 2};

    arguments[2][0] = new int[]{3, 3};
    arguments[2][1] = 6;
    arguments[2][2] = new int[]{0, 1};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] nums = (int[]) arguments[i][0];
      int target = (int) arguments[i][1];
      int[] expected = (int[]) arguments[i][2];
      System.out.println("input:");
      ArrayUtils.print(nums);
      System.out.println("output:");
      int[] output = solution.twoSum(nums, target);
      ArrayUtils.print(output);
      System.out.println("expected:");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(expected, output));
      System.out.println();
    }
  }
}
