public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = "iiii";
    arguments[0][1] = 1;
    arguments[0][2] = 36;

    arguments[1][0] = "leetcode";
    arguments[1][1] = 2;
    arguments[1][2] = 6;

    arguments[2][0] = "zbax";
    arguments[2][1] = 2;
    arguments[2][2] = 8;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String s = (String) arguments[i][0];
      int k = (int) arguments[i][1];
      int expected = (int) arguments[i][2];
      System.out.println("input: ");
      System.out.println(s);
      System.out.println(k);
      System.out.print("output: ");
      int output = solution.getLucky(s, k);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}