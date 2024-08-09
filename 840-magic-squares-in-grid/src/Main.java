import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][3];
        arguments[0][0] = new int[][]{{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}};
        arguments[0][1] = 1;

        arguments[1][0] = new int[][]{{8}};
        arguments[1][1] = 0;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[][] grid = (int[][]) arguments[i][0];
            int expected = (int) arguments[i][1];
            System.out.print("input: ");
            print2DArray(grid);
            System.out.print("output: ");
            long output = solution.numMagicSquaresInside(grid);
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