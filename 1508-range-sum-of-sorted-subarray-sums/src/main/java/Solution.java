public class Solution {
  public int rangeSum(int[] nums, int n, int left, int right) {
    int newLength = ((1 + n) * n) / 2;
    int[] arr = new int[newLength];
    int[] sorted = new int[100001];
    for (int i = 0; i < n; i++) {
      arr[i] = nums[i];
      sorted[arr[i]]++;
    }
    int index = n;
    int incrIndex = 0;
    for (int start = 1; start < n; start++) {
      int startIncrIndex = index;
      for (int i = start; i < n; i++) {
        arr[index] = arr[incrIndex] + nums[i];
        sorted[arr[index]]++;
        index++;
        incrIndex++;
      }
      incrIndex = startIncrIndex;
    }

    long result = 0;
    for (int i = 0, j = 0; i < 100001 && j < right; i++) {
      int count = sorted[i];
      while (count > 0 && j < right) {
        result += i;
        j++;
        count--;
      }
    }
    for (int i = 0, j = 0; i < 100001 && j < left - 1; i++) {
      int count = sorted[i];
      while (count > 0 && j < left - 1) {
        result -= i;
        j++;
        count--;
      }
    }

    return (int) (result % 1000000007);
  }
}
