class Solution {
  public String toHex(int num) {
    if (num < 0) {
      return toHex((long) (Math.pow(2, 32) + num));
    }
    return toHex((long) num);
  }

  private String toHex(long num) {
    if (num == 0) {
      return "0";
    }

    StringBuilder sb = new StringBuilder();
    while (num > 0) {
      long mod = num % 16;
      sb.append(toHexChar(mod));
      num /= 16;
    }
    return sb.reverse().toString();
  }

  private char toHexChar(long num) {
    if (num < 10) {
      return (char) ('0' + num);
    }

    return (char) ('a' + (num - 10));
  }
}