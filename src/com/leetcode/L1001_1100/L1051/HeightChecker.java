package com.leetcode.L1001_1100.L1051;

import java.util.Arrays;

/**
 * 1051. 高度检查器
 * 学校打算为全体学生拍一张年度纪念照。根据要求，学生需要按照 非递减 的高度顺序排成一行。
 * 排序后的高度情况用整数数组 expected 表示，其中 expected[i] 是预计排在这一行中第 i 位的学生的高度（下标从 0 开始）。
 * 给你一个整数数组 heights ，表示 当前学生站位 的高度情况。heights[i] 是这一行中第 i 位学生的高度（下标从 0 开始）。
 * 返回满足 heights[i] != expected[i] 的 下标数量 。
 * <p>
 * 示例：
 * 输入：heights = [1,1,4,2,1,3]
 * 输出：3
 * 解释：
 * 高度：[1,1,4,2,1,3]
 * 预期：[1,1,1,2,3,4]
 * 下标 2 、4 、5 处的学生高度不匹配。
 * <p>
 * 示例 2：
 * 输入：heights = [5,1,2,3,4]
 * 输出：5
 * 解释：
 * 高度：[5,1,2,3,4]
 * 预期：[1,2,3,4,5]
 * 所有下标的对应学生高度都不匹配。
 * <p>
 * 示例 3：
 * 输入：heights = [1,2,3,4,5]
 * 输出：0
 * 解释：
 * 高度：[1,2,3,4,5]
 * 预期：[1,2,3,4,5]
 * 所有下标的对应学生高度都匹配。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 */
public class HeightChecker {
    /**
     * 方法：排序
     *
     * @param heights
     * @return
     */
    public int heightChecker(int[] heights) {
        //复制
        int[] copy = Arrays.copyOf(heights, heights.length);
        //排序
        Arrays.sort(copy);
        //结果
        int ans = 0;
        //遍历
        for (int i = 0; i < heights.length; i++) {
            //不一样
            if (heights[i] != copy[i])
                ans++;
        }
        return ans;
    }
}
