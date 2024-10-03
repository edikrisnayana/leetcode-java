public class Solution {
  public int largestUniqueNumber(int[] nums) {
    int[] map = new int[1001];
    for (int num : nums) {
      map[num]++;
    }

    for (int i = 1000; i >= 0; i--) {
      if (map[i] == 1) {
        return i;
      }
    }

    return -1;
  }
}
