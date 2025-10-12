public class Solution {
  public int minDifference(int[] nums) {
    if (nums.length <= 4) {
      return 0;
    }

    int max1 = Integer.MIN_VALUE;
    int max2 = max1;
    int max3 = max1;
    int max4 = max1;
    int min1 = Integer.MAX_VALUE;
    int min2 = min1;
    int min3 = min1;
    int min4 = min1;

    for (int num : nums) {
      if (max1 < num) {
        max4 = max3;
        max3 = max2;
        max2 = max1;
        max1 = num;
      } else if (max2 < num) {
        max4 = max3;
        max3 = max2;
        max2 = num;
      } else if (max3 < num) {
        max4 = max3;
        max3 = num;
      } else if (max4 < num) {
        max4 = num;
      }

      if (min1 > num) {
        min4 = min3;
        min3 = min2;
        min2 = min1;
        min1 = num;
      } else if (min2 > num) {
        min4 = min3;
        min3 = min2;
        min2 = num;
      } else if (min3 > num) {
        min4 = min3;
        min3 = num;
      } else if (min4 > num) {
        min4 = num;
      }
    }

    return Math.min(Math.min(max4 - min1, max3 - min2), Math.min(max2 - min3, max1 - min4));
  }
}
