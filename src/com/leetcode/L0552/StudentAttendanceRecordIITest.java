package com.leetcode.L0552;

public class StudentAttendanceRecordIITest {
    public static void main(String[] args) {
        StudentAttendanceRecordII studentAttendanceRecordII = new StudentAttendanceRecordII();
        /**
         * 示例 1：
         * 输入：n = 2
         * 输出：8
         * 解释：
         * 有 8 种长度为 2 的记录将被视为可奖励：
         * "PP" , "AP", "PA", "LP", "PL", "AL", "LA", "LL"
         * 只有"AA"不会被视为可奖励，因为缺勤次数为 2 次（需要少于 2 次）。
         */
        System.out.println(studentAttendanceRecordII.checkRecord(2));
        /**
         * 示例 2：
         * 输入：n = 1
         * 输出：3
         */
        System.out.println(studentAttendanceRecordII.checkRecord(1));
        /**
         * 示例 3：
         * 输入：n = 10101
         * 输出：183236316
         */
        System.out.println(studentAttendanceRecordII.checkRecord(10101));
    }
}
