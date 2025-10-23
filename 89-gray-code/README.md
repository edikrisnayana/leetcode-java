## 89. Gray Code

**Question link:** https://leetcode.com/problems/gray-code/

### Approach
The solution uses an iterative approach to generate Gray codes by building upon previously generated codes:

1. **Initial Setup**: Start with the base cases for n=1: [0, 1]

2. **Iterative Construction**: For each subsequent level, mirror the existing codes and add a new bit:
   - Take the existing codes in reverse order
   - Add a new bit (1 << currentBit) to each reversed code
   - This creates the next level of Gray codes

3. **Lazy Generation**: The solution implements a custom List interface with an iterator that generates codes on-demand, avoiding the need to store all codes in memory at once.

### Key Implementation Details
- **Memory Efficient**: Uses a single array to store all codes
- **Lazy Evaluation**: Codes are generated on-demand through the iterator
- **Bit Manipulation**: Uses bitwise OR to add new bits: `arr[prev] | (1 << currBit)`
- **Reverse Order**: Accesses previous codes in reverse order to maintain Gray code property

### Complexity
- **Time**: O(2^n) where n is the input parameter, as we generate 2^n Gray codes
- **Space**: O(2^n) for storing the Gray codes array