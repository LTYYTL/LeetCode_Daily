package com.leetcode.L1801_1900.L1893;

public class CheckAllIntegersRangeAreCoveredTest {
    public static void main(String[] args) {
        CheckAllIntegersRangeAreCovered checkAllIntegersRangeAreCovered = new CheckAllIntegersRangeAreCovered();
        /**
         * 示例 1：
         * 输入：ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
         * 输出：true
         * 解释：2 到 5 的每个整数都被覆盖了：
         * - 2 被第一个区间覆盖。
         * - 3 和 4 被第二个区间覆盖。
         * - 5 被第三个区间覆盖。
         */
        System.out.println(checkAllIntegersRangeAreCovered.isCovered(new int[][]{{1, 2}, {3, 4}, {5, 6}}, 2, 5));
        System.out.println(checkAllIntegersRangeAreCovered.isCovered_array(new int[][]{{1, 2}, {3, 4}, {5, 6}}, 2, 5));
        System.out.println(checkAllIntegersRangeAreCovered.isCovered_diff(new int[][]{{1, 2}, {3, 4}, {5, 6}}, 2, 5));
        /**
         * 示例 2：
         * 输入：ranges = [[1,10],[10,20]], left = 21, right = 21
         * 输出：false
         * 解释：21 没有被任何一个区间覆盖。
         */
        System.out.println(checkAllIntegersRangeAreCovered.isCovered(new int[][]{{1, 10}, {10,20}}, 21, 21));
        System.out.println(checkAllIntegersRangeAreCovered.isCovered_array(new int[][]{{1, 10}, {10,20}}, 21, 21));
        System.out.println(checkAllIntegersRangeAreCovered.isCovered_diff(new int[][]{{1, 10}, {10,20}}, 21, 21));
    }
}
