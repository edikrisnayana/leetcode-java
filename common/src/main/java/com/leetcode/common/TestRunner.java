package com.leetcode.common;

import java.util.function.Function;

/**
 * Utility class for running test cases
 */
public class TestRunner {

  /**
   * Runs test cases for a solution
   */
  public static <T, R> void runTests(Function<T, R> solution, TestCase<T, R>[] testCases) {
    for (int i = 0; i < testCases.length; i++) {
      TestCase<T, R> testCase = testCases[i];
      System.out.printf("Test Case %d:\n", i + 1);
      System.out.println("Input: " + testCase.input);

      R result = solution.apply(testCase.input);
      System.out.println("Output: " + result);
      System.out.println("Expected: " + testCase.expected);
      System.out.println("Passed: " + testCase.expected.equals(result));
      System.out.println();
    }
  }

  /**
   * Test case data structure
   */
  public static class TestCase<T, R> {
    public final T input;
    public final R expected;

    public TestCase(T input, R expected) {
      this.input = input;
      this.expected = expected;
    }
  }
}
