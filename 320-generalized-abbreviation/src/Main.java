import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = "word";
    arguments[0][1] = convertToList(new String[]{"4", "3d", "2r1", "2rd", "1o2", "1o1d", "1or1", "1ord", "w3", "w2d", "w1r1", "w1rd", "wo2", "wo1d", "wor1", "word"});
    
    arguments[1][0] = "a";
    arguments[1][1] = convertToList(new String[]{"1", "a"});
    
    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      String word = (String) arguments[i][0];
      List<String> expected = (List<String>) arguments[i][1];
      System.out.print("input: ");
      System.out.println(word);
      System.out.print("output: ");
      List<String> output = solution.generateAbbreviations(word);
      Collections.sort(output);
      printList(output);
      System.out.print("expected: ");
      Collections.sort(expected);
      printList(expected);
      System.out.println("match: " + (output.equals(expected)));
      System.out.println();
    }
  }
  
  private static void printList(List<String> list) {
    System.out.println(
        "[" + String.join(", ", list) + "]"
    );
  }
  
  private static List<String> convertToList(String[] arr) {
    List<String> result = new ArrayList<>();
    Collections.addAll(result, arr);
    return result;
  }
}