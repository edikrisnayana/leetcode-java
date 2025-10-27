class Solution {
  public int numberOfBeams(String[] bank) {
    int count = 0;
    int prev = 0;
    for (String row : bank) {
      int laser = laserCount(row);
      count += (prev * laser);
      if (laser != 0) {
        prev = laser;
      }
    }
    return count;
  }

  private int laserCount(String row) {
    int count = 0;
    for (char c : row.toCharArray()) {
      count += (c - '0');
    }
    return count;
  }
}