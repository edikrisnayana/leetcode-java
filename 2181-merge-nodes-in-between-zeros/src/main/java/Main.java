//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import com.leetcode.common.ArrayUtils;
import com.leetcode.common.ListNode;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new int[]{0, 3, 1, 0, 4, 5, 2, 0};
    arguments[0][1] = new int[]{4, 11};

    arguments[1][0] = new int[]{0, 1, 0, 3, 0, 2, 2, 0};
    arguments[1][1] = new int[]{1, 3, 4};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] input = (int[]) arguments[i][0];
      int[] expected = (int[]) arguments[i][1];
      System.out.println("input: ");
      ArrayUtils.print(input);
      System.out.print("output: ");
      int[] output = ListNode.toArray(solution.mergeNodes(ListNode.fromArray(input)));
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}