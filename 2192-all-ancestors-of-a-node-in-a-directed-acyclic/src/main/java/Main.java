import com.leetcode.common.ArrayUtils;
import com.leetcode.common.ListUtils;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = 8;
    arguments[0][1] = new int[][]{{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}};
    arguments[0][2] = ListUtils.fromArray2D(new int[][]{{}, {}, {}, {0, 1}, {0, 2}, {0, 1, 3}, {0, 1, 2, 3, 4}, {0, 1, 2, 3}});

    arguments[1][0] = 5;
    arguments[1][1] = new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};
    arguments[1][2] = ListUtils.fromArray2D(new int[][]{{}, {0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}});

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int n = (int) arguments[i][0];
      int[][] edgeList = (int[][]) arguments[i][1];
      List<List<Integer>> expected = (List<List<Integer>>) arguments[i][2];
      System.out.println("input: ");
      System.out.println(n);
      ArrayUtils.print(edgeList);
      System.out.print("output: ");
      List<List<Integer>> output = solution.getAncestors(n, edgeList);
      ListUtils.print2D(output);
      System.out.print("expected: ");
      ListUtils.print2D(expected);
      System.out.println("match: " + ListUtils.match2D(output, expected));
      System.out.println();
    }
  }
}