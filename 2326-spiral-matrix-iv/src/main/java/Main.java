import com.leetcode.common.ArrayUtils;
import com.leetcode.common.ListNode;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][4];
    arguments[0][0] = 3;
    arguments[0][1] = 5;
    arguments[0][2] = new int[]{3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0};
    arguments[0][3] = new int[][]{{3, 0, 2, 6, 8}, {5, 0, -1, -1, 1}, {5, 2, 4, 9, 7}};

    arguments[1][0] = 1;
    arguments[1][1] = 4;
    arguments[1][2] = new int[]{0, 1, 2};
    arguments[1][3] = new int[][]{{0, 1, 2, -1}};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int m = (int) arguments[i][0];
      int n = (int) arguments[i][1];
      int[] head = (int[]) arguments[i][2];
      int[][] expected = (int[][]) arguments[i][3];
      System.out.println("input: ");
      System.out.println(m);
      System.out.println(n);
      ArrayUtils.print(head);
      System.out.print("output: ");
      int[][] output = solution.spiralMatrix(m, n, ListNode.fromArray(head));
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}