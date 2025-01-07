package com.leetcode.L3001_3100.L3019;

public class KeyChangeCounterTest {
    public static void main(String[] args) {
        KeyChangeCounter keyChangeCounter = new KeyChangeCounter();
        /*
         * 示例 1：
         * 输入：s = "aAbBcC"
         * 输出：2
         * 解释：
         * 从 s[0] = 'a' 到 s[1] = 'A'，不存在按键变更，因为不计入 caps lock 或 shift 。
         * 从 s[1] = 'A' 到 s[2] = 'b'，按键变更。
         * 从 s[2] = 'b' 到 s[3] = 'B'，不存在按键变更，因为不计入 caps lock 或 shift 。
         * 从 s[3] = 'B' 到 s[4] = 'c'，按键变更。
         * 从 s[4] = 'c' 到 s[5] = 'C'，不存在按键变更，因为不计入 caps lock 或 shift 。
         */
        System.out.println(keyChangeCounter.countKeyChanges("aAbBcC"));
        /*
         * 示例 2：
         * 输入：s = "AaAaAaaA"
         * 输出：0
         * 解释： 不存在按键变更，因为这个过程中只按下字母 'a' 和 'A' ，不需要进行按键变更。
         */
        System.out.println(keyChangeCounter.countKeyChanges("AaAaAaaA"));
    }
}
