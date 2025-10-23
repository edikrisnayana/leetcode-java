## 3461. Check If Digits Are Equal in String After Operations I

**Question link:** https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/

### Approach
The solution uses a recursive approach to simulate the operations:

1. **String to Array Conversion**: Convert the input string to an integer array for easier calculation.

2. **Recursive Operations**: At each step, replace adjacent pairs with their sum modulo 10, reducing the array length by 1.

3. **Base Case**: When the array length becomes 2, check if both digits are equal.

4. **Recursive Case**: For arrays longer than 2, perform the operation on all adjacent pairs and recursively check the resulting array.

### Time Complexity
- **Time**: O(n²) where n is the length of the string, due to the recursive operations reducing array length by 1 each time
- **Space**: O(n) for the recursion stack and array storage