import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][4];
    arguments[0][0] = 3;
    arguments[0][1] = 5;
    arguments[0][2] = new int[]{3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0};
    arguments[0][3] = new int[][]{{3, 0, 2, 6, 8}, {5, 0, -1, -1, 1}, {5, 2, 4, 9, 7}};

    arguments[1][0] = 1;
    arguments[1][1] = 4;
    arguments[1][2] = new int[]{0, 1, 2};
    arguments[1][3] = new int[][]{{0, 1, 2, -1}};

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int m = (int) arguments[i][0];
      int n = (int) arguments[i][1];
      int[] head = (int[]) arguments[i][2];
      int[][] expected = (int[][]) arguments[i][3];
      System.out.println("input: ");
      System.out.println(m);
      System.out.println(n);
      printArray(head);
      System.out.print("output: ");
      int[][] output = solution.spiralMatrix(m, n, convertToListNode(head));
      print2DArray(output);
      System.out.print("expected: ");
      print2DArray(expected);
      System.out.println("match: " + match(output, expected));
      System.out.println();
    }
  }

  private static void printArray(int[] arr) {
    System.out.println(
        "[" + Arrays.stream(arr).mapToObj(String::valueOf)
            .collect(Collectors.joining(", ")) + "]"
    );
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

  private static ListNode convertToListNode(int[] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }

    ListNode result = new ListNode();
    ListNode node = result;
    for (int num : arr) {
      node.next = new ListNode(num);
      node = node.next;
    }

    return result.next;
  }

  private static boolean match(int[][] arr1, int[][] arr2) {
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
}