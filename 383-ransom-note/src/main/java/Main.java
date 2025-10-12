//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = "a";
    arguments[0][1] = "b";
    arguments[0][2] = false;

    arguments[1][0] = "aa";
    arguments[1][1] = "ab";
    arguments[1][2] = false;

    arguments[2][0] = "aa";
    arguments[2][1] = "aab";
    arguments[2][2] = true;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String ransomNote = (String) arguments[i][0];
      String magazine = (String) arguments[i][1];
      boolean expected = (boolean) arguments[i][2];
      System.out.println("input: ");
      System.out.println(ransomNote);
      System.out.println(magazine);
      System.out.print("output: ");
      boolean output = solution.canConstruct(ransomNote, magazine);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (expected == output));
      System.out.println();
    }
  }
}