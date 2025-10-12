public class Solution {
  public String reverseParentheses(String s) {
    char[] arr = new char[s.length()];
    int index = 0;
    for (char c : s.toCharArray()) {
      if (c == ')') {
        int right = index - 1;
        int left = right;
        while (arr[left] != '(') {
          left--;
        }
        reverse(arr, left, right);
        index--;
      } else {
        arr[index++] = c;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < index; i++) {
      sb.append(arr[i]);
    }

    return sb.toString();
  }

  private void reverse(char[] arr, int left, int right) {
    while (left < right) {
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }
}
