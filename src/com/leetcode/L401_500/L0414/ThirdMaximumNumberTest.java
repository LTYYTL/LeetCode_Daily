package com.leetcode.L401_500.L0414;

public class ThirdMaximumNumberTest {
    public static void main(String[] args) {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        /**
         * 示例 1：
         * 输入：[3, 2, 1]
         * 输出：1
         * 解释：第三大的数是 1 。
         */
        System.out.println(thirdMaximumNumber.thirdMax(new int[]{3, 2, 1}));
        System.out.println(thirdMaximumNumber.thirdMax_set(new int[]{3, 2, 1}));
        /**
         * 示例 2：
         * 输入：[1, 2]
         * 输出：2
         * 解释：第三大的数不存在, 所以返回最大的数 2 。
         */
        System.out.println(thirdMaximumNumber.thirdMax(new int[]{2, 1}));
        System.out.println(thirdMaximumNumber.thirdMax_set(new int[]{2, 1}));
        /**
         * 示例 3：
         * 输入：[2, 2, 3, 1]
         * 输出：1
         * 解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
         * 此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1 。
         */
        System.out.println(thirdMaximumNumber.thirdMax(new int[]{3, 2, 1, 2}));
        System.out.println(thirdMaximumNumber.thirdMax_set(new int[]{3, 2, 1, 2}));
    }
}
