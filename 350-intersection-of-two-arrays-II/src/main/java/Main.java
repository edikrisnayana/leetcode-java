import com.leetcode.common.ArrayUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = new int[]{1, 2, 2, 1};
    arguments[0][1] = new int[]{2, 2};
    arguments[0][2] = new int[]{2, 2};

    arguments[1][0] = new int[]{4, 9, 5};
    arguments[1][1] = new int[]{9, 4, 9, 8, 4};
    arguments[1][2] = new int[]{9, 4};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] nums1 = (int[]) arguments[i][0];
      int[] nums2 = (int[]) arguments[i][1];
      int[] expected = (int[]) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(nums1);
      ArrayUtils.print(nums2);
      System.out.print("output: ");
      int[] output = solution.intersect(nums1, nums2);
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}