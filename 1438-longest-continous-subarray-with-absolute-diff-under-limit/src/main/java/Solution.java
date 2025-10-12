public class Solution {
  private final int maxLen = 100001;
  private final int[] maxDeque = new int[maxLen];
  private final int[] minDeque = new int[maxLen];

  private int maxh, maxt, minh, mint;
  private int[] arr;

  public int longestSubarray(int[] nums, int limit) {
    maxh = maxt = minh = mint = 0;
    arr = nums;
    int len = arr.length;
    int ans = 0;
    for (int left = 0, right = 0; left < len; left++) {
      while (right < len && isUnderLimit(limit, nums[right])) {
        push(right++);
      }
      ans = Math.max(ans, right - left);
      pop(left);
    }
    return ans;
  }

  private boolean isUnderLimit(int limit, int number) {
    int max = maxh < maxt ? Math.max(arr[maxDeque[maxh]], number) : number;
    int min = minh < mint ? Math.min(arr[minDeque[minh]], number) : number;
    return max - min <= limit;
  }

  private void push(int num) {
    while (maxh < maxt && arr[maxDeque[maxt - 1]] <= arr[num]) {
      maxt--;
    }
    maxDeque[maxt++] = num;
    while (minh < mint && arr[minDeque[mint - 1]] >= arr[num]) {
      mint--;
    }
    minDeque[mint++] = num;
  }

  private void pop(int num) {
    if (maxh < maxt && maxDeque[maxh] == num) {
      maxh++;
    }
    if (minh < mint && minDeque[minh] == num) {
      minh++;
    }
  }
}
