public class Solution {
  public char findTheDifference(String s, String t) {
    char[] sarr = s.toCharArray();
    char[] tarr = t.toCharArray();

    int extra = 0;
    for (int i = 0; i < sarr.length; i++) {
      extra ^= sarr[i];
      extra ^= tarr[i];
    }
    extra ^= tarr[sarr.length];

    return (char) extra;
  }
}
