import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[2][2];
    arguments[0][0] = new int[]{18, 6, 10, 3};
    arguments[0][1] = new int[]{18, 6, 6, 2, 10, 1, 3};
    
    arguments[1][0] = new int[]{7};
    arguments[1][1] = new int[]{7};
    
    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] head = (int[]) arguments[i][0];
      int[] expected = (int[]) arguments[i][1];
      System.out.println("input: ");
      printArray(head);
      System.out.print("output: ");
      int[] output = convertFromListNode(solution.insertGreatestCommonDivisors(convertToListNode(head)));
      printArray(output);
      System.out.print("expected: ");
      printArray(expected);
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
  
  private static int[] convertFromListNode(ListNode head) {
    if (head == null) {
      return new int[0];
    }
    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }
    
    int[] arr = new int[list.size()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = list.get(i);
    }
    return arr;
  }
}