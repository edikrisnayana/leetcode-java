import java.util.List;

public class Solution {
  public int maxDistance(List<List<Integer>> arrays) {
    int min1 = Integer.MAX_VALUE;
    int indexMin1 = -1;
    int min2 = min1;
    int max1 = Integer.MIN_VALUE;
    int indexMax1 = -1;
    int max2 = max1;
    int indexMax2 = -1;
    for (int i = 0; i < arrays.size(); i++) {
      List<Integer> array = arrays.get(i);
      int min = array.getFirst();
      if (min < min1) {
        min2 = min1;
        min1 = min;
        indexMin1 = i;
      } else if (min < min2) {
        min2 = min;
      }
      int max = array.getLast();
      if (max > max1) {
        max2 = max1;
        max1 = max;
        indexMax2 = indexMax1;
        indexMax1 = i;
      } else if (max > max2) {
        max2 = max;
        indexMax2 = i;
      }
    }
    if (indexMax1 != indexMin1) {
      return Math.abs(max1 - min1);
    }

    int distance = Math.abs(max1 - min2);
    if (indexMax2 != indexMin1) {
      distance = Math.max(Math.abs(max2 - min1), distance);
    }
    return distance;
  }
}
