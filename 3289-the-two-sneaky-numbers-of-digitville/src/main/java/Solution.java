class Solution {
  public int[] getSneakyNumbers(int[] nums) {
    int n = nums.length - 2;
    int normalSum = (n * (n - 1)) / 2;
    int normalSquaredSum = (n * (n - 1) * (2 * n - 1)) / 6;
    int sum = 0;
    int squaredSum = 0;
    for (int num : nums) {
      sum += num;
      squaredSum += (num * num);
    }

    sum -= normalSum;
    squaredSum -= normalSquaredSum;
    double sqrt = Math.sqrt(2 * squaredSum - sum * sum);
    int num1 = ((int) (sum - sqrt)) / 2;
    int num2 = ((int) (sum + sqrt)) / 2;

    return new int[]{num1, num2};
  }
}