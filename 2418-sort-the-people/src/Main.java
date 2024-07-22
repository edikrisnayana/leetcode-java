import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][3];
        arguments[0][0] = new String[]{"Mary", "John", "Emma"};
        arguments[0][1] = new int[]{180, 165, 170};
        arguments[0][2] = new String[]{"Mary", "Emma", "John"};

        arguments[1][0] = new String[]{"Alice", "Bob", "Bob"};
        arguments[1][1] = new int[]{155, 185, 150};
        arguments[1][2] = new String[]{"Bob", "Alice", "Bob"};

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            String[] names = (String[]) arguments[i][0];
            int[] heights = (int[]) arguments[i][1];
            String[] expected = (String[]) arguments[i][2];
            System.out.println("input: ");
            printArray(names);
            printArray(heights);
            System.out.print("output: ");
            String[] output = solution.sortPeople(names, heights);
            printArray(output);
            System.out.print("expected: ");
            printArray(expected);
            System.out.println("match: " + match(output, expected));
            System.out.println();
        }
    }

    private static boolean match(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    private static void printArray(int[] arr) {
        System.out.println(
                "[" + Arrays.stream(arr).mapToObj(String::valueOf)
                        .collect(Collectors.joining(", ")) + "]"
        );
    }

    private static void printArray(String[] arr) {
        System.out.println(
                "[" + String.join(", ", arr) + "]"
        );
    }
}