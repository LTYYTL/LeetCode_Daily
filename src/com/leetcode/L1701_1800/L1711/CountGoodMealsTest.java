package com.leetcode.L1701_1800.L1711;

public class CountGoodMealsTest {
    public static void main(String[] args) {
        CountGoodMeals countGoodMeals = new CountGoodMeals();
        /** * 示例 1：
         * 输入：deliciousness = [1,3,5,7,9]
         * 输出：4
         * 解释：大餐的美味程度组合为 (1,3) 、(1,7) 、(3,5) 和 (7,9) 。
         * 它们各自的美味程度之和分别为 4 、8 、8 和 16 ，都是 2 的幂。
         */
        System.out.println(countGoodMeals.countPairs(new int[]{1, 3, 5, 7, 9}));
        /**
         * 示例 2：
         * 输入：deliciousness = [1,1,1,3,3,3,7]
         * 输出：15
         * 解释：大餐的美味程度组合为 3 种 (1,1) ，9 种 (1,3) ，和 3 种 (1,7) 。
         */
        System.out.println(countGoodMeals.countPairs(new int[]{1,1,1,3,3,3,7}));
    }
}
