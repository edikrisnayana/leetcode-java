public class Solution {
  private String[] map = new String[91];

  public Solution() {
    map[1] = "One";
    map[2] = "Two";
    map[3] = "Three";
    map[4] = "Four";
    map[5] = "Five";
    map[6] = "Six";
    map[7] = "Seven";
    map[8] = "Eight";
    map[9] = "Nine";
    map[10] = "Ten";
    map[11] = "Eleven";
    map[12] = "Twelve";
    map[13] = "Thirteen";
    map[14] = "Fourteen";
    map[15] = "Fifteen";
    map[16] = "Sixteen";
    map[17] = "Seventeen";
    map[18] = "Eighteen";
    map[19] = "Nineteen";
    map[20] = "Twenty";
    map[30] = "Thirty";
    map[40] = "Forty";
    map[50] = "Fifty";
    map[60] = "Sixty";
    map[70] = "Seventy";
    map[80] = "Eighty";
    map[90] = "Ninety";
  }

  public String numberToWords(int num) {
    if (num == 0) {
      return "Zero";
    }

    StringBuilder sb = new StringBuilder();
    if (num >= 1000000000) {
      int div = num / 1000000000;
      sb.append(numberToWords(div));
      sb.append(" Billion");
      num = num % 1000000000;
      if (num > 0) {
        sb.append(" ");
      }
    }

    if (num >= 1000000) {
      int div = num / 1000000;
      sb.append(numberToWords(div));
      sb.append(" Million");
      num = num % 1000000;
      if (num > 0) {
        sb.append(" ");
      }
    }

    if (num >= 1000) {
      int div = num / 1000;
      sb.append(numberToWords(div));
      sb.append(" Thousand");
      num = num % 1000;
      if (num > 0) {
        sb.append(" ");
      }
    }

    if (num >= 100) {
      int div = num / 100;
      sb.append(numberToWords(div));
      sb.append(" Hundred");
      num = num % 100;
      if (num > 0) {
        sb.append(" ");
      }
    }

    if (num >= 20) {
      int rem = num % 10;
      if (rem == 0) {
        sb.append(map[num]);
      } else {
        int div = num / 10;
        sb.append(map[div * 10]);
        sb.append(" ");
      }
      num = rem;
    }

    if (num > 0) {
      sb.append(map[num]);
    }

    return sb.toString();
  }
}
