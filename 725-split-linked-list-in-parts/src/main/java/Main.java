import com.leetcode.common.ArrayUtils;
import com.leetcode.common.ListNode;
import com.leetcode.common.ListUtils;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = new int[]{1, 2, 3};
    arguments[0][1] = 5;
    arguments[0][2] = ListUtils.fromArray2D(new int[][]{{1}, {2}, {3}, {}, {}});

    arguments[1][0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    arguments[1][1] = 3;
    arguments[1][2] = ListUtils.fromArray2D(new int[][]{{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}});

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] head = (int[]) arguments[i][0];
      int k = (int) arguments[i][1];
      List<List<Integer>> expected = (List<List<Integer>>) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(head);
      System.out.println(k);
      System.out.print("output: ");
      List<List<Integer>> output = ListNode.toList(solution.splitListToParts(ListNode.fromArray(head), k));
      ListUtils.print2D(output);
      System.out.print("expected: ");
      ListUtils.print2D(expected);
      System.out.println("match: " + ListUtils.match(output, expected));
      System.out.println();
    }
  }
}