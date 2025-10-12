package com.leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node
 */
public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  /**
   * Creates a binary tree from an array representation
   * null values represent missing nodes
   */
  public static TreeNode fromArray(Integer[] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    TreeNode root = new TreeNode(arr[0]);
    queue.add(root);
    int i = 1;
    while (i < arr.length && !queue.isEmpty()) {
      TreeNode parent = queue.poll();
      if (arr[i] != null) {
        parent.left = new TreeNode(arr[i]);
        queue.add(parent.left);
      }
      i++;

      if (arr[i] != null) {
        parent.right = new TreeNode(arr[i]);
        queue.add(parent.right);
      }
      i++;
    }
    return root;
  }

  public static Integer[] toArray(TreeNode root) {
    if (root == null) {
      return new Integer[0];
    }
    List<Integer> list = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      while (size > 0) {
        TreeNode node = queue.poll();
        if (node == null) {
          list.add(null);
        } else {
          list.add(node.val);
          queue.add(node.left);
          queue.add(node.right);
        }
        size--;
      }
    }

    Integer[] arr = list.toArray(Integer[]::new);
    int end = arr.length;
    while (end > 0 && arr[end - 1] == null) {
      end--;
    }
    return Arrays.copyOf(arr, end);
  }

  /**
   * Prints a binary tree in level order
   */
  public static void print(TreeNode root) {
    if (root == null) {
      System.out.println("null");
      return;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      StringBuilder level = new StringBuilder();

      for (int i = 0; i < levelSize; i++) {
        TreeNode node = queue.poll();
        if (node != null) {
          level.append(node.val).append(" ");
          queue.offer(node.left);
          queue.offer(node.right);
        } else {
          level.append("null ");
        }
      }

      System.out.println(level.toString().trim());
    }
  }

  @Override
  public String toString() {
    return String.valueOf(val);
  }
}
