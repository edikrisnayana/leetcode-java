import com.leetcode.common.ArrayUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][4];
    arguments[0][0] = new int[]{2, 4, 6, 8, 10};
    arguments[0][1] = new int[]{10, 20, 30, 40, 50};
    arguments[0][2] = new int[]{4, 5, 6, 7};
    arguments[0][3] = 100;

    arguments[1][0] = new int[]{85, 47, 57};
    arguments[1][1] = new int[]{24, 66, 99};
    arguments[1][2] = new int[]{40, 25, 25};
    arguments[1][3] = 0;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] difficulty = (int[]) arguments[i][0];
      int[] profit = (int[]) arguments[i][1];
      int[] worker = (int[]) arguments[i][2];
      int expected = (int) arguments[i][3];
      System.out.println("input: ");
      ArrayUtils.print(difficulty);
      ArrayUtils.print(profit);
      ArrayUtils.print(worker);
      System.out.print("output: ");
      int output = solution.maxProfitAssignment(difficulty, profit, worker);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}