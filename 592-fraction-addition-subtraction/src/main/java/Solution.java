public class Solution {
  public String fractionAddition(String expression) {
    char sign = '+';
    int start = 0;
    if (expression.charAt(start) == '-') {
      sign = '-';
      start++;
    }

    int length = expression.length();
    char resultSign = '+';
    int resultNumerator = 0;
    int resultDenominator = 1;
    boolean isNumerator = true;
    int numerator = 0;
    int denominator = 0;
    for (int i = start; i < length; i++) {
      char c = expression.charAt(i);
      if (c == '-' || c == '+') {
        if (resultNumerator == 0) {
          resultSign = sign;
          resultNumerator = numerator;
          resultDenominator = denominator;
        } else {
          int lcm = lcm(resultDenominator, denominator);
          resultNumerator = (lcm / resultDenominator) * resultNumerator;
          numerator = (lcm / denominator) * numerator;
          if (resultSign == '-') {
            resultNumerator = -resultNumerator;
          }

          if (sign == '-') {
            numerator = -numerator;
          }

          resultNumerator += numerator;
          if (resultNumerator < 0) {
            resultSign = '-';
            resultNumerator = -resultNumerator;
          } else {
            resultSign = '+';
          }
          resultDenominator = lcm;
        }
        sign = c;
        numerator = 0;
        denominator = 0;
        isNumerator = true;
      } else if (c == '/') {
        isNumerator = false;
      } else if (isNumerator) {
        numerator = (numerator * 10) + (c - '0');
      } else {
        denominator = (denominator * 10) + (c - '0');
      }
    }

    if (resultNumerator == 0) {
      resultSign = sign;
      resultNumerator = numerator;
      resultDenominator = denominator;
    } else {
      int lcm = lcm(resultDenominator, denominator);
      resultNumerator = (lcm / resultDenominator) * resultNumerator;
      numerator = (lcm / denominator) * numerator;
      if (resultSign == '-') {
        resultNumerator = -resultNumerator;
      }

      if (sign == '-') {
        numerator = -numerator;
      }

      resultNumerator += numerator;
      if (resultNumerator < 0) {
        resultSign = '-';
        resultNumerator = -resultNumerator;
      } else {
        resultSign = '+';
      }
      resultDenominator = lcm;
    }

    if (resultNumerator == 0) {
      return "0/1";
    }

    int gcd = gcd(resultNumerator, resultDenominator);
    StringBuilder result = new StringBuilder();
    if (resultSign == '-') {
      result.append(resultSign);
    }
    result.append(resultNumerator / gcd);
    result.append('/');
    result.append(resultDenominator / gcd);

    return result.toString();
  }

  private int gcd(int a, int b) {
    int c = a % b;
    while (c != 0) {
      a = b;
      b = c;
      c = a % b;
    }

    return b;
  }

  private int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }
}
