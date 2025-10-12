public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = 3;
    arguments[0][1] = 3;

    arguments[1][0] = 1;
    arguments[1][1] = 0;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int n = (int) arguments[i][0];
      int expected = (int) arguments[i][1];
      System.out.print("input: ");
      System.out.println(n);
      System.out.print("output: ");
      int output = solution.minSteps(n);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}