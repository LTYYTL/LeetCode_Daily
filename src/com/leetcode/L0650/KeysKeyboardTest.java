package com.leetcode.L0650;

public class KeysKeyboardTest {
    public static void main(String[] args) {
        KeysKeyboard keysKeyboard = new KeysKeyboard();
        /**
         * 示例 1：
         * 输入：3
         * 输出：3
         * 解释：
         * 最初, 只有一个字符 'A'。
         * 第 1 步, 使用 Copy All 操作。
         * 第 2 步, 使用 Paste 操作来获得 'AA'。
         * 第 3 步, 使用 Paste 操作来获得 'AAA'。
         */
        System.out.println(keysKeyboard.minSteps(3));
        /**
         * 示例 2：
         * 输入：n = 1
         * 输出：0
         */
        System.out.println(keysKeyboard.minSteps(1));
    }
}
