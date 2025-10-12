package com.leetcode.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a polynomial node
 */
public class PolyNode {
  public int coefficient, power;
  public PolyNode next = null;

  public PolyNode() {
  }

  public PolyNode(int x, int y) {
    this.coefficient = x;
    this.power = y;
  }

  public PolyNode(int x, int y, PolyNode next) {
    this.coefficient = x;
    this.power = y;
    this.next = next;
  }

  /**
   * Converts a 2D array representation to a PolyNode linked list
   *
   * @param arr 2D array where each sub-array contains [coefficient, power]
   * @return PolyNode linked list, or null if input is null or empty
   */
  public static PolyNode fromArray(int[][] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }

    PolyNode result = new PolyNode();
    PolyNode node = result;
    for (int[] num : arr) {
      node.next = new PolyNode(num[0], num[1]);
      node = node.next;
    }

    return result.next;
  }

  /**
   * Converts a PolyNode linked list to a 2D array representation
   *
   * @param head Head of the PolyNode linked list
   * @return 2D array where each sub-array contains [coefficient, power]
   */
  public static int[][] toArray(PolyNode head) {
    if (head == null) {
      return new int[0][0];
    }

    List<int[]> list = new ArrayList<>();
    while (head != null) {
      list.add(new int[]{head.coefficient, head.power});
      head = head.next;
    }

    int[][] arr = new int[list.size()][2];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = list.get(i);
    }
    return arr;
  }
}
