import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        for (int num : nums1) {
            arr[num]++;
        }

        int index = 0;
        int[] result = new int[1001];
        for (int num : nums2) {
            if (arr[num] > 0) {
                result[index] = num;
                index++;
                arr[num]--;
            }
        }

        return Arrays.copyOf(result, index);
    }
}
