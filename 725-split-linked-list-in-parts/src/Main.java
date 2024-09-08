import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][3];
    arguments[0][0] = new int[]{1, 2, 3};
    arguments[0][1] = 5;
    arguments[0][2] = convertToList(new int[][]{{1}, {2}, {3}, {}, {}});

    arguments[1][0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    arguments[1][1] = 3;
    arguments[1][2] = convertToList(new int[][]{{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}});

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] head = (int[]) arguments[i][0];
      int k = (int) arguments[i][1];
      List<List<Integer>> expected = (List<List<Integer>>) arguments[i][2];
      System.out.println("input: ");
      printArray(head);
      System.out.println(k);
      System.out.print("output: ");
      List<List<Integer>> output = convertFromListNode(solution.splitListToParts(convertToListNode(head), k));
      print2DList(output);
      System.out.print("expected: ");
      print2DList(expected);
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

  private static boolean match(List<List<Integer>> lists1, List<List<Integer>> lists2) {
    if (lists1.size() != lists2.size()) {
      return false;
    }

    for (int i = 0; i < lists1.size(); i++) {
      List<Integer> list1 = lists1.get(i);
      List<Integer> list2 = lists2.get(i);
      if (list1.size() != list2.size()) {
        return false;
      }

      for (int j = 0; j < list1.size(); j++) {
        if (!Objects.equals(list1.get(j), list2.get(j))) {
          return false;
        }
      }
    }

    return true;
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

  private static List<List<Integer>> convertFromListNode(ListNode[] heads) {
    if (heads == null) {
      return new ArrayList<>();
    }

    List<List<Integer>> result = new ArrayList<>();
    for (ListNode head : heads) {
      List<Integer> list = new ArrayList<>();
      while (head != null) {
        list.add(head.val);
        head = head.next;
      }
      result.add(list);
    }
    return result;
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