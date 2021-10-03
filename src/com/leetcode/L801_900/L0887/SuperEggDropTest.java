package com.leetcode.L801_900.L0887;

public class SuperEggDropTest {
    public static void main(String[] args) {
        SuperEggDrop superEggDrop = new SuperEggDrop();
        /**
         * 示例 1：
         * 输入：k = 1, n = 2
         * 输出：2
         * 解释：
         * 鸡蛋从 1 楼掉落。如果它碎了，肯定能得出 f = 0 。
         * 否则，鸡蛋从 2 楼掉落。如果它碎了，肯定能得出 f = 1 。
         * 如果它没碎，那么肯定能得出 f = 2 。
         * 因此，在最坏的情况下我们需要移动 2 次以确定 f 是多少。
         */
        System.out.println(superEggDrop.superEggDrop(1, 2));
        /**
         * 示例 2：
         * 输入：k = 2, n = 6
         * 输出：3
         */
        System.out.println(superEggDrop.superEggDrop(2, 6));
        /**
         * 示例 3：
         * 输入：k = 3, n = 14
         * 输出：4
         */
        System.out.println(superEggDrop.superEggDrop(3, 14));
    }
}
