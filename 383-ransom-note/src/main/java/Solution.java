public class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    int[] map = new int[26];
    for (char c : ransomNote.toCharArray()) {
      int index = c - 'a';
      int i = magazine.indexOf(c, map[index]);
      if (i == -1) {
        return false;
      }
      map[index] = i + 1;
    }
    return true;
  }
}
