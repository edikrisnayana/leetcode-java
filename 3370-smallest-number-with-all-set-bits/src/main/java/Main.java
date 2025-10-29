public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][2];
    arguments[0][0] = 5;
    arguments[0][1] = 7;

    arguments[1][0] = 10;
    arguments[1][1] = 15;

    arguments[2][0] = 3;
    arguments[2][1] = 3;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int n = (int) arguments[i][0];
      int expected = (int) arguments[i][1];
      System.out.print("input: ");
      System.out.println(n);
      System.out.print("output: ");
      int output = solution.smallestNumber(n);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (expected == output));
      System.out.println();
    }
  }
}