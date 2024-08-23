public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][2];
    arguments[0][0] = "-1/2+1/2";
    arguments[0][1] = "0/1";

    arguments[1][0] = "-1/2+1/2+1/3";
    arguments[1][1] = "1/3";

    arguments[2][0] = "1/3-1/2";
    arguments[2][1] = "-1/6";

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String expression = (String) arguments[i][0];
      String expected = (String) arguments[i][1];
      System.out.print("input: ");
      System.out.println(expression);
      System.out.print("output: ");
      String output = solution.fractionAddition(expression);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output.equals(expected)));
      System.out.println();
    }
  }
}