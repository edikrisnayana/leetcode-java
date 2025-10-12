import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> generateAbbreviations(String word) {
    return generateAbbreviations(word.toCharArray(), 0, new ArrayList[word.length()]);
  }
  
  private List<String> generateAbbreviations(char[] chars, int start, ArrayList[] memo) {
    if (start >= chars.length) {
      return null;
    }
    
    if (memo[start] != null) {
      return memo[start];
    }
    
    int arrLen = chars.length;
    StringBuilder sb = new StringBuilder();
    ArrayList<String> result = new ArrayList<>();
    int index = start;
    while (index < arrLen) {
      int limitLength = arrLen - index;
      for (int len = 1; len <= limitLength; len++) {
        String num = String.valueOf(len);
        List<String> list = generateAbbreviations(chars, index + len + 1, memo);
        if (list != null) {
          for (String s : list) {
            StringBuilder gen = new StringBuilder();
            gen.append(sb);
            gen.append(num);
            gen.append(chars[index + len]);
            gen.append(s);
            result.add(gen.toString());
          }
        } else {
          StringBuilder gen = new StringBuilder();
          gen.append(sb);
          gen.append(num);
          for (int j = index + len; j < arrLen; j++) {
            gen.append(chars[j]);
          }
          result.add(gen.toString());
        }
      }
      sb.append(chars[index]);
      index++;
    }
    
    result.add(sb.toString());
    
    memo[start] = result;
    return result;
  }
}
