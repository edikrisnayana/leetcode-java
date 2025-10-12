public class Solution {
  public int[] sortJumbled(int[] mapping, int[] nums) {
    int[] nums_mapped_value = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int temp = nums[i];

      if (temp > 0) {
        int f = 1;
        int mapped_val = 0;
        while (temp > 0) {
          mapped_val = mapped_val + mapping[temp % 10] * f;
          f = f * 10;
          temp = temp / 10;
        }

        nums_mapped_value[i] = mapped_val;
      } else {
        nums_mapped_value[i] = mapping[temp];
      }

    }

    mergeSort(nums, nums_mapped_value, 0, nums.length - 1);


    return nums;
  }

  private void mergeSort(int[] nums, int[] nums_mapped_value, int left, int right) {
    if (left < right) {
      int middle = left + (right - left) / 2;

      mergeSort(nums, nums_mapped_value, left, middle);
      mergeSort(nums, nums_mapped_value, middle + 1, right);

      merge(nums, nums_mapped_value, left, middle, right);
    }
  }

  private void merge(int[] nums, int[] nums_mapped_value, int left, int middle, int right) {
    int n1 = middle - left + 1;
    int n2 = right - middle;

    int[] leftNums = new int[n1];
    int[] rightNums = new int[n2];
    int[] leftMapped = new int[n1];
    int[] rightMapped = new int[n2];

    for (int i = 0; i < n1; ++i) {
      leftNums[i] = nums[left + i];
      leftMapped[i] = nums_mapped_value[left + i];
    }
    for (int j = 0; j < n2; ++j) {
      rightNums[j] = nums[middle + 1 + j];
      rightMapped[j] = nums_mapped_value[middle + 1 + j];
    }

    int i = 0, j = 0;
    int k = left;
    while (i < n1 && j < n2) {
      if (leftMapped[i] <= rightMapped[j]) {
        nums[k] = leftNums[i];
        nums_mapped_value[k] = leftMapped[i];
        i++;
      } else {
        nums[k] = rightNums[j];
        nums_mapped_value[k] = rightMapped[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      nums[k] = leftNums[i];
      nums_mapped_value[k] = leftMapped[i];
      i++;
      k++;
    }

    while (j < n2) {
      nums[k] = rightNums[j];
      nums_mapped_value[k] = rightMapped[j];
      j++;
      k++;
    }
  }
}
