## 2125. Number of Laser Beams in a Bank

**Question link:** https://leetcode.com/problems/number-of-laser-beams-in-a-bank/

### Approach

The key insight is that laser beams can only exist between consecutive rows that contain security devices. If there are empty rows (rows with no security devices) between two rows with devices, no beams can pass through.

**Algorithm:**
1. Iterate through each row in the bank
2. Count the number of security devices (`'1'`s) in each row
3. For each row with devices, multiply the count with the count from the previous row with devices
4. Skip rows with no devices (they don't contribute to beam count)
5. Sum up all the beam counts

**Time Complexity:** O(m × n) where m is the number of rows and n is the number of columns
**Space Complexity:** O(1) - only using a few variables
