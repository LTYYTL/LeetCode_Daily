package com.leetcode.L701_800.L0717;

public class BitCharactersTest {
    public static void main(String[] args) {
        BitCharacters bitCharacters = new BitCharacters();
        /**
         * 示例 1:
         * 输入: bits = [1, 0, 0]
         * 输出: true
         * 解释: 唯一的编码方式是一个两比特字符和一个一比特字符。
         * 所以最后一个字符是一比特字符。
         */
        System.out.println(bitCharacters.isOneBitCharacter(new int[]{1, 0, 0}));
        /**
         * 示例 2:
         * 输入: bits = [1, 1, 1, 0]
         * 输出: false
         * 解释: 唯一的编码方式是两比特字符和两比特字符。
         * 所以最后一个字符不是一比特字符。
         */
        System.out.println(bitCharacters.isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }
}
