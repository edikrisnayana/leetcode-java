import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][2];
        arguments[0][0] = new int[][]{{1, 2}, {2, 3}, {4, 2}};
        arguments[0][1] = 2;

        arguments[1][0] = new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        arguments[1][1] = 1;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[][] edges = (int[][]) arguments[i][0];
            int expected = (int) arguments[i][1];
            System.out.println("input: ");
            print2DArray(edges);
            System.out.print("output: ");
            int output = solution.findCenter(edges);
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