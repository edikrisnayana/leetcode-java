import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][3];
        arguments[0][0] = new int[]{1, 2, 2, 1};
        arguments[0][1] = new int[]{2, 2};
        arguments[0][2] = new int[]{2, 2};

        arguments[1][0] = new int[]{4, 9, 5};
        arguments[1][1] = new int[]{9, 4, 9, 8, 4};
        arguments[1][2] = new int[]{9, 4};

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] nums1 = (int[]) arguments[i][0];
            int[] nums2 = (int[]) arguments[i][1];
            int[] expected = (int[]) arguments[i][2];
            System.out.println("input: ");
            printArray(nums1);
            printArray(nums2);
            System.out.print("output: ");
            int[] output = solution.intersect(nums1, nums2);
            printArray(output);
            System.out.print("expected: ");
            printArray(expected);
            System.out.println("match: " + isMatch(output, expected));
            System.out.println();
        }
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

    private static void printArray(int[] arr) {
        System.out.println(
                "[" + Arrays.stream(arr).mapToObj(String::valueOf)
                        .collect(Collectors.joining(", ")) + "]"
        );
    }
}