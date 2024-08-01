public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][2];
        arguments[0][0] = new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        arguments[0][1] = 2;

        arguments[1][0] = new String[]{"1313579440F2036", "2921522980M5644"};
        arguments[1][1] = 0;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            String[] details = (String[]) arguments[i][0];
            int expected = (int) arguments[i][1];
            System.out.print("input: ");
            printArray(details);
            System.out.print("output: ");
            int output = solution.countSeniors(details);
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