import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> distinct = new HashSet<>();
        Set<String> nonDistinct = new HashSet<>();
        for (String s : arr) {
            if (!distinct.contains(s)) {
                distinct.add(s);
            } else {
                nonDistinct.add(s);
            }
        }

        int counter = 0;
        for (String s : arr) {
            if (!nonDistinct.contains(s)) {
                counter++;
            }
            if (counter == k) {
                return s;
            }
        }

        return "";
    }
}
