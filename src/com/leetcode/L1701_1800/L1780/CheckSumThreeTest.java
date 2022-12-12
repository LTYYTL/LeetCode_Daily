package com.leetcode.L1701_1800.L1780;

public class CheckSumThreeTest {
    public static void main(String[] args) {
        CheckSumThree checkSumThree = new CheckSumThree();
        /*
          示例 1：
          输入：n = 12
          输出：true
          解释：12 = 31 + 32
         */
        System.out.println(checkSumThree.checkPowersOfThree(12));
        /*
          示例 2：
          输入：n = 91
          输出：true
          解释：91 = 30 + 32 + 34
         */
        System.out.println(checkSumThree.checkPowersOfThree(91));
        /*
          示例 3：
          输入：n = 21
          输出：false
         */
        System.out.println(checkSumThree.checkPowersOfThree(21));
    }
}
