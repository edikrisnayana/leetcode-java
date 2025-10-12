//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = 5;
    arguments[0][1] = true;

    arguments[1][0] = 3;
    arguments[1][1] = false;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int c = (int) arguments[i][0];
      boolean expected = (boolean) arguments[i][1];
      System.out.print("input: ");
      System.out.println(c);
      System.out.print("output: ");
      boolean output = solution.judgeSquareSum(c);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}