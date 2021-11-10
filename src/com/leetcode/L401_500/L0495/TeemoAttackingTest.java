package com.leetcode.L401_500.L0495;

public class TeemoAttackingTest {
    public static void main(String[] args) {
        TeemoAttacking teemoAttacking = new TeemoAttacking();
        /** * 示例 1：
         * 输入：timeSeries = [1,4], duration = 2
         * 输出：4
         * 解释：提莫攻击对艾希的影响如下：
         * - 第 1 秒，提莫攻击艾希并使其立即中毒。中毒状态会维持 2 秒，即第 1 秒和第 2 秒。
         * - 第 4 秒，提莫再次攻击艾希，艾希中毒状态又持续 2 秒，即第 4 秒和第 5 秒。
         * 艾希在第 1、2、4、5 秒处于中毒状态，所以总中毒秒数是 4 。
         */
        System.out.println(teemoAttacking.findPoisonedDuration(new int[]{1, 4}, 2));
        /**
         * 示例 2：
         * 输入：timeSeries = [1,2], duration = 2
         * 输出：3
         * 解释：提莫攻击对艾希的影响如下：
         * - 第 1 秒，提莫攻击艾希并使其立即中毒。中毒状态会维持 2 秒，即第 1 秒和第 2 秒。
         * - 第 2 秒，提莫再次攻击艾希，并重置中毒计时器，艾希中毒状态需要持续 2 秒，即第 2 秒和第 3 秒。
         * 艾希在第 1、2、3 秒处于中毒状态，所以总中毒秒数是 3 。
         */
        System.out.println(teemoAttacking.findPoisonedDuration(new int[]{1, 2}, 2));
    }
}
