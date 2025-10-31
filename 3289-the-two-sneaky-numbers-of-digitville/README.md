## 3289. The Two Sneaky Numbers of Digitville

**Question link:** https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/

### Approach
The solution uses a mathematical approach based on sum and sum of squares:

1. **Expected Values**: Calculate the expected sum and sum of squares for numbers 0 to n-1 (where n = array length - 2), since the array should contain each number once but has two duplicates.

2. **Actual Values**: Calculate the actual sum and sum of squares from the given array.

3. **Difference Calculation**: The difference between actual and expected values gives us:
   - `a + b = actualSum - expectedSum` (where a and b are the two duplicate numbers)
   - `a² + b² = actualSquaredSum - expectedSquaredSum`

4. **Solving for Duplicates**: Using the identity `(a + b)² = a² + 2ab + b²`, we can derive:
   - `sqrt(2 * (a² + b²) - (a + b)²)` = `|a - b|`
   - Then solve for `a` and `b` using: `a = (sum - diff) / 2` and `b = (sum + diff) / 2`

### Time Complexity
- **Time**: O(n) where n is the length of the nums array, due to iterating through the array once to calculate sums
- **Space**: O(1) only using a constant amount of extra space for variables