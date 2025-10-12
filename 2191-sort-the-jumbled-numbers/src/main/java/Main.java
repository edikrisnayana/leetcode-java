import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = new int[]{8, 9, 4, 0, 2, 1, 3, 5, 7, 6};
    arguments[0][1] = new int[]{991, 338, 38};
    arguments[0][2] = new int[]{338, 38, 991};

    arguments[1][0] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    arguments[1][1] = new int[]{789, 456, 123};
    arguments[1][2] = new int[]{123, 456, 789};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] mapping = (int[]) arguments[i][0];
      int[] nums = (int[]) arguments[i][1];
      int[] expected = (int[]) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(mapping);
      ArrayUtils.print(nums);
      System.out.print("output: ");
      int[] output = solution.sortJumbled(mapping, nums);
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}