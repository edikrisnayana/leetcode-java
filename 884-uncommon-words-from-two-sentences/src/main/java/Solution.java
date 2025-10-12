import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
  public String[] uncommonFromSentences(String s1, String s2) {
    String[] arr1 = s1.split(" ");
    String[] arr2 = s2.split(" ");
    Map<String, Integer> map = new HashMap<>();
    for (String s : arr1) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }

    for (String s : arr2) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }

    List<String> list = new ArrayList<>();
    for (String word : map.keySet()) {
      if (map.get(word) == 1) {
        list.add(word);
      }
    }

    return list.toArray(new String[0]);
  }
}
