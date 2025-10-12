public class Solution {
  public int[] frequencySort(int[] nums) {
    int[] count = new int[202];
    for (int num : nums) {
      count[num + 100]++;
    }
    quickSort(nums, count, 0, nums.length - 1);
    return nums;
  }

  private void quickSort(int[] nums, int[] freq, int low, int high) {
    if (low < high) {
      int pivot = partition(nums, freq, low, high);
      quickSort(nums, freq, low, pivot - 1);
      quickSort(nums, freq, pivot + 1, high);
    }
  }

  private int partition(int[] nums, int[] freq, int low, int high) {
    int pivot = freq[nums[high] + 100];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (pivot > freq[nums[j] + 100]) {
        i++;
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
      } else if (freq[nums[j] + 100] == pivot) {
        if (nums[high] <= nums[j]) {
          i++;
          int temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
      }
    }
    int temp = nums[i + 1];
    nums[i + 1] = nums[high];
    nums[high] = temp;
    return i + 1;
  }
}
