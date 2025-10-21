## 401. Binary Watch

**Question link:** https://leetcode.com/problems/binary-watch/

### Approach
The solution uses backtracking to generate all possible valid times on a binary watch:

1. **Binary Watch Representation**: A binary watch has 4 LEDs for hours (0-11) and 6 LEDs for minutes (0-59). Each LED represents a power of 2.

2. **Backtracking Strategy**: Use backtracking to try all possible combinations of turning on exactly `turnedOn` LEDs.

3. **Position Mapping**: Map positions 0-5 to minutes (values 1, 2, 4, 8, 16, 32) and positions 6-9 to hours (values 1, 2, 4, 8).

4. **Validation**: At each step, check if the current time configuration is valid (hours < 12, minutes < 60).

### Algorithm Steps
1. Initialize result list and clock array to track hours and minutes
2. Use backtracking to try all combinations:
   - For each position from current position to 9
   - Calculate the value to add (1 << (i % 6) for minutes, 1 << (i % 6) for hours)
   - Add the value to the appropriate clock component (hours or minutes)
   - Check if the configuration is valid
   - If valid, recursively try the next position with one less LED to turn on
   - Backtrack by removing the value
3. When all LEDs are turned on (on == 0), format the time and add to results
4. Format the time as "H:MM" with proper zero-padding for minutes

### Time Complexity
- **Time**: O(2^10) = O(1024) in the worst case, but much better in practice due to early pruning
- **Space**: O(1) for the recursion stack and result storage (excluding the output list)