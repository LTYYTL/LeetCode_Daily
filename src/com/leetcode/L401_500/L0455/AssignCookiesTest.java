package com.leetcode.L401_500.L0455;

public class AssignCookiesTest {
    public static void main(String[] args) {
        AssignCookies assignCookies = new AssignCookies();
        /** * 示例 1:
         * 输入: g = [1,2,3], s = [1,1]
         * 输出: 1
         * 解释:
         * 你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
         * 虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
         * 所以你应该输出1。
         */
        System.out.println(assignCookies.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        /**
         * 示例 2:
         * 输入: g = [1,2], s = [1,2,3]
         * 输出: 2
         * 解释:
         * 你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
         * 你拥有的饼干数量和尺寸都足以让所有孩子满足。
         * 所以你应该输出2.
         */
        System.out.println(assignCookies.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }
}
