import java.util.ArrayList;
import java.util.List;

import com.leetcode.common.ArrayUtils;
import com.leetcode.common.ListNode;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new int[]{18, 6, 10, 3};
    arguments[0][1] = new int[]{18, 6, 6, 2, 10, 1, 3};

    arguments[1][0] = new int[]{7};
    arguments[1][1] = new int[]{7};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] head = (int[]) arguments[i][0];
      int[] expected = (int[]) arguments[i][1];
      System.out.println("input: ");
      ArrayUtils.print(head);
      System.out.print("output: ");
      int[] output = ListNode.toArray(solution.insertGreatestCommonDivisors(ListNode.fromArray(head)));
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}