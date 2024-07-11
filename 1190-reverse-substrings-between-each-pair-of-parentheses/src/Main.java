//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[3][2];
        arguments[0][0] = "(abcd)";
        arguments[0][1] = "dcba";

        arguments[1][0] = "(u(love)i)";
        arguments[1][1] = "iloveu";

        arguments[2][0] = "(ed(et(oc))el)";
        arguments[2][1] = "leetcode";

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            String s = (String) arguments[i][0];
            String expected = (String) arguments[i][1];
            System.out.print("input: ");
            System.out.println(s);
            System.out.print("output: ");
            String output = solution.reverseParentheses(s);
            System.out.println(output);
            System.out.print("expected: ");
            System.out.println(expected);
            System.out.println("match: " + output.equals(expected));
            System.out.println();
        }
    }
}