import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
  public int robotSim(int[] commands, int[][] obstacles) {
    Map<Integer, List<Integer>> mapX = new HashMap<>();
    Map<Integer, List<Integer>> mapY = new HashMap<>();
    for (int[] obstacle : obstacles) {
      int x = obstacle[0];
      int y = obstacle[1];
      List<Integer> listX = mapX.computeIfAbsent(x, _ -> new ArrayList<>());
      listX.add(y);

      List<Integer> listY = mapY.computeIfAbsent(y, _ -> new ArrayList<>());
      listY.add(x);
    }

    int currX = 0;
    int currY = 0;
    int maxDist = 0;
    int face = 0;

    for (int command : commands) {
      if (command > 0) {
        if (face == 0) {
          List<Integer> listX = mapX.getOrDefault(currX, new ArrayList<>());
          int newY = currY + command;
          int minY = Integer.MAX_VALUE;
          for (int y : listX) {
            if (currY < y && y <= newY && y < minY) {
              minY = y;
            }
          }

          if (minY != Integer.MAX_VALUE) {
            newY = minY - 1;
          }
          currY = newY;
        } else if (face == 1) {
          List<Integer> listY = mapY.getOrDefault(currY, new ArrayList<>());
          int newX = currX + command;
          int minX = Integer.MAX_VALUE;
          for (int x : listY) {
            if (currX < x && x <= newX && x < minX) {
              minX = x;
            }
          }

          if (minX != Integer.MAX_VALUE) {
            newX = minX - 1;
          }
          currX = newX;
        } else if (face == 2) {
          List<Integer> listX = mapX.getOrDefault(currX, new ArrayList<>());
          int newY = currY - command;
          int maxY = Integer.MIN_VALUE;
          for (int y : listX) {
            if (newY <= y && y < currY && y > maxY) {
              maxY = y;
            }
          }

          if (maxY != Integer.MIN_VALUE) {
            newY = maxY + 1;
          }
          currY = newY;
        } else {
          List<Integer> listY = mapY.getOrDefault(currY, new ArrayList<>());
          int newX = currX - command;
          int maxX = Integer.MIN_VALUE;
          for (int x : listY) {
            if (newX <= x && x < currX && x > maxX) {
              maxX = x;
            }
          }

          if (maxX != Integer.MIN_VALUE) {
            newX = maxX + 1;
          }
          currX = newX;
        }

        int dist = (currX * currX) + (currY * currY);
        if (dist > maxDist) {
          maxDist = dist;
        }
      } else if (command == -1) {
        if (face == 0) {
          face = 1;
        } else if (face == 1) {
          face = 2;
        } else if (face == 2) {
          face = 3;
        } else {
          face = 0;
        }
      } else {
        if (face == 0) {
          face = 3;
        } else if (face == 1) {
          face = 0;
        } else if (face == 2) {
          face = 1;
        } else {
          face = 2;
        }
      }
    }

    return maxDist;
  }
}
