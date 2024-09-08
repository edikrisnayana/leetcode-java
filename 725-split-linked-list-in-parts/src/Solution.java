public class Solution {
  public ListNode[] splitListToParts(ListNode head, int k) {
    ListNode[] result = new ListNode[k];
    if (head == null) {
      return result;
    }

    ListNode[] temp = new ListNode[1000];
    int len = 0;
    while (head != null) {
      temp[len] = head;
      len++;
      head = head.next;
    }

    if (len <= k) {
      for (int i = 0; i < len; i++) {
        result[i] = temp[i];
        temp[i].next = null;
      }
    } else {
      int div = len / k;
      int rem = len % k;
      int next = 0;
      for (int i = 0; i < k; i++) {
        result[i] = temp[next];
        next += div;
        if (rem > 0) {
          next++;
          rem--;
        }
        temp[next - 1].next = null;
      }
    }

    return result;
  }
}
