import java.util.ArrayList;
import java.util.List;

import com.leetcode.common.ArrayUtils;
import com.leetcode.common.ListNode;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = new int[]{1, 2, 3};
    arguments[0][1] = new int[]{1, 2, 3, 4, 5};
    arguments[0][2] = new int[]{4, 5};

    arguments[1][0] = new int[]{1};
    arguments[1][1] = new int[]{1, 2, 1, 2, 1, 2};
    arguments[1][2] = new int[]{2, 2, 2};

    arguments[2][0] = new int[]{5};
    arguments[2][1] = new int[]{1, 2, 3, 4};
    arguments[2][2] = new int[]{1, 2, 3, 4};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] nums = (int[]) arguments[i][0];
      int[] head = (int[]) arguments[i][1];
      int[] expected = (int[]) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(nums);
      ArrayUtils.print(head);
      System.out.print("output: ");
      int[] output = ListNode.toArray(solution.modifiedList(nums, ListNode.fromArray(head)));
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}