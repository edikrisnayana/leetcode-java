import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][3];
    arguments[0][0] = new int[]{4, 2, 8};
    arguments[0][1] = new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3};
    arguments[0][2] = true;

    arguments[1][0] = new int[]{1, 4, 2, 6};
    arguments[1][1] = new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3};
    arguments[1][2] = true;

    arguments[2][0] = new int[]{1, 4, 2, 6, 8};
    arguments[2][1] = new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3};
    arguments[2][2] = false;

    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] head = (int[]) arguments[i][0];
      Integer[] root = (Integer[]) arguments[i][1];
      boolean expected = (boolean) arguments[i][2];
      System.out.println("input: ");
      printArray(head);
      printArray(root);
      System.out.print("output: ");
      boolean output = solution.isSubPath(convertToListNode(head), convertToTreeNode(root));
      System.out.println(output);
      System.out.print("expected: ");
      System.out.println(expected);
      System.out.println("match: " + (output == expected));
      System.out.println();
    }
  }

  private static void printArray(int[] arr) {
    System.out.println(
        "[" + Arrays.stream(arr).mapToObj(String::valueOf)
            .collect(Collectors.joining(", ")) + "]"
    );
  }

  private static void printArray(Integer[] arr) {
    System.out.println(
        "[" + Arrays.stream(arr).map(String::valueOf)
            .collect(Collectors.joining(", ")) + "]"
    );
  }

  private static TreeNode convertToTreeNode(Integer[] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    TreeNode root = new TreeNode(arr[0]);
    queue.add(root);
    int i = 1;
    while (i < arr.length && !queue.isEmpty()) {
      TreeNode parent = queue.poll();
      if (arr[i] != null) {
        parent.left = new TreeNode(arr[i]);
        queue.add(parent.left);
      }
      i++;

      if (arr[i] != null) {
        parent.right = new TreeNode(arr[i]);
        queue.add(parent.right);
      }
      i++;
    }
    return root;
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
}