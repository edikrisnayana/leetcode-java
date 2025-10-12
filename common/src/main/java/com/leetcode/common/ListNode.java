package com.leetcode.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list node
 */
public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  /**
   * Creates a linked list from an array of values
   */
  public static ListNode fromArray(int[] values) {
    if (values == null || values.length == 0) {
      return null;
    }

    ListNode head = new ListNode(values[0]);
    ListNode current = head;

    for (int i = 1; i < values.length; i++) {
      current.next = new ListNode(values[i]);
      current = current.next;
    }

    return head;
  }

  /**
   * Converts a linked list to an array
   */
  public static int[] toArray(ListNode head) {
    if (head == null) {
      return new int[0];
    }

    // Count nodes
    int count = 0;
    ListNode current = head;
    while (current != null) {
      count++;
      current = current.next;
    }

    // Create array
    int[] result = new int[count];
    current = head;
    int index = 0;
    while (current != null) {
      result[index++] = current.val;
      current = current.next;
    }

    return result;
  }

  /**
   * Converts a linked list 2D to an List 2D
   */
  public static List<List<Integer>> toList(ListNode[] heads) {
    if (heads == null) {
      return new ArrayList<>();
    }

    List<List<Integer>> result = new ArrayList<>();
    for (ListNode head : heads) {
      List<Integer> list = new ArrayList<>();
      while (head != null) {
        list.add(head.val);
        head = head.next;
      }
      result.add(list);
    }
    return result;
  }

  /**
   * Prints a linked list
   */
  public static void print(ListNode head) {
    if (head == null) {
      System.out.println("null");
      return;
    }

    StringBuilder sb = new StringBuilder();
    ListNode current = head;
    while (current != null) {
      sb.append(current.val);
      if (current.next != null) {
        sb.append(" -> ");
      }
      current = current.next;
    }
    System.out.println(sb);
  }

  @Override
  public String toString() {
    return String.valueOf(val);
  }
}
