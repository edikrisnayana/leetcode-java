## 1526. Minimum Number of Increments on Subarrays to Form a Target Array

**Question link:** https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/

### Approach
We observe that incrementing a subarray can be seen as building the target from left to right. The minimal number of operations equals the sum of all positive increases between consecutive elements:
1. Initialize the answer with `target[0]` because we need that many operations to raise the first element from 0 to `target[0]`.
2. For each `i > 0`, if `target[i] > target[i-1]`, we must perform `target[i] - target[i-1]` additional operations to raise the suffix starting at `i` to the higher level.
3. Sum these positive differences to obtain the minimal operations.

This works because any increase requires starting new increment runs, while decreases or equal values require no extra operations beyond those already applied to previous positions.

### Complexity
- **Time**: O(n) - Single pass over the array
- **Space**: O(1) - Constant extra space