public class Solution {
    public int minOperations(String[] logs) {
        int result = 0;
        for (String log : logs) {
            result = result + add(log, result);
        }
        return result;
    }

    private int add(String log, int result) {
        return (log.charAt(1) == '.' ? (result == 0 ? 0 : -1) : (log.charAt(0) != '.' ? 1 : 0));
    }
}
