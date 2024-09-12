public class Solution {
  public int countConsistentStrings(String allowed, String[] words) {
    boolean[] arr = new boolean[26];
    for (char c : allowed.toCharArray()) {
      arr[c - 'a'] = true;
    }
    
    int count = 0;
    for (String word : words) {
      if (consist(word, arr)) {
        count++;
      }
    }
    
    return count;
  }
  
  private boolean consist(String word, boolean[] arr) {
    for (int i = 0; i < word.length(); i++) {
      if (!arr[word.charAt(i) - 'a']) {
        return false;
      }
    }
    return true;
  }
}
