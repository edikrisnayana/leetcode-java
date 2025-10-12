import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][5];
    arguments[0][0] = new int[]{1, 2, 3, 4};
    arguments[0][1] = 4;
    arguments[0][2] = 1;
    arguments[0][3] = 5;
    arguments[0][4] = 13;

    arguments[1][0] = new int[]{1, 2, 3, 4};
    arguments[1][1] = 4;
    arguments[1][2] = 3;
    arguments[1][3] = 4;
    arguments[1][4] = 6;

    arguments[2][0] = new int[]{1, 2, 3, 4};
    arguments[2][1] = 4;
    arguments[2][2] = 1;
    arguments[2][3] = 10;
    arguments[2][4] = 50;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] nums = (int[]) arguments[i][0];
      int n = (int) arguments[i][1];
      int left = (int) arguments[i][2];
      int right = (int) arguments[i][3];
      int expected = (int) arguments[i][4];
      System.out.println("input: ");
      ArrayUtils.print(nums);
      System.out.println(n);
      System.out.println(left);
      System.out.println(right);
      System.out.print("output: ");
      int output = solution.rangeSum(nums, n, left, right);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}