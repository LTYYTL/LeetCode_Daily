package com.leetcode.L201_300.L0299;

public class BullsCowsTest {
    public static void main(String[] args) {
        BullsCows bullsCows = new BullsCows();
        /**
         * 示例 1:
         * 输入: secret = "1807", guess = "7810"
         * 输出: "1A3B"
         * 解释: 数字和位置都对（公牛）用 '|' 连接，数字猜对位置不对（奶牛）的采用斜体加粗标识。
         * "1807"
         *   |
         * "7810"
         */
        System.out.println(bullsCows.getHint("1807", "7810"));
        /**
         * 示例 2:
         * 输入: secret = "1123", guess = "0111"
         * 输出: "1A1B"
         * 解释: 数字和位置都对（公牛）用 '|' 连接，数字猜对位置不对（奶牛）的采用斜体加粗标识。
         * "1123"        "1123"
         *   |      or     |
         * "0111"        "0111"
         * 注意，两个不匹配的 1 中，只有一个会算作奶牛（数字猜对位置不对）。通过重新排列非公牛数字，其中仅有一个 1 可以成为公牛数字。
         */
        System.out.println(bullsCows.getHint("1123", "0111"));
        /**
         * 示例 3：
         * 输入：secret = "1", guess = "0"
         * 输出："0A0B"
         */
        System.out.println(bullsCows.getHint("1", "0"));
        /**
         * 示例 4：
         * 输入：secret = "1", guess = "1"
         * 输出："1A0B"
         */
        System.out.println(bullsCows.getHint("1", "1"));
    }
}
