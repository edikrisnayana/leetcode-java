public class Solution {
    public int findTheWinner(int n, int k) {
        int prev = 1;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            curr = ((prev + k - 1) % i) + 1;
            prev = curr;
        }

        return curr;
    }
}
