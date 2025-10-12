import com.leetcode.common.ListNode;

public class Solution {
  public ListNode mergeNodes(ListNode head) {
    ListNode modifyNode = head.next;
    ListNode node = modifyNode;

    while (node != null) {
      int sum = 0;
      while (node.val != 0) {
        sum += node.val;
        node = node.next;
      }
      modifyNode.val = sum;
      node = node.next;
      modifyNode.next = node;
      modifyNode = modifyNode.next;
    }

    return head.next;
  }
}
