public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = 10;
    arguments[0][1] = 7;
    arguments[0][2] = 3;

    arguments[1][0] = 3;
    arguments[1][1] = 4;
    arguments[1][2] = 3;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int start = (int) arguments[i][0];
      int goal = (int) arguments[i][1];
      int expected = (int) arguments[i][2];
      System.out.println("input: ");
      System.out.println(start);
      System.out.println(goal);
      System.out.print("output: ");
      int output = solution.minBitFlips(start, goal);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}