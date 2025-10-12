//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.leetcode.common.ArrayUtils;
import com.leetcode.common.TreeNode;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new Integer[]{1, null, 2, null, 3, null, 4, null, null};
    arguments[0][1] = new Integer[]{2, 1, 3, null, null, null, 4};

    arguments[1][0] = new Integer[]{2, 1, 3};
    arguments[1][1] = new Integer[]{2, 1, 3};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      Integer[] input = (Integer[]) arguments[i][0];
      Integer[] expected = (Integer[]) arguments[i][1];
      System.out.println("input: ");
      ArrayUtils.print(input);
      System.out.print("output: ");
      Integer[] output = TreeNode.toArray(solution.balanceBST(TreeNode.fromArray(input)));
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}