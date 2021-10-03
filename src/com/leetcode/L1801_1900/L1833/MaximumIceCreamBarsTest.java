package com.leetcode.L1801_1900.L1833;

public class MaximumIceCreamBarsTest {
    public static void main(String[] args) {
        MaximumIceCreamBars maximumIceCreamBars = new MaximumIceCreamBars();
        /**
         * 示例 1：
         * 输入：costs = [1,3,2,4,1], coins = 7
         * 输出：4
         * 解释：Tony 可以买下标为 0、1、2、4 的雪糕，总价为 1 + 3 + 2 + 1 = 7
         */
        System.out.println(maximumIceCreamBars.maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
        /**
         * 示例 2：
         * 输入：costs = [10,6,8,7,7,8], coins = 5
         * 输出：0
         * 解释：Tony 没有足够的钱买任何一支雪糕。
         */
        System.out.println(maximumIceCreamBars.maxIceCream(new int[]{10,6,8,7,7,8}, 5));
        /**
         * 示例 3：
         * 输入：costs = [1,6,3,1,2,5], coins = 20
         * 输出：6
         * 解释：Tony 可以买下所有的雪糕，总价为 1 + 6 + 3 + 1 + 2 + 5 = 18 。
         */
        System.out.println(maximumIceCreamBars.maxIceCream(new int[]{1,6,3,1,2,5}, 20));
    }
}
