class Solution {
  public int countValidSelections(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }

    int count = 0;
    int halfSum = 0;
    for (int num : nums) {
      halfSum += num;
      if (num == 0) {
        if (halfSum * 2 == sum) {
          count += 2;
        } else if (Math.abs(halfSum * 2 - sum) == 1) {
          count++;
        }
      }
    }

    return count;
  }
}