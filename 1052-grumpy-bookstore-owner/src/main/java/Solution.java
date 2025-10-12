public class Solution {
  public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    int n = customers.length;
    int left = 0;
    int right = 0;
    int max = 0;
    int result = 0;
    while (minutes > 0) {
      int satisfied = customers[right];
      int grumpyIt = grumpy[right];
      max += (satisfied * grumpyIt);
      result += (satisfied * (1 - grumpyIt));
      minutes--;
      right++;
    }

    if (right == n) {
      return result + max;
    }

    int satisfied = max;
    for (int i = right; i < n; i++) {
      int custSatisfied = customers[i];
      int grumpyIt = grumpy[i];
      satisfied += (custSatisfied * grumpyIt);
      result += (custSatisfied * (1 - grumpyIt));
      satisfied -= (customers[left] * grumpy[left]);
      left++;

      if (max < satisfied) {
        max = satisfied;
      }
    }

    return result + max;
  }
}
