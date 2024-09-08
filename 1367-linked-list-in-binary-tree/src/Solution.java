public class Solution {
  public boolean isSubPath(ListNode head, TreeNode root) {
    return isSubPath(head, head, root);
  }

  private boolean isSubPath(ListNode head, ListNode curr, TreeNode root) {
    if (curr == null) {
      return true;
    }

    if (root == null) {
      return false;
    }

    if (curr.val == root.val) {
      curr = curr.next;
    } else if (head.val == root.val) {
      head = head.next;
    } else {
      curr = head;
    }

    return isSubPath(head, curr, root.left) || isSubPath(head, curr, root.right);
  }
}
