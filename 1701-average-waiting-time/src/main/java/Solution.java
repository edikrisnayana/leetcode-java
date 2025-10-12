public class Solution {
  public double averageWaitingTime(int[][] customers) {
    int startTime = 0;
    double totalWaitingTime = 0;
    for (int[] customer : customers) {
      startTime = (startTime < customer[0] ? customer[0] : startTime) + customer[1];
      totalWaitingTime += (startTime - customer[0]);
    }
    return totalWaitingTime / customers.length;
  }
}
