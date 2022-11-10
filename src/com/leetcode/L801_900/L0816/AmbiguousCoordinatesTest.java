package com.leetcode.L801_900.L0816;

public class AmbiguousCoordinatesTest {
    public static void main(String[] args) {
        AmbiguousCoordinates ambiguousCoordinates = new AmbiguousCoordinates();
        /*
          示例 1:
          输入: "(123)"
          输出: ["(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)"]
         */
        System.out.println(ambiguousCoordinates.ambiguousCoordinates("(123)"));
        /*
          示例 2:
          输入: "(00011)"
          输出:  ["(0.001, 1)", "(0, 0.011)"]
          解释:
          0.0, 00, 0001 或 00.01 是不被允许的。
         */
        System.out.println(ambiguousCoordinates.ambiguousCoordinates("(00011)"));
        /*
          示例 3:
          输入: "(0123)"
          输出: ["(0, 123)", "(0, 12.3)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)"]
         */
        System.out.println(ambiguousCoordinates.ambiguousCoordinates("(0123)"));
        /*
         * 示例 4:
         * 输入: "(100)"
         * 输出: [(10, 0)]
         * 解释:
         * 1.0 是不被允许的。
         */
        System.out.println(ambiguousCoordinates.ambiguousCoordinates("(100)"));
    }
}
