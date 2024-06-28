import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][3];
        arguments[0][0] = 5;
        arguments[0][1] = new int[][]{{0, 1}, {1, 2}, {2, 3}, {0, 2}, {1, 3}, {2, 4}};
        arguments[0][2] = 43L;

        arguments[1][0] = 5;
        arguments[1][1] = new int[][]{{0, 3}, {2, 4}, {1, 3}};
        arguments[1][2] = 20L;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int n = (int) arguments[i][0];
            int[][] roads = (int[][]) arguments[i][1];
            long expected = (long) arguments[i][2];
            System.out.println("input: ");
            System.out.println(n);
            print2DArray(roads);
            System.out.print("output: ");
            long output = solution.maximumImportance(n, roads);
            System.out.println(output);
            System.out.print("expected: ");
            System.out.println(expected);
            System.out.println("match: " + (output == expected));
            System.out.println();
        }
    }

    private static void print2DArray(int[][] arr) {
        List<String> list = new ArrayList<>();
        for (int[] items : arr) {
            list.add(
                    "[" + Arrays.stream(items).mapToObj(String::valueOf)
                            .collect(Collectors.joining(", ")) + "]"
            );
        }
        System.out.println(
                "[" + String.join(", ", list) + "]"
        );
    }
}