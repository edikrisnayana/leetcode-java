import com.leetcode.common.ListUtils;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = 1;
    arguments[0][1] = ListUtils.fromArray(new String[]{"0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"});

    arguments[1][0] = 9;
    arguments[1][1] = ListUtils.fromArray(new String[]{});

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int turnedOn = (int) arguments[i][0];
      List<String> expected = (List<String>) arguments[i][1];
      System.out.print("input: ");
      System.out.println(turnedOn);
      System.out.print("output: ");
      List<String> output = solution.readBinaryWatch(turnedOn);
      ListUtils.print(output);
      System.out.print("expected: ");
      ListUtils.print(expected);
      System.out.println("match: " + ListUtils.match(expected, output));
      System.out.println();
    }
  }
}