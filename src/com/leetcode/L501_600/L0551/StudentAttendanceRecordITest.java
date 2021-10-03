package com.leetcode.L501_600.L0551;

public class StudentAttendanceRecordITest {
    public static void main(String[] args) {
        StudentAttendanceRecordI studentAttendanceRecordI = new StudentAttendanceRecordI();
        /**
         * 示例 1：
         * 输入：s = "PPALLP"
         * 输出：true
         * 解释：学生缺勤次数少于 2 次，且不存在 3 天或以上的连续迟到记录。
         */
        System.out.println(studentAttendanceRecordI.checkRecord("PPALLP"));
        System.out.println(studentAttendanceRecordI.checkRecord_method("PPALLP"));
        /**
         * 示例 2：
         * 输入：s = "PPALLL"
         * 输出：false
         * 解释：学生最后三天连续迟到，所以不满足出勤奖励的条件。
         */
        System.out.println(studentAttendanceRecordI.checkRecord("PPALLL"));
        System.out.println(studentAttendanceRecordI.checkRecord_method("PPALLL"));
    }
}
