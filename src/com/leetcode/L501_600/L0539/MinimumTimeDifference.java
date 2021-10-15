package com.leetcode.L501_600.L0539;

import java.util.Arrays;
import java.util.List;

/**
 * 539. 最小时间差
 * 给定一个 24 小时制（小时:分钟 "HH:MM"）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。
 *
 * 示例 1：
 * 输入：timePoints = ["23:59","00:00"]
 * 输出：1
 *
 * 示例 2：
 * 输入：timePoints = ["00:00","23:59","00:00"]
 * 输出：0
 *
 * 提示：
 * 2 <= timePoints <= 2 * 104
 * timePoints[i] 格式为 "HH:MM"
 */
public class MinimumTimeDifference {
    /**
     * 方法：排序
     * @param timePoints
     * @return
     */
    public int findMinDifference(List<String> timePoints) {
        // 一天有 1440 分钟，如果 timePoints >= 1440 则表示有相等的时间，时间差为 0
        if (timePoints.size() < 2 || timePoints.size() >= 1440) {
            return 0;
        }
        //存储时间
        int[] time = new int[timePoints.size()];
        //转换成分钟
        for (int i = 0; i < timePoints.size(); i++) {
            int h = Integer.parseInt(timePoints.get(i).substring(0,2));
            int m = Integer.parseInt(timePoints.get(i).substring(3,5));
            int x = h * 60 + m;
            time[i] = x;
        }
        //排序
        Arrays.sort(time);

        int res = Integer.MAX_VALUE;
        for (int i = 1; i < time.length; i++) {
            int x = time[i-1];
            int y = time[i];
            res = Math.min(res,y-x);
            if (res == 0)
                return 0;
        }

        return Math.min(res,1440- time[time.length-1] + time[0]);
    }
}
