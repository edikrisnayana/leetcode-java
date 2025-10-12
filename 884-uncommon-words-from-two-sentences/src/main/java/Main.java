import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = "this apple is sweet";
    arguments[0][1] = "this apple is sour";
    arguments[0][2] = new String[]{"sweet", "sour"};

    arguments[1][0] = "apple apple";
    arguments[1][1] = "banana";
    arguments[1][2] = new String[]{"banana"};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String s1 = (String) arguments[i][0];
      String s2 = (String) arguments[i][1];
      String[] expected = (String[]) arguments[i][2];
      System.out.println("input: ");
      System.out.println(s1);
      System.out.println(s2);
      System.out.print("output: ");
      String[] output = solution.uncommonFromSentences(s1, s2);
      ArrayUtils.print(output);
      System.out.print("expected: ");
      ArrayUtils.print(expected);
      System.out.println("match: " + ArrayUtils.match(output, expected));
      System.out.println();
    }
  }
}