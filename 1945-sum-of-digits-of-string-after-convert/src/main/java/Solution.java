public class Solution {
  public int getLucky(String s, int k) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      int num = (s.charAt(i) - 'a') + 1;
      num = ((num / 10) + (num % 10));
      sum += num;
    }

    k--;

    while (k > 0) {
      int temp = 0;
      while (sum > 0) {
        temp += (sum % 10);
        sum /= 10;
      }
      sum = temp;
      k--;
    }
    return sum;
  }
}
