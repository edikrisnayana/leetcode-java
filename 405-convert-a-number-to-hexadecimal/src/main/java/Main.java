public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = 26;
    arguments[0][1] = "1a";

    arguments[1][0] = -1;
    arguments[1][1] = "ffffffff";

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int num = (int) arguments[i][0];
      String expected = (String) arguments[i][1];
      System.out.print("input: ");
      System.out.println(num);
      System.out.print("output: ");
      String output = solution.toHex(num);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (expected.equals(output)));
      System.out.println();
    }
  }
}