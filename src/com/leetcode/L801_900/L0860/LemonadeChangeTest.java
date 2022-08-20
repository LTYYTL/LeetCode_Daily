package com.leetcode.L801_900.L0860;

public class LemonadeChangeTest {
    public static void main(String[] args) {
        LemonadeChange lemonadeChange = new LemonadeChange();
        /* 示例 1：
         输入：[5,5,5,10,20]
         输出：true
         */
        System.out.println(lemonadeChange.lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        /*
          示例 2：
          输入：[5,5,10]
          输出：true
         */
        System.out.println(lemonadeChange.lemonadeChange(new int[]{5, 5, 10}));
        /*
          示例 3：
          输入：[10,10]
          输出：false
         */
        System.out.println(lemonadeChange.lemonadeChange(new int[]{10, 10}));
        /*
          示例 4：
          输入：[5,5,10,10,20]
          输出：false
         */
        System.out.println(lemonadeChange.lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }
}
