import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][2];
        arguments[0][0] = new int[]{2, 0, 2, 1, 1, 0};
        arguments[0][1] = new int[]{0, 0, 1, 1, 2, 2};

        arguments[1][0] = new int[]{2, 0, 1};
        arguments[1][1] = new int[]{0, 1, 2};

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] nums = (int[]) arguments[i][0];
            int[] expected = (int[]) arguments[i][1];
            System.out.print("input: ");
            printArray(nums);
            System.out.print("output: ");
            solution.sortColors(nums);
            printArray(nums);
            System.out.print("expected: ");
            printArray(expected);
            System.out.println("match: " + isMatch(nums, expected));
            System.out.println();
        }
    }

    private static boolean isMatch(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
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