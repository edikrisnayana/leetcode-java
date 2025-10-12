//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = new int[]{3, 1, 5};
    arguments[0][1] = new int[]{2, 7, 4};
    arguments[0][2] = 4;

    arguments[1][0] = new int[]{4, 1, 5, 9};
    arguments[1][1] = new int[]{1, 3, 2, 6};
    arguments[1][2] = 7;

    arguments[2][0] = new int[]{2, 2, 6, 6};
    arguments[2][1] = new int[]{1, 3, 2, 6};
    arguments[2][2] = 4;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] seats = (int[]) arguments[i][0];
      int[] students = (int[]) arguments[i][1];
      int expected = (int) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(seats);
      ArrayUtils.print(students);
      System.out.print("output: ");
      int output = solution.minMovesToSeat(seats, students);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}