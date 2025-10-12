public class Solution {
  public boolean canBeEqual(int[] target, int[] arr) {
    int[] map = new int[1001];
    for (int num : target) {
      map[num]++;
    }

    for (int num : arr) {
      map[num]--;
      if (map[num] < 0) {
        return false;
      }
    }

    return true;
  }
}
