import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = new int[][]{{1, 1}};
    arguments[0][1] = new int[][]{{1, 0}};
    arguments[0][2] = new int[][]{{1, 1}, {1, 0}};

    arguments[1][0] = new int[][]{{2, 2}, {4, 1}, {3, 0}};
    arguments[1][1] = new int[][]{{3, 2}, {-4, 1}, {-1, 0}};
    arguments[1][2] = new int[][]{{5, 2}, {2, 0}};

    arguments[2][0] = new int[][]{{1, 2}};
    arguments[2][1] = new int[][]{{-1, 2}};
    arguments[2][2] = new int[][]{};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[][] poly1 = (int[][]) arguments[i][0];
      int[][] poly2 = (int[][]) arguments[i][1];
      int[][] expected = (int[][]) arguments[i][2];
      System.out.println("input: ");
      print2DArray(poly1);
      print2DArray(poly2);
      System.out.print("output: ");
      int[][] output = convertFromPolyNode(solution.addPoly(convertToPolyNode(poly1), convertToPolyNode(poly2)));
      print2DArray(output);
      System.out.print("expected: ");
      print2DArray(expected);
      System.out.println("match: " + isMatch(output, expected));
      System.out.println();
    }
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

  private static boolean isMatch(int[][] arr1, int[][] arr2) {
    if (arr1.length != arr2.length) {
      return false;
    }

    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i].length != arr2[i].length) {
        return false;
      }

      for (int j = 0; j < arr1[i].length; j++) {
        if (arr1[i][j] != arr2[i][j]) {
          return false;
        }
      }
    }

    return true;
  }

  private static PolyNode convertToPolyNode(int[][] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }

    PolyNode result = new PolyNode();
    PolyNode node = result;
    for (int[] num : arr) {
      node.next = new PolyNode(num[0], num[1]);
      node = node.next;
    }

    return result.next;
  }

  private static int[][] convertFromPolyNode(PolyNode head) {
    if (head == null) {
      return new int[0][0];
    }
    List<int[]> list = new ArrayList<>();
    while (head != null) {
      list.add(new int[]{head.coefficient, head.power});
      head = head.next;
    }

    int[][] arr = new int[list.size()][2];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = list.get(i);
    }
    return arr;
  }
}