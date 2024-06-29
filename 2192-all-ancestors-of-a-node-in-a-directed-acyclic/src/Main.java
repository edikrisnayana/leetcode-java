import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][3];
        arguments[0][0] = 8;
        arguments[0][1] = new int[][]{{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}};
        arguments[0][2] = convertToList(new int[][]{{}, {}, {}, {0, 1}, {0, 2}, {0, 1, 3}, {0, 1, 2, 3, 4}, {0, 1, 2, 3}});

        arguments[1][0] = 5;
        arguments[1][1] = new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};
        arguments[1][2] = convertToList(new int[][]{{}, {0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}});

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int n = (int) arguments[i][0];
            int[][] edgeList = (int[][]) arguments[i][1];
            List<List<Integer>> expected = (List<List<Integer>>) arguments[i][2];
            System.out.println("input: ");
            System.out.println(n);
            print2DArray(edgeList);
            System.out.print("output: ");
            List<List<Integer>> output = solution.getAncestors(n, edgeList);
            print2DList(output);
            System.out.print("expected: ");
            print2DList(expected);
            System.out.println("match: " + match(output, expected));
            System.out.println();
        }
    }

    private static boolean match(List<List<Integer>> lists1, List<List<Integer>> lists2) {
        if (lists1.size() != lists2.size()) {
            return false;
        }

        for (int i = 0; i < lists1.size(); i++) {
            List<Integer> list1 = lists1.get(i);
            List<Integer> list2 = lists2.get(i);
            if (list1.size() != list2.size()) {
                return false;
            }

            for (int j = 0; j < list1.size(); j++) {
                if (!Objects.equals(list1.get(j), list2.get(j))) {
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

    private static void print2DList(List<List<Integer>> lists) {
        List<String> list = new ArrayList<>();
        for (List<Integer> items : lists) {
            list.add(
                    "[" + items.stream().map(String::valueOf)
                            .collect(Collectors.joining(", ")) + "]"
            );
        }
        System.out.println(
                "[" + String.join(", ", list) + "]"
        );
    }

    private static List<List<Integer>> convertToList(int[][] arr) {
        List<List<Integer>> result = new ArrayList<>();
        for (int[] ints : arr) {
            List<Integer> list = new ArrayList<>();
            for (int val : ints) {
                list.add(val);
            }
            result.add(list);
        }
        return result;
    }
}