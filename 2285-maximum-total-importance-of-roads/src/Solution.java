public class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] arr = new int[n];
        for (int[] road : roads) {
            arr[road[0]]++;
            arr[road[1]]++;
        }

        int[] count = new int[n];
        for (int cnt : arr) {
            count[cnt]++;
        }

        long result = 0;
        long val = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < count[i]; j++){
                result += (i * val++);
            }
        }

        return result;
    }
}
