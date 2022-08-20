package com.leetcode.L301_400.L0326;

public class PowerThreeTest {
    public static void main(String[] args) {
        PowerThree powerThree = new PowerThree();
        /*
          示例 1：
          输入：n = 27
          输出：true
         */
        System.out.println(powerThree.isPowerOfThree(27));
        System.out.println(powerThree.isPowerOfThree_math(27));
        /*
          示例 2：
          输入：n = 0
          输出：false
         */
        System.out.println(powerThree.isPowerOfThree(0));
        System.out.println(powerThree.isPowerOfThree_math(0));
        /*
          示例 3：
          输入：n = 9
          输出：true
         */
        System.out.println(powerThree.isPowerOfThree(9));
        System.out.println(powerThree.isPowerOfThree_math(9));
        /*
          示例 4：
          输入：n = 45
          输出：false
         */
        System.out.println(powerThree.isPowerOfThree(45));
        System.out.println(powerThree.isPowerOfThree_math(45));
    }
}
