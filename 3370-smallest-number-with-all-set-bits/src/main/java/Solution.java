class Solution {
  public int smallestNumber(int n) {
    int pow = 0;
    int x = 0;
    while (n > 0) {
      x += Math.pow(2, pow);
      pow++;
      n /= 2;
    }
    return x;
  }
}