//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][2];
    arguments[0][0] = 4;
    arguments[0][1] = 10;

    arguments[1][0] = 10;
    arguments[1][1] = 37;

    arguments[2][0] = 20;
    arguments[2][1] = 96;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int n = (int) arguments[i][0];
      int expected = (int) arguments[i][1];
      System.out.print("input: ");
      System.out.println(n);
      System.out.print("output: ");
      int output = solution.totalMoney(n);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}