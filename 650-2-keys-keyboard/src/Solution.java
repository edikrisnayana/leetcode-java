public class Solution {
  public int minSteps(int n) {
    int result = 0;
    for (int i = 2; i * i <= n; ) {
      if (n % i == 0) {
        result += i;
        n = n / i;
      } else {
        i++;
      }
    }
    if (n != 1) {
      result = result + n;
    }
    return result;
  }
}
