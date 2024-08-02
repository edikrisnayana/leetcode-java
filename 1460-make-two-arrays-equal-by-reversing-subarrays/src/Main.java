import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[3][3];
        arguments[0][0] = new int[]{1, 2, 3, 4};
        arguments[0][1] = new int[]{2, 4, 1, 3};
        arguments[0][2] = true;

        arguments[1][0] = new int[]{7};
        arguments[1][1] = new int[]{7};
        arguments[1][2] = true;

        arguments[2][0] = new int[]{3, 7, 9};
        arguments[2][1] = new int[]{3, 7, 11};
        arguments[2][2] = false;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] target = (int[]) arguments[i][0];
            int[] arr = (int[]) arguments[i][1];
            boolean expected = (boolean) arguments[i][2];
            System.out.println("input: ");
            printArray(target);
            printArray(arr);
            System.out.print("output: ");
            boolean output = solution.canBeEqual(target, arr);
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