import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = convertToList(new int[][]{{1, 2, 3}, {4, 5}, {1, 2, 3}});
    arguments[0][1] = 4;

    arguments[1][0] = convertToList(new int[][]{{1}, {1}});
    arguments[1][1] = 0;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      List<List<Integer>> arrays = (List<List<Integer>>) arguments[i][0];
      int expected = (int) arguments[i][1];
      System.out.print("input: ");
      print2DList(arrays);
      System.out.print("output: ");
      int output = solution.maxDistance(arrays);
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (expected == output));
      System.out.println();
    }
  }

  private static void print2DList(List<List<Integer>> lists) {
    List<String> list = new ArrayList<>();
    for (List<Integer> items : lists) {
      list.add(
          "[" + items.stream().map(String::valueOf)
              .collect(Collectors.joining(", ")) + "]"
      );
    }
    System.out.println(
        "[" + String.join(", ", list) + "]"
    );
  }

  private static List<List<Integer>> convertToList(int[][] arr) {
    List<List<Integer>> result = new ArrayList<>();
    for (int[] ints : arr) {
      List<Integer> list = new ArrayList<>();
      for (int val : ints) {
        list.add(val);
      }
      result.add(list);
    }
    return result;
  }
}