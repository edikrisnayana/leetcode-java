import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<Integer>> getAncestors(int n, int[][] edges) {
    ArrayList<Integer>[] map = new ArrayList[n];
    for (int[] edge : edges) {
      ArrayList<Integer> list = map[edge[1]];
      if (list == null) {
        list = new ArrayList<>();
        map[edge[1]] = list;
      }
      list.add(edge[0]);
    }

    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      boolean[] arr = new boolean[n];
      int count = fillResult(arr, map, i);
      List<Integer> list = new ArrayList<>();
      if (count > 0) {
        for (int j = 0; j < n; j++) {
          if (arr[j]) {
            list.add(j);
          }
        }
      }
      result.add(list);
    }

    return result;
  }

  private int fillResult(boolean[] arr, ArrayList<Integer>[] map, int node) {
    List<Integer> list = map[node];
    if (list == null) {
      return 0;
    }
    int count = 0;
    for (int val : list) {
      if (!arr[val]) {
        arr[val] = true;
        count++;
        count += fillResult(arr, map, val);
      }
    }
    return count;
  }
}
