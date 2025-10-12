import com.leetcode.common.ListNode;

public class Solution {
  public ListNode modifiedList(int[] nums, ListNode head) {
    int max = nums[0];
    for (int num : nums) {
      if (max < num) {
        max = num;
      }
    }

    boolean[] set = new boolean[max + 1];
    for (int num : nums) {
      set[num] = true;
    }

    ListNode result = new ListNode();
    ListNode curr = result;
    curr.next = head;
    while (head != null) {
      if (head.val <= max && set[head.val]) {
        curr.next = head.next;
      } else {
        curr = curr.next;
      }
      head = head.next;
    }

    return result.next;
  }
}
