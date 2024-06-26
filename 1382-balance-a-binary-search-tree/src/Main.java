import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][2];
        arguments[0][0] = new Integer[]{1, null, 2, null, 3, null, 4, null, null};
        arguments[0][1] = new Integer[]{2, 1, 3, null, null, null, 4};

        arguments[1][0] = new Integer[]{2, 1, 3};
        arguments[1][1] = new Integer[]{2, 1, 3};

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            Integer[] input = (Integer[]) arguments[i][0];
            Integer[] expected = (Integer[]) arguments[i][1];
            System.out.println("input: ");
            printArray(input);
            System.out.print("output: ");
            Integer[] output = convertFromTreeNode(solution.balanceBST(convertToTreeNode(input)));
            printArray(output);
            System.out.print("expected: ");
            printArray(expected);
            System.out.println("match: " + isMatch(output, expected));
            System.out.println();
        }
    }

    private static void printArray(Integer[] arr) {
        System.out.println(
                "[" + Arrays.stream(arr).map(String::valueOf)
                        .collect(Collectors.joining(", ")) + "]"
        );
    }

    private static boolean isMatch(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!Objects.equals(arr1[i], arr2[i])) {
                return false;
            }
        }

        return true;
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

    private static Integer[] convertFromTreeNode(TreeNode root) {
        if (root == null) {
            return new Integer[0];
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node == null) {
                    list.add(null);
                } else {
                    list.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
                size--;
            }
        }

        Integer[] arr = list.toArray(Integer[]::new);
        int end = arr.length;
        while (end > 0 && arr[end - 1] == null) {
            end--;
        }
        return Arrays.copyOf(arr, end);
    }
}