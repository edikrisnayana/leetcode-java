import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new int[]{5, 5, 5, 10, 20};
    arguments[0][1] = true;

    arguments[1][0] = new int[]{5, 5, 10, 10, 20};
    arguments[1][1] = false;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] bills = (int[]) arguments[i][0];
      boolean expected = (boolean) arguments[i][1];
      System.out.print("input: ");
      ArrayUtils.print(bills);
      System.out.print("output: ");
      boolean output = solution.lemonadeChange(bills);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }

}