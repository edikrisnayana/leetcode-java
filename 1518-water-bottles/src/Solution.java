public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = 0;
        int emptyBottles = 0;
        while (numBottles + emptyBottles >= numExchange) {
            result += numBottles;
            int drinkableBottles = (numBottles + emptyBottles) / numExchange;
            emptyBottles = (numBottles + emptyBottles) % numExchange;
            numBottles = drinkableBottles;
        }
        return result + numBottles;
    }
}
