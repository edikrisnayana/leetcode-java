import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = new String[]{"d", "b", "c", "b", "c", "a"};
    arguments[0][1] = 2;
    arguments[0][2] = "a";

    arguments[1][0] = new String[]{"aaa", "aa", "a"};
    arguments[1][1] = 1;
    arguments[1][2] = "aaa";

    arguments[2][0] = new String[]{"a", "b", "a"};
    arguments[2][1] = 3;
    arguments[2][2] = "";

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String[] arr = (String[]) arguments[i][0];
      int k = (int) arguments[i][1];
      String expected = (String) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(arr);
      System.out.println(k);
      System.out.print("output: ");
      String output = solution.kthDistinct(arr, k);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output.equals(expected)));
      System.out.println();
    }
  }
}