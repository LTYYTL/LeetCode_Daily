package com.leetcode.L801_900.L0869;

public class ReorderedPower2Test {
    public static void main(String[] args) {
        ReorderedPower2 reorderedPower2 = new ReorderedPower2();
        /*
          示例 1：
          输入：1
          输出：true
         */
        System.out.println(reorderedPower2.reorderedPowerOf2(1));
        System.out.println(reorderedPower2.reorderedPowerOf2_set(1));
        /*
          示例 2：
          输入：10
          输出：false
         */
        System.out.println(reorderedPower2.reorderedPowerOf2(10));
        System.out.println(reorderedPower2.reorderedPowerOf2_set(10));
        /*
          示例 3：
          输入：16
          输出：true
         */
        System.out.println(reorderedPower2.reorderedPowerOf2(16));
        System.out.println(reorderedPower2.reorderedPowerOf2_set(16));
        /*
          示例 4：
          输入：24
          输出：false
         */
        System.out.println(reorderedPower2.reorderedPowerOf2(24));
        System.out.println(reorderedPower2.reorderedPowerOf2_set(24));
        /*
          示例 5：
          输入：46
          输出：true
         */
        System.out.println(reorderedPower2.reorderedPowerOf2(46));
        System.out.println(reorderedPower2.reorderedPowerOf2_set(46));
    }
}
