import com.leetcode.common.ArrayUtils;
import com.leetcode.common.TreeNode;
import com.leetcode.common.ListNode;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = new int[]{4, 2, 8};
    arguments[0][1] = new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3};
    arguments[0][2] = true;

    arguments[1][0] = new int[]{1, 4, 2, 6};
    arguments[1][1] = new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3};
    arguments[1][2] = true;

    arguments[2][0] = new int[]{1, 4, 2, 6, 8};
    arguments[2][1] = new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3};
    arguments[2][2] = false;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] head = (int[]) arguments[i][0];
      Integer[] root = (Integer[]) arguments[i][1];
      boolean expected = (boolean) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(head);
      ArrayUtils.print(root);
      System.out.print("output: ");
      boolean output = solution.isSubPath(ListNode.fromArray(head), TreeNode.fromArray(root));
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}