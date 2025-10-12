import com.leetcode.common.ArrayUtils;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = "ab";
    arguments[0][1] = new String[]{"ad", "bd", "aaab", "baa", "badab"};
    arguments[0][2] = 2;

    arguments[1][0] = "abc";
    arguments[1][1] = new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"};
    arguments[1][2] = 7;

    arguments[2][0] = "cad";
    arguments[2][1] = new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
    arguments[2][2] = 4;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String allowed = (String) arguments[i][0];
      String[] words = (String[]) arguments[i][1];
      int expected = (int) arguments[i][2];
      System.out.println("input: ");
      System.out.println(allowed);
      ArrayUtils.print(words);
      System.out.print("output: ");
      int output = solution.countConsistentStrings(allowed, words);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}