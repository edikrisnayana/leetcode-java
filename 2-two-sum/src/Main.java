import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[][] arguments = new Object[3][3];
        arguments[0][0] = new int[]{2, 7, 11, 15};
        arguments[0][1] = 9;
        arguments[0][2] = new int[]{0, 1};

        arguments[1][0] = new int[]{3, 2, 4};
        arguments[1][1] = 6;
        arguments[1][2] = new int[]{1, 2};

        arguments[2][0] = new int[]{3, 3};
        arguments[2][1] = 6;
        arguments[2][2] = new int[]{0, 1};

        for (int i = 0; i < arguments.length; i++) {
            System.out.printf("Test Case %s:\n", i + 1);
            Solution solution = new Solution();
            int[] nums = (int[]) arguments[i][0];
            int target = (int) arguments[i][1];
            int[] expected = (int[]) arguments[i][2];
            System.out.println("input:");
            print(nums);
            System.out.println("output:");
            int[] output = solution.twoSum(nums, target);
            print(output);
            System.out.println("expected:");
            print(expected);
            System.out.println("match: " + match(expected, output));
            System.out.println();
        }

        System.out.println("Test Case 1:");
        Solution solution1 = new Solution();
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        System.out.println("input:");
        print(nums1);
        System.out.println("output:");
        int[] output1 = solution1.twoSum(nums1, target1);
        print(output1);
        System.out.println("expected:");
        print(expected1);
        System.out.println("match: " + match(expected1, output1));
    }

    private static boolean match(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    private static void print(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]);
            sb.append(", ");
        }
        sb.append(arr[arr.length - 1]);
        sb.append("]");
        System.out.println(sb);
    }
}