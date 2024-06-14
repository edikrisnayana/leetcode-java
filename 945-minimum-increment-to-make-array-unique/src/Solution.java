public class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max = -1;
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
        }
        int len = nums.length + max;
        int[] arr = new int[len];
        for (int num : nums) {
            arr[num]++;
        }

        int result = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] > 1) {
                int rest = arr[i] - 1;
                result += rest;
                arr[i + 1] += rest;
            }
        }

        return result;
    }
}
