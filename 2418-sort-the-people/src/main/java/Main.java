import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = new String[]{"Mary", "John", "Emma"};
    arguments[0][1] = new int[]{180, 165, 170};
    arguments[0][2] = new String[]{"Mary", "Emma", "John"};

    arguments[1][0] = new String[]{"Alice", "Bob", "Bob"};
    arguments[1][1] = new int[]{155, 185, 150};
    arguments[1][2] = new String[]{"Bob", "Alice", "Bob"};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String[] names = (String[]) arguments[i][0];
      int[] heights = (int[]) arguments[i][1];
      String[] expected = (String[]) arguments[i][2];
      System.out.println("input: ");
      ArrayUtils.print(names);
      ArrayUtils.print(heights);
      System.out.print("output: ");
      String[] output = solution.sortPeople(names, heights);
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}