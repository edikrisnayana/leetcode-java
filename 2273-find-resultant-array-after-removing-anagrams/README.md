## 2273. Find Resultant Array After Removing Anagrams

**Question link:** https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/

### Approach
The solution uses a character frequency mapping approach:

1. **Character Frequency Mapping**: For each word, create a frequency array of size 26 (for lowercase letters a-z) to count the occurrence of each character.

2. **Anagram Detection**: Two words are anagrams if they have the same character frequency distribution.

3. **Sequential Processing**: Process words from left to right, keeping track of the last non-anagram word's frequency map.

4. **Filtering**: Only keep words that are not anagrams of their immediate previous word.

### Algorithm Steps
1. Create a 2D array `map` to store character frequency maps for each word
2. Initialize the first word's frequency map
3. For each subsequent word:
   - Create its frequency map
   - Compare with the previous non-anagram word's frequency map
   - If they are anagrams, mark current word for removal (set map[i] = null)
   - If not anagrams, keep the current word and update the previous reference
4. Collect all non-null words from the map array

### Time Complexity
- **Time**: O(n × m) where n is the number of words and m is the average length of words
- **Space**: O(n × 26) = O(n) for storing frequency maps
