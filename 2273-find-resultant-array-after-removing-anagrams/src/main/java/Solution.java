import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> removeAnagrams(String[] words) {
    int len = words.length;
    int[][] map = new int[len][26];
    map[0] = toCharMap(words[0]);
    int prev = 0;
    for (int i = 1; i < len; i++) {
      int[] arr = toCharMap(words[i]);
      if (!isEquals(arr, map[prev])) {
        map[i] = arr;
        prev = i;
      } else {
        map[i] = null;
      }
    }

    List<String> result = new ArrayList<>();
    for (int i = 0; i < len; i++) {
      if (map[i] != null) {
        result.add(words[i]);
      }
    }

    return result;
  }

  private int[] toCharMap(String word) {
    int[] result = new int[26];
    for (char c : word.toCharArray()) {
      result[c - 'a']++;
    }
    return result;
  }

  private boolean isEquals(int[] a, int[] b) {
    for (int i = 0; i < 26; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }
    return true;
  }
}
