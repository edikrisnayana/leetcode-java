//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    arguments[0][1] = new int[]{2, 1, 4, 3, 9, 6};
    arguments[0][2] = new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};

    arguments[1][0] = new int[]{28, 6, 22, 8, 44, 17};
    arguments[1][1] = new int[]{22, 28, 8, 6};
    arguments[1][2] = new int[]{22, 28, 8, 6, 17, 44};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] arr1 = (int[]) arguments[i][0];
      int[] arr2 = (int[]) arguments[i][1];
      int[] expected = (int[]) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(arr1);
      ArrayUtils.print(arr2);
      System.out.print("output: ");
      int[] output = solution.relativeSortArray(arr1, arr2);
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}