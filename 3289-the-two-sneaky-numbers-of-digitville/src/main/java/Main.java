import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][2];
    arguments[0][0] = new int[]{0, 1, 1, 0};
    arguments[0][1] = new int[]{0, 1};

    arguments[1][0] = new int[]{0, 3, 2, 1, 3, 2};
    arguments[1][1] = new int[]{2, 3};

    arguments[2][0] = new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};
    arguments[2][1] = new int[]{4, 5};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] nums = (int[]) arguments[i][0];
      int[] expected = (int[]) arguments[i][1];
      System.out.println("input: ");
      ArrayUtils.print(nums);
      System.out.print("output: ");
      int[] output = solution.getSneakyNumbers(nums);
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}