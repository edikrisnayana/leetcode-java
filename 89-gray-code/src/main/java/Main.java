import com.leetcode.common.ListUtils;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = 2;
    arguments[0][1] = ListUtils.fromArray(new Integer[]{0, 1, 3, 2});

    arguments[1][0] = 1;
    arguments[1][1] = ListUtils.fromArray(new Integer[]{0, 1});

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int n = (int) arguments[i][0];
      List<Integer> expected = (List<Integer>) arguments[i][1];
      System.out.print("input: ");
      System.out.println(n);
      List<Integer> output = solution.grayCode(n);
      System.out.print("output: ");
      ((Solution) output).print();
      System.out.print("expected: ");
      ListUtils.print(expected);
      System.out.println("match: " + ListUtils.match(expected, output));
      System.out.println();
    }
  }
}