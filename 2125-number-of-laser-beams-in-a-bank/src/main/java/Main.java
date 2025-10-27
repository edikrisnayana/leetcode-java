import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new String[]{"011001", "000000", "010100", "001000"};
    arguments[0][1] = 8;

    arguments[1][0] = new String[]{"000", "111", "000"};
    arguments[1][1] = 0;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String[] bank = (String[]) arguments[i][0];
      int expected = (int) arguments[i][1];
      System.out.println("input: ");
      ArrayUtils.print(bank);
      System.out.print("output: ");
      int output = solution.numberOfBeams(bank);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (expected == output));
      System.out.println();
    }
  }
}