package com.leetcode.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Utility class for common array operations used in LeetCode problems
 */
public class ListUtils {

  /**
   * Prints an array in the format [1, 2, 3]
   */
  public static <T> void print(List<T> list) {
    List<String> stringList = list.stream().map(Object::toString).toList();
    System.out.println(
        "[" + String.join(", ", stringList) + "]"
    );
  }

  public static <T> void print2D(List<List<T>> lists) {
    List<String> list = new ArrayList<>();
    for (List<T> items : lists) {
      list.add(
          "[" + items.stream().map(Object::toString)
              .collect(Collectors.joining(", ")) + "]"
      );
    }
    System.out.println(
        "[" + String.join(", ", list) + "]"
    );
  }

  public static <T> List<T> fromArray(T[] arr) {
    List<T> result = new ArrayList<>();
    Collections.addAll(result, arr);
    return result;
  }

  public static <T> List<List<T>> fromArray2D(T[][] arr) {
    List<List<T>> result = new ArrayList<>();
    for (T[] arrays : arr) {
      List<T> list = new ArrayList<>();
      Collections.addAll(list, arrays);
      result.add(list);
    }
    return result;
  }

  public static List<List<Integer>> fromArray2D(int[][] arr) {
    List<List<Integer>> result = new ArrayList<>();
    for (int[] arrays : arr) {
      List<Integer> list = new ArrayList<>();
      for (int val : arrays) {
        list.add(val);
      }
      result.add(list);
    }
    return result;
  }

  public static int[] toArray(List<Integer> list) {
    int[] result = new int[list.size()];
    int index = 0;
    for (int num : list) {
      result[index++] = num;
    }
    return result;
  }

  public static <T> T[] toArrayObject(List<T> list) {
    T[] result = (T[]) new Object[list.size()];
    int index = 0;
    for (T num : list) {
      result[index++] = num;
    }
    return result;
  }

  /**
   * Checks if two List 2D contain the same elements
   */
  public static <T extends Comparable<T>> boolean match2D(List<List<T>> lists1, List<List<T>> lists2) {
    if (lists1.size() != lists2.size()) {
      return false;
    }

    for (int i = 0; i < lists1.size(); i++) {
      List<T> list1 = lists1.get(i);
      List<T> list2 = lists2.get(i);
      boolean match = match(list1, list2);
      if (!match) {
        return false;
      }
    }

    return true;
  }

  /**
   * Checks if two List contain the same elements
   */
  public static <T extends Comparable<T>> boolean match(List<T> list1, List<T> list2) {
    if (list1.size() != list2.size()) {
      return false;
    }

    for (int j = 0; j < list1.size(); j++) {
      if (!Objects.equals(list1.get(j), list2.get(j))) {
        return false;
      }
    }

    return true;
  }
}
