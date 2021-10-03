package com.leetcode.L1801_1900.L1893;

import java.util.HashSet;
import java.util.Set;

/**
 * 1893. 检查是否区域内所有整数都被覆盖
 * 给你一个二维整数数组 ranges 和两个整数 left 和 right 。每个 ranges[i] = [starti, endi] 表示一个从 starti 到 endi 的 闭区间 。
 * 如果闭区间 [left, right] 内每个整数都被 ranges 中 至少一个 区间覆盖，那么请你返回 true ，否则返回 false 。
 * 已知区间 ranges[i] = [starti, endi] ，如果整数 x 满足 starti <= x <= endi ，那么我们称整数x 被覆盖了。
 *
 * 示例 1：
 * 输入：ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
 * 输出：true
 * 解释：2 到 5 的每个整数都被覆盖了：
 * - 2 被第一个区间覆盖。
 * - 3 和 4 被第二个区间覆盖。
 * - 5 被第三个区间覆盖。
 *
 * 示例 2：
 * 输入：ranges = [[1,10],[10,20]], left = 21, right = 21
 * 输出：false
 * 解释：21 没有被任何一个区间覆盖。
 *
 * 提示：
 * 1 <= ranges.length <= 50
 * 1 <= starti <= endi <= 50
 * 1 <= left <= right <= 50
 */
public class CheckAllIntegersRangeAreCovered {
    /**
     * 方法一：set集合
     * @param ranges
     * @param left
     * @param right
     * @return
     */
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> set = new HashSet<>();
        //将区间内所有元素存入set中
        for (int[] range : ranges) {
            int start = range[0];
            int end = range[1];
            for (int i = start; i <= end; i++) {
                set.add(i);
            }
        }

        //判断left~right之间的数是否在set中存在
        for (int i = left; i <= right; i++) {
            if (!set.contains(i))
                return false;
        }
        return true;
    }

    /**
     * 方法二：数组
     * @param ranges
     * @param left
     * @param right
     * @return
     */
    public boolean isCovered_array(int[][] ranges, int left, int right) {
        boolean[] arr = new boolean[51];
        //用数组代替set
        for (int[] range : ranges) {
            int start = range[0];
            int end = range[1];
            for (int i = start; i <= end; i++) {
                arr[i] = true;
            }
        }

        for (int i = left; i <= right; i++) {
            if (!arr[i])
                return false;
        }
        return true;
    }

    /**
     * 方法三：差分数组
     * @param ranges
     * @param left
     * @param right
     * @return
     */
    public boolean isCovered_diff(int[][] ranges, int left, int right) {
        int[] covered = new int[52];
        for(int[] r : ranges) {
            covered[r[0]]++;
            covered[r[1] + 1]--;
        }

        // 这里更新数组 如果没有被覆盖到的位置更新完以后还会是0
        for(int i = 1; i < 52; i++) {
            covered[i] += covered[i - 1];
        }

        // 最后判断
        for(int i = left; i <= right; i++) {
            if(covered[i] == 0) return false;
        }

        return true;
    }

}
