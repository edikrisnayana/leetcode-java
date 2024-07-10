import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[3][2];
        arguments[0][0] = new String[]{"d1/", "d2/", "../", "d21/", "./"};
        arguments[0][1] = 2;

        arguments[1][0] = new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"};
        arguments[1][1] = 3;

        arguments[2][0] = new String[]{"d1/", "../", "../", "../"};
        arguments[2][1] = 0;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            String[] logs = (String[]) arguments[i][0];
            int expected = (int) arguments[i][1];
            System.out.println("input: ");
            printArray(logs);
            System.out.print("output: ");
            int output = solution.minOperations(logs);
            System.out.println(output);
            System.out.print("expected: ");
            System.out.println(expected);
            System.out.println("match: " + (output == expected));
            System.out.println();
        }
    }

    private static void printArray(String[] arr) {
        System.out.println(
                "[" + String.join(", ", arr) + "]"
        );
    }
}