import com.leetcode.common.ListNode;

public class Solution {
  public ListNode insertGreatestCommonDivisors(ListNode head) {
    ListNode curr = head;
    ListNode next = head.next;
    while (next != null) {
      int gcd = gcd(curr.val, next.val);
      curr.next = new ListNode(gcd, next);
      curr = next;
      next = next.next;
    }

    return head;
  }

  private int gcd(int a, int b) {
    int c = a % b;
    while (c != 0) {
      a = b;
      b = c;
      c = a % b;
    }
    return b;
  }
}
