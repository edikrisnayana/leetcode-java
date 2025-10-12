public class Solution {
  public int longestSubarray(int[] nums) {
    int length = 1;
    int max = nums[0];
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == max) {
        count++;
        if (count > length) {
          length = count;
        }
      } else if (nums[i] > max) {
        max = nums[i];
        length = 1;
        count = 1;
      } else {
        count = 0;
      }
    }
    return length;
  }
}
