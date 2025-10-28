## 3354. Make Array Elements Equal to Zero

**Question link:** https://leetcode.com/problems/make-array-elements-equal-to-zero/

### Approach
The solution is based on the observation that we need to find positions where we can split the array into two parts with equal sums, or where the difference between the sums is exactly 1.

### Time Complexity
- **Time**: O(n) where n is the length nums array, due to iterate through the array once to calculate the total sum, then once more to find valid selections.
- **Space**: O(1) only using a few variables to store sums.