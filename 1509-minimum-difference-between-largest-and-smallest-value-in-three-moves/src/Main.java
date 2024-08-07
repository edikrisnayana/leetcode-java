import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[3][2];
        arguments[0][0] = new int[]{5, 3, 2, 4};
        arguments[0][1] = 0;

        arguments[1][0] = new int[]{1, 5, 0, 10, 14};
        arguments[1][1] = 1;

        arguments[2][0] = new int[]{3, 100, 20};
        arguments[2][1] = 0;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] nums = (int[]) arguments[i][0];
            int expected = (int) arguments[i][1];
            System.out.println("input: ");
            printArray(nums);
            System.out.print("output: ");
            int output = solution.minDifference(nums);
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