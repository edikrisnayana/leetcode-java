public class Solution {
    public int minPatches(int[] nums, int n) {
        long patch = 0;
        int count = 0;
        int index = 0;
        int len = nums.length;
        while (patch < n) {
            if (index < len && patch + 1 >= nums[index]) {
                patch += nums[index];
                index++;
            } else {
                patch += (patch + 1);
                count++;
            }
        }

        return count;
    }
}
