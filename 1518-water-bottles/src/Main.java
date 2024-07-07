//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[2][3];
        arguments[0][0] = 9;
        arguments[0][1] = 3;
        arguments[0][2] = 13;

        arguments[1][0] = 15;
        arguments[1][1] = 4;
        arguments[1][2] = 19;

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int numBottles = (int) arguments[i][0];
            int numExchange = (int) arguments[i][1];
            int expected = (int) arguments[i][2];
            System.out.println("input: " + numBottles + " " + numExchange);
            System.out.print("output: ");
            int output = solution.numWaterBottles(numBottles, numExchange);
            System.out.println(output);
            System.out.println("expected: " + expected);
            System.out.println("match: " + (output == expected));
            System.out.println();
        }
    }
}