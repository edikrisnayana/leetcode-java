## 2257. Count Unguarded Cells in the Grid

**Question link:** https://leetcode.com/problems/count-unguarded-cells-in-the-grid/

### Approach
1. **Grid Initialization**: Create a 2D grid to track the state of each cell:
   - `0`: Empty unguarded cell
   - `1`: Wall (blocks line of sight)
   - `2`: Guard
   - `-1`: Guarded cell (visible to at least one guard)

2. **Place Walls and Guards**: Mark all wall positions as `1` and guard positions as `2` in the grid.

3. **Simulate Guard Visibility**: For each guard, scan in all four directions (up, down, left, right):
   - Continue moving in each direction until hitting a boundary, wall (`1`), or another guard (`2`)
   - Mark all unvisited empty cells (`0`) in the guard's line of sight as guarded (`-1`)
   - Count these guarded cells as we mark them

4. **Calculate Unguarded Cells**: The result is the total number of cells minus walls, guards, and guarded cells:
   - `total cells - walls.length - guards.length - guarded count`

### Complexity
- **Time**: O(m * n * (m + n)) where m and n are the grid dimensions, as we iterate through all guards and potentially scan the entire grid for each guard
- **Space**: O(m * n) for the grid array to track cell states