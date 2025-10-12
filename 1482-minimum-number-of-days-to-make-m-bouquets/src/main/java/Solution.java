public class Solution {
  private int[] arr;
  private int m, k;

  public int minDays(int[] bloomDay, int m, int k) {
    int len = bloomDay.length;
    if ((long) m * k > len) {
      return -1;
    }

    int max = 0;
    for (int day : bloomDay) {
      if (max < day) {
        max = day;
      }
    }

    int left = 1;
    int right = max;
    while (left < right) {
      int mid = (left + right) / 2;
      if (!count(bloomDay, mid, m, k)) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }

  private boolean count(int[] bloomDay, int val, int m, int k) {
    int flower = 0;
    int bouq = 0;
    for (int day : bloomDay) {
      if (day > val) {
        flower = 0;
      } else if (++flower >= k) {
        bouq++;
        flower = 0;
      }
    }
    return bouq >= m;

  }
}
