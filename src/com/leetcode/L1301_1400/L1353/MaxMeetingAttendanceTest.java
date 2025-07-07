package com.leetcode.L1301_1400.L1353;

public class MaxMeetingAttendanceTest {
    public static void main(String[] args) {
        MaxMeetingAttendance maxMeetingAttendance = new MaxMeetingAttendance();

        /*
         * 示例 1：
         * 输入：events = [[1,2],[2,3],[3,4]]
         * 输出：3
         * 解释：你可以参加所有的三个会议。
         * 安排会议的一种方案如上图。
         * 第 1 天参加第一个会议。
         * 第 2 天参加第二个会议。
         * 第 3 天参加第三个会议。
         */
        System.out.println(maxMeetingAttendance.maxEvents(new int[][]{{1, 2}, {2, 3}, {3, 4}}));
        /**
         * 示例 2：
         * 输入：events= [[1,2],[2,3],[3,4],[1,2]]
         * 输出：4
         */
        System.out.println(maxMeetingAttendance.maxEvents(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 2}}));
    }
}
