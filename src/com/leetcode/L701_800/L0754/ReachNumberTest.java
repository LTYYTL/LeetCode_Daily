package com.leetcode.L701_800.L0754;

public class ReachNumberTest {
    public static void main(String[] args) {
        ReachNumber reachNumber = new ReachNumber();
        /*
          示例 1:
          输入: target = 2
          输出: 3
          解释:
          第一次移动，从 0 到 1 。
          第二次移动，从 1 到 -1 。
          第三次移动，从 -1 到 2 。
         */
        System.out.println(reachNumber.reachNumber(2));
        /*
          示例 2:
          输入: target = 3
          输出: 2
          解释:
          第一次移动，从 0 到 1 。
          第二次移动，从 1 到 3 。
         */
        System.out.println(reachNumber.reachNumber(3));
    }
}
