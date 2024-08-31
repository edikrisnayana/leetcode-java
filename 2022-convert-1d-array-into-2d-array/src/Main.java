import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Object[][] arguments = new Object[3][4];
    arguments[0][0] = new int[]{1, 2, 3, 4};
    arguments[0][1] = 2;
    arguments[0][2] = 2;
    arguments[0][3] = new int[][]{{1, 2}, {3, 4}};
    
    arguments[1][0] = new int[]{1, 2, 3};
    arguments[1][1] = 1;
    arguments[1][2] = 3;
    arguments[1][3] = new int[][]{{1, 2, 3}};
    
    arguments[2][0] = new int[]{1, 2};
    arguments[2][1] = 1;
    arguments[2][2] = 1;
    arguments[2][3] = new int[][]{};
    
    for (int i = 0; i < arguments.length; i++) {
      System.out.printf("Test Case %s:\n", i + 1);
      Solution solution = new Solution();
      int[] original = (int[]) arguments[i][0];
      int m = (int) arguments[i][1];
      int n = (int) arguments[i][2];
      int[][] expected = (int[][]) arguments[i][3];
      System.out.println("input: ");
      printArray(original);
      System.out.println(m);
      System.out.println(n);
      System.out.print("output: ");
      int[][] output = solution.construct2DArray(original, m, n);
      print2DArray(output);
      System.out.print("expected: ");
      print2DArray(expected);
      System.out.println("match: " + match(output, expected));
      System.out.println();
    }
  }
  
  private static boolean match(int[][] arr1, int[][] arr2) {
    if (arr1.length != arr2.length) {
      return false;
    }
    
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i].length != arr2[i].length) {
        return false;
      }
      
      for (int j = 0; j < arr1[i].length; j++) {
        if (arr1[i][j] != arr2[i][j]) {
          return false;
        }
      }
    }
    
    return true;
  }
  
  private static void print2DArray(int[][] arr) {
    List<String> list = new ArrayList<>();
    for (int[] items : arr) {
      list.add(
          "[" + Arrays.stream(items).mapToObj(String::valueOf)
              .collect(Collectors.joining(", ")) + "]"
      );
    }
    System.out.println(
        "[" + String.join(", ", list) + "]"
    );
  }
  
  private static void printArray(int[] arr) {
    System.out.println(
        "[" + Arrays.stream(arr).mapToObj(String::valueOf)
            .collect(Collectors.joining(", ")) + "]"
    );
  }
}