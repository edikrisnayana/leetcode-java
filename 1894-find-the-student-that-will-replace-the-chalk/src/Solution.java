public class Solution {
  public int chalkReplacer(int[] chalk, int k) {
    long sum = 0;
    for (long num : chalk) {
      sum += num;
    }

    k %= sum;

    int index = 0;
    while (index < chalk.length && k >= chalk[index]) {
      k -= chalk[index];
      index++;
    }

    return index;
  }
}
