## 405. Convert a Number to Hexadecimal

**Question link:** https://leetcode.com/problems/convert-a-number-to-hexadecimal/

### Approach

The solution converts a signed integer to its hexadecimal representation. The key challenge is handling negative numbers correctly.

1. **Handle Negative Numbers**: For negative numbers, convert them to their unsigned equivalent by adding 2^32 to the value. This is done because Java's `int` is signed, but hexadecimal representation should treat it as unsigned.
2. **Base Conversion**: Use repeated division by 16 (modulo operation) to extract each hexadecimal digit from right to left.
3. **Character Mapping**: Map each remainder (0-15) to its corresponding hexadecimal character:
   - 0-9 → '0'-'9'
   - 10-15 → 'a'-'f'
4. **Reverse**: Since digits are collected from right to left, reverse the StringBuilder to get the correct hexadecimal string.

### Complexity
- **Time**: O(1) - The number is always processed as a 32-bit integer, so at most 8 hexadecimal digits are generated
- **Space**: O(1) - Constant space for the StringBuilder (max 8 characters for a 32-bit number)