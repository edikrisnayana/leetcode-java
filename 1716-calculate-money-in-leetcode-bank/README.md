## 1716. Calculate Money in Leetcode Bank

**Question link:** https://leetcode.com/problems/calculate-money-in-leetcode-bank/

### Solution Approach

The solution uses a mathematical formula to calculate the total money saved:

1. **Complete weeks calculation**: For each complete week (7 days), we calculate the sum using arithmetic progression formula
2. **Remaining days calculation**: For any remaining days after complete weeks, we calculate the sum of the partial week

### Time and Space Complexity

- **Time Complexity:** O(1) - The solution uses mathematical formulas without loops
- **Space Complexity:** O(1) - Only uses a constant amount of extra space