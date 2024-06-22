import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[3][3];
        arguments[0][0] = new int[]{1, 1, 2, 1, 1};
        arguments[0][1] = 3;
        arguments[0][2] = 2;

        arguments[1][0] = new int[]{2, 4, 6};
        arguments[1][1] = 1;
        arguments[1][2] = 0;

        arguments[2][0] = new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        arguments[2][1] = 2;
        arguments[2][2] = 16;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] nums = (int[]) arguments[i][0];
            int k = (int) arguments[i][1];
            int expected = (int) arguments[i][2];
            System.out.println("input: ");
            printArray(nums);
            System.out.println(k);
            System.out.print("output: ");
            int output = solution.numberOfSubarrays(nums, k);
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