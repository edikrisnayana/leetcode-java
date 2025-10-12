import com.leetcode.common.ListUtils;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = ListUtils.fromArray2D(new int[][]{{1, 2, 3}, {4, 5}, {1, 2, 3}});
    arguments[0][1] = 4;

    arguments[1][0] = ListUtils.fromArray2D(new int[][]{{1}, {1}});
    arguments[1][1] = 0;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      List<List<Integer>> arrays = (List<List<Integer>>) arguments[i][0];
      int expected = (int) arguments[i][1];
      System.out.print("input: ");
      ListUtils.print2D(arrays);
      System.out.print("output: ");
      int output = solution.maxDistance(arrays);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (expected == output));
      System.out.println();
    }
  }
}