public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = "3902";
    arguments[0][1] = true;

    arguments[1][0] = "34789";
    arguments[1][1] = false;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String s = (String) arguments[i][0];
      boolean expected = (boolean) arguments[i][1];
      System.out.print("input: ");
      System.out.println(s);
      System.out.print("output: ");
      boolean output = solution.hasSameDigits(s);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (expected == output));
      System.out.println();
    }
  }
}