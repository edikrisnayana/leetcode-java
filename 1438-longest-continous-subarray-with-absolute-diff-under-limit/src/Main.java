import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[3][3];
        arguments[0][0] = new int[]{8, 2, 4, 7};
        arguments[0][1] = 4;
        arguments[0][2] = 2;

        arguments[1][0] = new int[]{10, 1, 2, 4, 7, 2};
        arguments[1][1] = 5;
        arguments[1][2] = 4;

        arguments[2][0] = new int[]{4, 2, 2, 2, 4, 4, 2, 2};
        arguments[2][1] = 0;
        arguments[2][2] = 3;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] nums = (int[]) arguments[i][0];
            int limit = (int) arguments[i][1];
            int expected = (int) arguments[i][2];
            System.out.println("input: ");
            printArray(nums);
            System.out.println(limit);
            System.out.print("output: ");
            int output = solution.longestSubarray(nums, limit);
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
}