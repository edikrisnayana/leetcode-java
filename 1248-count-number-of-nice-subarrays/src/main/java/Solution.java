public class Solution {
  public int numberOfSubarrays(int[] nums, int k) {
    int len = nums.length;
    int left = 0;
    while (left < len && nums[left] % 2 == 0) {
      left++;
    }

    if (left == len) {
      return 0;
    }

    int oddCount = 1;
    int right = left + 1;
    while (right < len && oddCount < k) {
      if (nums[right] % 2 != 0) {
        oddCount++;
      }
      right++;
    }

    if (right == len && oddCount != k) {
      return 0;
    }

    if (right == len) {
      return left + 1;
    }

    int prev = 0;
    int result = left - prev + 1;
    right--;
    for (int i = right + 1; i < len; i++) {
      if (nums[i] % 2 != 0) {
        result += ((i - right - 1) * (left - prev + 1));
        right = i;
        left++;
        prev = left;
        while (left <= i && nums[left] % 2 == 0) {
          left++;
        }
        result += (left - prev + 1);
      }
    }
    result += ((len - right - 1) * (left - prev + 1));
    return result;
  }
}
