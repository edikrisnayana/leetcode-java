import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][2];
        arguments[0][0] = new int[]{0, 3, 1, 0, 4, 5, 2, 0};
        arguments[0][1] = new int[]{4, 11};

        arguments[1][0] = new int[]{0, 1, 0, 3, 0, 2, 2, 0};
        arguments[1][1] = new int[]{1, 3, 4};

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] input = (int[]) arguments[i][0];
            int[] expected = (int[]) arguments[i][1];
            System.out.println("input: ");
            printArray(input);
            System.out.print("output: ");
            int[] output = convertFromListNode(solution.mergeNodes(convertToListNode(input)));
            printArray(output);
            System.out.print("expected: ");
            printArray(expected);
            System.out.println("match: " + isMatch(output, expected));
            System.out.println();
        }
    }

    private static void printArray(int[] arr) {
        System.out.println(
                "[" + Arrays.stream(arr).mapToObj(String::valueOf)
                        .collect(Collectors.joining(", ")) + "]"
        );
    }

    private static boolean isMatch(int[] arr1, int[] arr2) {
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