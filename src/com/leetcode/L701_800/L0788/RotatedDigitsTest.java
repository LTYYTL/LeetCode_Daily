package com.leetcode.L701_800.L0788;

public class RotatedDigitsTest {
    public static void main(String[] args) {
        RotatedDigits rotatedDigits = new RotatedDigits();
        /*
          示例：
          输入: 10
          输出: 4
          解释:
          在[1, 10]中有四个好数： 2, 5, 6, 9。
          注意 1 和 10 不是好数, 因为他们在旋转之后不变。
         */
        System.out.println(rotatedDigits.rotatedDigits(10));
    }
}
