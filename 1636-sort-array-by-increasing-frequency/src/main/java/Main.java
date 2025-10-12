import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][2];
    arguments[0][0] = new int[]{1, 1, 2, 2, 2, 3};
    arguments[0][1] = new int[]{3, 1, 1, 2, 2, 2};

    arguments[1][0] = new int[]{2, 3, 1, 3, 2};
    arguments[1][1] = new int[]{1, 3, 3, 2, 2};

    arguments[2][0] = new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1};
    arguments[2][1] = new int[]{5, -1, 4, 4, -6, -6, 1, 1, 1};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] nums = (int[]) arguments[i][0];
      int[] expected = (int[]) arguments[i][1];
      System.out.print("input: ");
      ArrayUtils.print(nums);
      System.out.print("output: ");
      int[] output = solution.frequencySort(nums);
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}