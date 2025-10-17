import com.leetcode.common.ArrayUtils;
import com.leetcode.common.ListUtils;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = "abcd";
    arguments[0][1] = "abcde";
    arguments[0][2] = 'e';

    arguments[1][0] = "";
    arguments[1][1] = "y";
    arguments[1][2] = 'y';

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String s = (String) arguments[i][0];
      String t = (String) arguments[i][1];
      char expected = (char) arguments[i][2];
      System.out.print("input: ");
      System.out.print("s=\"" + s + "\"");
      System.out.print(" ");
      System.out.println("t=\"" + t + "\"");
      System.out.print("output: ");
      char output = solution.findTheDifference(s, t);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (expected == output));
      System.out.println();
    }
  }
}