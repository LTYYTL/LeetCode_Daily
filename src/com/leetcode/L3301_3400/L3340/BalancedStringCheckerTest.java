package com.leetcode.L3301_3400.L3340;

public class BalancedStringCheckerTest {
    public static void main(String[] args) {
        BalancedStringChecker balancedStringChecker = new BalancedStringChecker();
        /*
         * 示例 1：
         * 输入：num = "1234"
         * 输出：false
         * 解释：
         * 偶数下标处的数字之和为 1 + 3 = 4，奇数下标处的数字之和为 2 + 4 = 6。
         * 由于 4 不等于 6，num 不是平衡字符串。
         */
        System.out.println(balancedStringChecker.isBalanced("1234"));
        /*
         * 示例 2：
         * 输入：num = "24123"
         * 输出：true
         * 解释：
         * 偶数下标处的数字之和为 2 + 1 + 3 = 6，奇数下标处的数字之和为 4 + 2 = 6。
         * 由于两者相等，num 是平衡字符串。
         */
        System.out.println(balancedStringChecker.isBalanced("24123"));
    }
}
