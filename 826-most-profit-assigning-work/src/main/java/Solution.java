public class Solution {
  public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    int maxDifficulty = 0;
    // find maximum difficulty of all job
    for (int diff : difficulty) {
      maxDifficulty = Math.max(maxDifficulty, diff);
    }

    // find max profit if there is duplicate difficulty with different profit
    int[] bestProfit = new int[maxDifficulty + 1];
    for (int i = 0; i < profit.length; i++) {
      bestProfit[difficulty[i]] = Math.max(bestProfit[difficulty[i]], profit[i]);
    }

    // find max profit for range [minDifficulty, difficulty[i]]
    int maxProfit = 0;
    for (int i = 0; i < bestProfit.length; i++) {
      if (bestProfit[i] > maxProfit) {
        maxProfit = bestProfit[i];
      }
      bestProfit[i] = maxProfit;
    }

    // calculate max profit for all worker
    int result = 0;
    for (int w : worker) {
      if (w > maxDifficulty) {
        result += bestProfit[maxDifficulty];
      } else {
        result += bestProfit[w];
      }
    }
    return result;
  }
}
