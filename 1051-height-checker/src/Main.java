import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[3][3];
        arguments[0][0] = new int[]{1, 1, 4, 2, 1, 3};
        arguments[0][1] = 3;

        arguments[1][0] = new int[]{5, 1, 2, 3, 4};
        arguments[1][1] = 5;

        arguments[2][0] = new int[]{1, 2, 3, 4, 5};
        arguments[2][1] = 0;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] heights = (int[]) arguments[i][0];
            int expected = (int) arguments[i][1];
            System.out.print("input: ");
            printArray(heights);
            System.out.print("output: ");
            int output = solution.heightChecker(heights);
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