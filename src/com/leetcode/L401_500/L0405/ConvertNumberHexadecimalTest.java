package com.leetcode.L401_500.L0405;

public class ConvertNumberHexadecimalTest {
    public static void main(String[] args) {
        ConvertNumberHexadecimal convertNumberHexadecimal = new ConvertNumberHexadecimal();
        /*
          示例 1：
          输入:
          26
          输出:
          "1a"
         */
        System.out.println(convertNumberHexadecimal.toHex(26));
        /*
          示例 2：
          输入:
          -1
          输出:
          "ffffffff"
         */
        System.out.println(convertNumberHexadecimal.toHex(-1));
    }
}
