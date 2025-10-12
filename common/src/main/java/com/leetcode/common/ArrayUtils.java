package com.leetcode.common;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Utility class for common array operations used in LeetCode problems
 */
public class ArrayUtils {

  /**
   * Prints an array in the format [1, 2, 3]
   */
  public static void print(int[] arr) {
    System.out.println(
        "[" + Arrays.stream(arr).mapToObj(String::valueOf)
            .collect(Collectors.joining(", ")) + "]"
    );
  }

  public static <T> void print(T[] arr) {
    System.out.println(
        "[" + Arrays.stream(arr).map(Object::toString)
            .collect(Collectors.joining(", ")) + "]"
    );
  }

  /**
   * Prints a 2D array
   */
  public static void print(int[][] arr) {
    if (arr == null) {
      System.out.println("null");
      return;
    }

    System.out.println("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print("  ");
      print(arr[i]);
    }
    System.out.println("]");
  }

  /**
   * Checks if two arrays contain the same elements
   */
  public static <T extends Comparable<T>> boolean match(T[] a, T[] b) {
    if (a == null && b == null) return true;
    if (a == null || b == null) return false;
    if (a.length != b.length) return false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Checks if two primitive int arrays contain the same elements
   */
  public static boolean match(int[] a, int[] b) {
    if (a == null && b == null) return true;
    if (a == null || b == null) return false;
    if (a.length != b.length) return false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Checks if two 2D int arrays contain the same elements
   */
  public static boolean match(int[][] a, int[][] b) {
    if (a == null && b == null) return true;
    if (a == null || b == null) return false;
    if (a.length != b.length) return false;

    for (int i = 0; i < a.length; i++) {
      if (a[i].length != b[i].length) {
        return false;
      }

      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] != b[i][j]) {
          return false;
        }
      }
    }
    return true;
  }
}
