public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[3][2];
        arguments[0][0] = 123;
        arguments[0][1] = "One Hundred Twenty Three";

        arguments[1][0] = 12345;
        arguments[1][1] = "Twelve Thousand Three Hundred Forty Five";

        arguments[2][0] = 1234567;
        arguments[2][1] = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int num = (int) arguments[i][0];
            String expected = (String) arguments[i][1];
            System.out.print("input: ");
            System.out.println(num);
            System.out.print("output: ");
            String output = solution.numberToWords(num);
            System.out.println(output);
            System.out.print("expected: ");
            System.out.println(expected);
            System.out.println("match: " + (output.equals(expected)));
            System.out.println();
        }
    }
}