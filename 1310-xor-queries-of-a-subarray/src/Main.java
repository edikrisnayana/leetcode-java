import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = new int[]{1, 3, 4, 8};
    arguments[0][1] = new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}};
    arguments[0][2] = new int[]{2, 7, 14, 8};

    arguments[1][0] = new int[]{4, 8, 2, 10};
    arguments[1][1] = new int[][]{{2, 3}, {1, 3}, {0, 0}, {0, 3}};
    arguments[1][2] = new int[]{8, 0, 4, 4};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] arr = (int[]) arguments[i][0];
      int[][] queries = (int[][]) arguments[i][1];
      int[] expected = (int[]) arguments[i][2];
      System.out.println("input: ");
      printArray(arr);
      print2DArray(queries);
      System.out.print("output: ");
      int[] output = solution.xorQueries(arr, queries);
      printArray(output);
      System.out.print("expected: ");
      printArray(expected);
      System.out.println("match: " + match(output, expected));
      System.out.println();
    }
  }

  private static boolean match(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
      return false;
    }

    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] != arr2[i]) {
        return false;
      }
    }

    return true;
  }

  private static void print2DArray(int[][] arr) {
    List<String> list = new ArrayList<>();
    for (int[] items : arr) {
      list.add(
          "[" + Arrays.stream(items).mapToObj(String::valueOf)
              .collect(Collectors.joining(", ")) + "]"
      );
    }
    System.out.println(
        "[" + String.join(", ", list) + "]"
    );
  }

  private static void printArray(int[] arr) {
    System.out.println(
        "[" + Arrays.stream(arr).mapToObj(String::valueOf)
            .collect(Collectors.joining(", ")) + "]"
    );
  }
}