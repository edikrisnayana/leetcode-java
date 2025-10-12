import com.leetcode.common.ArrayUtils;
import com.leetcode.common.PolyNode;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = new int[][]{{1, 1}};
    arguments[0][1] = new int[][]{{1, 0}};
    arguments[0][2] = new int[][]{{1, 1}, {1, 0}};

    arguments[1][0] = new int[][]{{2, 2}, {4, 1}, {3, 0}};
    arguments[1][1] = new int[][]{{3, 2}, {-4, 1}, {-1, 0}};
    arguments[1][2] = new int[][]{{5, 2}, {2, 0}};

    arguments[2][0] = new int[][]{{1, 2}};
    arguments[2][1] = new int[][]{{-1, 2}};
    arguments[2][2] = new int[][]{};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[][] poly1 = (int[][]) arguments[i][0];
      int[][] poly2 = (int[][]) arguments[i][1];
      int[][] expected = (int[][]) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(poly1);
      ArrayUtils.print(poly2);
      System.out.print("output: ");
      int[][] output = PolyNode.toArray(solution.addPoly(PolyNode.fromArray(poly1), PolyNode.fromArray(poly2)));
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}