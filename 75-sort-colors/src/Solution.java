public class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for (int num : nums) {
            colors[num]++;
        }

        int index = 0;
        for (int i = 0; i < 3; i++) {
            while (colors[i] > 0) {
                nums[index++] = i;
                colors[i]--;
            }
        }
    }
}
