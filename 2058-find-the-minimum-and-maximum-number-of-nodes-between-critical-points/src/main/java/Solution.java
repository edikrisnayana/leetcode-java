import com.leetcode.common.ListNode;

public class Solution {
  public int[] nodesBetweenCriticalPoints(ListNode head) {
    int prev = head.val;
    head = head.next;
    int firstCriticalPoint = -1;
    int index = 1;
    while (head != null) {
      if (head.next != null && ((prev < head.val && head.val > head.next.val) || (prev > head.val && head.val < head.next.val))) {
        firstCriticalPoint = index;
        break;
      }
      prev = head.val;
      head = head.next;
      index++;
    }

    if (firstCriticalPoint == -1) {
      return new int[]{-1, -1};
    }

    int prevCriticalPoint = firstCriticalPoint;
    int thirdCriticalPoint = -1;

    int minDistance = Integer.MAX_VALUE;
    prev = head.val;
    head = head.next;
    index++;
    while (head != null) {
      if (head.next != null && ((prev < head.val && head.val > head.next.val) || (prev > head.val && head.val < head.next.val))) {
        thirdCriticalPoint = index;
        minDistance = Math.min(minDistance, thirdCriticalPoint - prevCriticalPoint);
        prevCriticalPoint = thirdCriticalPoint;
      }
      prev = head.val;
      head = head.next;
      index++;
    }

    if (thirdCriticalPoint == -1) {
      return new int[]{-1, -1};
    }

    return new int[]{minDistance, thirdCriticalPoint - firstCriticalPoint};
  }
}
