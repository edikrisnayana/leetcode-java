import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][2];
    arguments[0][0] = new int[]{1, 1, 0};
    arguments[0][1] = true;

    arguments[1][0] = new int[]{1, 1};
    arguments[1][1] = true;

    arguments[2][0] = new int[]{1, 0};
    arguments[2][1] = false;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] derived = (int[]) arguments[i][0];
      boolean expected = (boolean) arguments[i][1];
      System.out.print("input: ");
      ArrayUtils.print(derived);
      System.out.print("output: ");
      boolean output = solution.doesValidArrayExist(derived);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}