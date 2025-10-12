public class Solution {
  public int countSeniors(String[] details) {
    int count = 0;
    for (String detail : details) {
      int num1 = detail.charAt(11) - '0';
      if (num1 < 6) {
        continue;
      }
      int num2 = detail.charAt(12) - '0';
      if (num1 == 6 && num2 == 0) {
        continue;
      }

      count++;
    }

    return count;
  }
}
