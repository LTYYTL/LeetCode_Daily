package com.leetcode.L1301_1400.L1353;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 1353. 最多可以参加的会议数目
 * 给你一个数组 events，其中 events[i] = [startDayi, endDayi] ，表示会议 i 开始于 startDayi ，结束于 endDayi 。
 * 你可以在满足 startDayi <= d <= endDayi 中的任意一天 d 参加会议 i 。在任意一天 d 中只能参加一场会议。
 * 请你返回你可以参加的 最大 会议数目。
 *
 * 示例 1：
 * 输入：events = [[1,2],[2,3],[3,4]]
 * 输出：3
 * 解释：你可以参加所有的三个会议。
 * 安排会议的一种方案如上图。
 * 第 1 天参加第一个会议。
 * 第 2 天参加第二个会议。
 * 第 3 天参加第三个会议。
 *
 * 示例 2：
 * 输入：events= [[1,2],[2,3],[3,4],[1,2]]
 * 输出：4
 *
 * 提示：
 * 1 <= events.length <= 105
 * events[i].length == 2
 * 1 <= startDayi <= endDayi <= 105
 */
public class MaxMeetingAttendance {
    public int maxEvents(int[][] events) {
        // 按照开始时间排序
        Arrays.sort(events, (a, b) -> a[0]- b[0]);

        // 记录结束时间
        PriorityQueue<Integer> deep = new PriorityQueue<>();
        // 当前天数
        int day = 1;
        // 结果
        int res = 0;
        // 索引
        int index = 0;
        while (index < events.length || !deep.isEmpty()){
            // 不晚于当前天数的会议
            while (index < events.length && events[index][0] <= day){
                deep.add(events[index++][1]);
            }
            // 会议结束时间小于当前时间
            while (!deep.isEmpty() && deep.peek() < day){
                deep.poll();
            }

            if (!deep.isEmpty()){
                res++;
                deep.poll();
            }
            day++;
        }
        return res;
    }
}
