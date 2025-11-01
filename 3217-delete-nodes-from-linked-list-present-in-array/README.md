## 3217. Delete Nodes From Linked List Present in Array

**Question link:** https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/

### Approach
1. **Find Maximum Value**: First, find the maximum value in the `nums` array to determine the size of the boolean array needed for efficient lookup.
2. **Create Boolean Set**: Create a boolean array where `set[i]` is `true` if value `i` exists in the `nums` array. This allows O(1) lookup time to check if a node's value should be deleted.
3. **Dummy Node Pattern**: Use a dummy node at the beginning to simplify deletion logic, especially when the head node needs to be removed.
4. **Iterate and Delete**: Traverse the linked list:
   - If a node's value is within the valid range (`<= max`) and exists in the set, skip it by connecting the previous node to the next node
   - Otherwise, move the current pointer forward to keep the node

### Complexity
- **Time**: O(n + m) where n is the length of the linked list and m is the length of the nums array, as we iterate through both once
- **Space**: O(n) where n is the maximum value in nums array, for the boolean set array