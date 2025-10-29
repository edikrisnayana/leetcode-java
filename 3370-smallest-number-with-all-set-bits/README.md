## 3370. Smallest Number With All Set Bits

**Question link:** https://leetcode.com/problems/smallest-number-with-all-set-bits/

### Approach
The solution uses a mathematical approach to construct the smallest number set bits with length same with `n`:

1. **Binary Decomposition**: Process `n` by repeatedly dividing by 2, which effectively counts the number of set bits needed
2. **Iterative Construction**: For each bit position, add `2^pow` to the result

### Complexity
- **Time**: O(log n) where n is the input number, as we process each bit position
- **Space**: O(1) constant space for variables