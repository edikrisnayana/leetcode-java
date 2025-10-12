public class Solution {
  public int passThePillow(int n, int time) {
    int diff = n - 1;
    int count = time / diff;
    time %= diff;

    int start = 1;
    int incr = 1;
    if (count % 2 == 1) {
      start = n;
      incr = -1;
    }

    return start + (time * incr);
  }
}
