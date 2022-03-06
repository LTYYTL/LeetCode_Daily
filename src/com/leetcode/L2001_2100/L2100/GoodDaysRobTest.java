package com.leetcode.L2001_2100.L2100;

public class GoodDaysRobTest {
    public static void main(String[] args) {
        GoodDaysRob goodDaysRob = new GoodDaysRob();
        /**
         * 示例 1：
         * 输入：security = [5,3,3,3,5,6,2], time = 2
         * 输出：[2,3]
         * 解释：
         * 第 2 天，我们有 security[0] >= security[1] >= security[2] <= security[3] <= security[4] 。
         * 第 3 天，我们有 security[1] >= security[2] >= security[3] <= security[4] <= security[5] 。
         * 没有其他日子符合这个条件，所以日子 2 和 3 是适合打劫银行的日子。
         */
        System.out.println(goodDaysRob.goodDaysToRobBank(new int[]{5, 3, 3, 3, 5, 6, 2}, 2));
        /**
         * 示例 2：
         * 输入：security = [1,1,1,1,1], time = 0
         * 输出：[0,1,2,3,4]
         * 解释：
         * 因为 time 等于 0 ，所以每一天都是适合打劫银行的日子，所以返回每一天。
         */
        System.out.println(goodDaysRob.goodDaysToRobBank(new int[]{1,1,1,1,1}, 0));
        /**
         * 示例 3：
         * 输入：security = [1,2,3,4,5,6], time = 2
         * 输出：[]
         * 解释：
         * 没有任何一天的前 2 天警卫数目是非递增的。
         * 所以没有适合打劫银行的日子，返回空数组。
         */
        System.out.println(goodDaysRob.goodDaysToRobBank(new int[]{1,2,3,4,5,}, 2));
        /**
         * 示例 4：
         * 输入：security = [1], time = 5
         * 输出：[]
         * 解释：
         * 没有日子前面和后面有 5 天时间。
         * 所以没有适合打劫银行的日子，返回空数组。
         */
        System.out.println(goodDaysRob.goodDaysToRobBank(new int[]{1}, 5));
    }
}
