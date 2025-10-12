public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][2];
    arguments[0][0] = "abcde";
    arguments[0][1] = 5;

    arguments[1][0] = "xyzxyzxyzxyz";
    arguments[1][1] = 12;

    arguments[2][0] = "aabbccddeeffgghhiiiiii";
    arguments[2][1] = 24;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String word = (String) arguments[i][0];
      int expected = (int) arguments[i][1];
      System.out.print("input: ");
      System.out.println(word);
      System.out.print("output: ");
      int output = solution.minimumPushes(word);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }
}