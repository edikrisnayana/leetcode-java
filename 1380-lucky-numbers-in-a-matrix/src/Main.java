import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[3][2];
        arguments[0][0] = new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        arguments[0][1] = new int[]{15};

        arguments[1][0] = new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        arguments[1][1] = new int[]{12};

        arguments[2][0] = new int[][]{{7, 8}, {1, 2}};
        arguments[2][1] = new int[]{7};

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[][] metrics = (int[][]) arguments[i][0];
            int[] expected = (int[]) arguments[i][1];
            System.out.print("input: ");
            print2DArray(metrics);
            System.out.print("output: ");
            int[] output = convertToArray(solution.luckyNumbers(metrics));
            printArray(output);
            System.out.print("expected: ");
            printArray(expected);
            System.out.println("match: " + match(output, expected));
            System.out.println();
        }
    }

    private static boolean match(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
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

    private static int[] convertToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        int index = 0;
        for (int num : list) {
            result[index++] = num;
        }
        return result;
    }
}