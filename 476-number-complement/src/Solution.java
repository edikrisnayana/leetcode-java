public class Solution {
  public int findComplement(int num) {
    int pow = 0;
    int result = 0;
    while (num > 0) {
      int rem = num % 2;
      result += (int) ((1 - rem) * Math.pow(2, pow));
      pow++;
      num /= 2;
    }
    return result;
  }
}
