import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][4];
        arguments[0][0] = new int[]{1,0,1,2,1,1,7,5};
        arguments[0][1] = new int[]{0,1,0,1,0,1,0,1};
        arguments[0][2] = 3;
        arguments[0][3] = 16;

        arguments[1][0] = new int[]{1};
        arguments[1][1] = new int[]{0};
        arguments[1][2] = 1;
        arguments[1][3] = 1;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] customers = (int[]) arguments[i][0];
            int[] grumpy = (int[]) arguments[i][1];
            int minutes = (int) arguments[i][2];
            int expected = (int) arguments[i][3];
            System.out.println("input: ");
            printArray(customers);
            printArray(grumpy);
            System.out.println(minutes);
            System.out.print("output: ");
            int output = solution.maxSatisfied(customers, grumpy, minutes);
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