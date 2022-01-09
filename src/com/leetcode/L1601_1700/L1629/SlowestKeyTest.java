package com.leetcode.L1601_1700.L1629;

public class SlowestKeyTest {
    public static void main(String[] args) {
        SlowestKey slowestKey = new SlowestKey();
        /**
         * 示例 1：
         * 输入：releaseTimes = [9,29,49,50], keysPressed = "cbcd"
         * 输出："c"
         * 解释：按键顺序和持续时间如下：
         * 按下 'c' ，持续时间 9（时间 0 按下，时间 9 松开）
         * 按下 'b' ，持续时间 29 - 9 = 20（松开上一个键的时间 9 按下，时间 29 松开）
         * 按下 'c' ，持续时间 49 - 29 = 20（松开上一个键的时间 29 按下，时间 49 松开）
         * 按下 'd' ，持续时间 50 - 49 = 1（松开上一个键的时间 49 按下，时间 50 松开）
         * 按键持续时间最长的键是 'b' 和 'c'（第二次按下时），持续时间都是 20
         * 'c' 按字母顺序排列比 'b' 大，所以答案是 'c'
         */
        System.out.println(slowestKey.slowestKey(new int[]{9, 29, 49, 50}, "cbcd"));
        /**
         * 示例 2：
         * 输入：releaseTimes = [12,23,36,46,62], keysPressed = "spuda"
         * 输出："a"
         * 解释：按键顺序和持续时间如下：
         * 按下 's' ，持续时间 12
         * 按下 'p' ，持续时间 23 - 12 = 11
         * 按下 'u' ，持续时间 36 - 23 = 13
         * 按下 'd' ，持续时间 46 - 36 = 10
         * 按下 'a' ，持续时间 62 - 46 = 16
         * 按键持续时间最长的键是 'a' ，持续时间 16
         */
        System.out.println(slowestKey.slowestKey(new int[]{12,23,36,46,62}, "spuda"));
    }
}
