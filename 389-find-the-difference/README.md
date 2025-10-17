## 389. Find the Difference

**Question link:** https://leetcode.com/problems/find-the-difference/

### Approach
The solution uses the XOR (exclusive OR) bitwise operation to find the extra character:

1. **XOR Property**: XOR has the property that `a ^ a = 0` and `a ^ 0 = a`. This means if we XOR all characters from both strings, characters that appear in both strings will cancel out, leaving only the extra character.

2. **Character Processing**: Process characters from both strings simultaneously, XORing each character with the running result.

3. **Extra Character**: Since string `t` has one extra character compared to string `s`, XORing all characters will result in the extra character.

### Algorithm Steps
1. Convert both strings to character arrays for easier indexing
2. Initialize a variable `extra` to store the XOR result
3. Iterate through the length of string `s`:
   - XOR the current character from `s` with `extra`
   - XOR the current character from `t` with `extra`
4. XOR the last character from `t` (which is the extra character) with `extra`
5. Return the final XOR result as a character

### Time Complexity
- **Time**: O(n) where n is the length of string `s`
- **Space**: O(1) for storing the XOR result and character arrays
