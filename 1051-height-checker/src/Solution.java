public class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        int len = heights.length;
        for (int height : heights) {
            freq[height]++;
        }
        int[] expected = new int[len];
        int index = 0;
        for (int i = 0; i < 101; i++) {
            int it = freq[i];
            while (it > 0) {
                expected[index] = i;
                index++;
                it--;
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (expected[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }
}
