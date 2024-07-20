import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][3];
        arguments[0][0] = new int[]{3, 8};
        arguments[0][1] = new int[]{4, 7};
        arguments[0][2] = new int[][]{{3, 0}, {1, 7}};

        arguments[1][0] = new int[]{5, 7, 10};
        arguments[1][1] = new int[]{8, 6, 8};
        arguments[1][2] = new int[][]{{5, 0, 0}, {3, 4, 0}, {0, 2, 8}};

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] rowSum = (int[]) arguments[i][0];
            int[] colSum = (int[]) arguments[i][1];
            int[][] expected = (int[][]) arguments[i][2];
            System.out.println("input: ");
            printArray(rowSum);
            printArray(colSum);
            System.out.print("output: ");
            int[][] output = solution.restoreMatrix(rowSum, colSum);
            print2DArray(output);
            System.out.print("expected: ");
            print2DArray(expected);
            System.out.println("match: " + match(output, expected));
            System.out.println();
        }
    }

    private static boolean match(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length) {
                return false;
            }

            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }

        return true;
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

    private static void printArray(int[] arr) {
        System.out.println(
                "[" + Arrays.stream(arr).mapToObj(String::valueOf)
                        .collect(Collectors.joining(", ")) + "]"
        );
    }
}