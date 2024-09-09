import java.util.Arrays;

public class Solution {
  public int[][] spiralMatrix(int m, int n, ListNode head) {
    int[][] result = new int[m][];
    int top = 0;
    int bot = m - 1;
    int left = 0;
    int right = n - 1;

    for (int row = 0; row < m; row++) {
      result[row] = new int[n];
      Arrays.fill(result[row], -1);
    }

    while (head != null) {
      for (int i = left; i <= right && head != null; i++) {
        result[top][i] = head.val;
        head = head.next;
      }
      top++;

      for (int i = top; i <= bot && head != null; i++) {
        result[i][right] = head.val;
        head = head.next;
      }
      right--;

      for (int i = right; i >= left && head != null; i--) {
        result[bot][i] = head.val;
        head = head.next;
      }
      bot--;

      for (int i = bot; i >= top && head != null; i--) {
        result[i][left] = head.val;
        head = head.next;
      }
      left++;
    }

    return result;
  }
}
