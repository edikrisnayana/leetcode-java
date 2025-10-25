public class Solution {
  public int totalMoney(int n) {
    int result = ((28 + (28 + (((n / 7) - 1) * 7))) * (n / 7)) / 2;

    if (n % 7 != 0) {
      result += (((((n / 7) + 1) + (((n / 7) + 1) + ((n % 7) - 1))) * (n % 7)) / 2);
    }

    return result;
  }
}
