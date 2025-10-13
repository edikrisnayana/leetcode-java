import com.leetcode.common.ArrayUtils;
import com.leetcode.common.ListUtils;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new String[]{"abba", "baba", "bbaa", "cd", "cd"};
    arguments[0][1] = ListUtils.fromArray(new String[]{"abba", "cd"});

    arguments[1][0] = new String[]{"a", "b", "c", "d", "e"};
    arguments[1][1] = new String[]{"a", "b", "c", "d", "e"};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String[] words = (String[]) arguments[i][0];
      List<String> expected = (List<String>) arguments[i][1];
      System.out.print("input: ");
      ArrayUtils.print(words);
      System.out.print("output: ");
      List<String> output = solution.removeAnagrams(words);
      ListUtils.print(output);
      System.out.print("expected: ");
      ListUtils.print(expected);
      System.out.println("match: " + ListUtils.match(expected, output));
      System.out.println();
    }
  }
}