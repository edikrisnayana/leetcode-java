class Solution {
  public boolean hasSameDigits(String s) {
    int[] arr = new int[s.length()];
    int index = 0;
    for (char c : s.toCharArray()) {
      arr[index++] = c - '0';
    }

    return hasSameDigits(arr, arr.length);
  }

  private boolean hasSameDigits(int[] arr, int len) {
    if (len == 2) {
      return arr[0] == arr[1];
    }

    for (int i = 0; i < len - 1; i++) {
      arr[i] = (arr[i] + arr[i + 1]) % 10;
    }

    return hasSameDigits(arr, len - 1);
  }
}