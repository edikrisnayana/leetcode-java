import java.util.Arrays;

public class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
        }

        Arrays.sort(arr);
        int mult = 1;
        int count = 0;
        int result = 0;
        for (int i = 25; i >= 0 && arr[i] != 0; i--) {
            result += (arr[i] * mult);
            count++;
            if (count == 8) {
                mult++;
                count = 0;
            }
        }

        return result;
    }
}
