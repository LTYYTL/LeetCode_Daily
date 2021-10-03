package com.leetcode.L501_600.L0551;

/**
 * 551. 学生出勤记录 I
 * 给你一个字符串 s 表示一个学生的出勤记录，其中的每个字符用来标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符：
 * 'A'：Absent，缺勤
 * 'L'：Late，迟到
 * 'P'：Present，到场
 * 如果学生能够 同时 满足下面两个条件，则可以获得出勤奖励：
 * 按 总出勤 计，学生缺勤（'A'）严格 少于两天。
 * 学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录。
 * 如果学生可以获得出勤奖励，返回 true ；否则，返回 false 。
 *
 * 示例 1：
 * 输入：s = "PPALLP"
 * 输出：true
 * 解释：学生缺勤次数少于 2 次，且不存在 3 天或以上的连续迟到记录。
 *
 * 示例 2：
 * 输入：s = "PPALLL"
 * 输出：false
 * 解释：学生最后三天连续迟到，所以不满足出勤奖励的条件。
 *
 * 提示：
 * 1 <= s.length <= 1000
 * s[i] 为 'A'、'L' 或 'P'
 */
public class StudentAttendanceRecordI {
    /**
     * 方法：模拟
     * @param s
     * @return
     */
    public boolean checkRecord(String s) {
        //转换成数组
        char[] chars = s.toCharArray();
        //记录缺勤次数
        int A_sum = 0;
        //记录连续迟到次数
        int L_sum = 0;
        //遍历
        for (int i = 0; i < chars.length; i++) {
            //类型
            char c = chars[i];
            //缺勤情况
            if (c == 'A') {
                //缺勤次数增加
                A_sum++;
                //次数大于2次直接返回
                if (A_sum >= 2)
                    return false;
            }
            //迟到次数
            if (c == 'L'){
                //连续迟到次数增加
                L_sum++;
                //连续迟到3次
                if (L_sum >= 3)
                    return false;
            }else//不是连续迟到清0
                L_sum = 0;
        }
        return true;
    }


    /**
     * 方法二：内置方法
     * @param s
     * @return
     */
    public boolean checkRecord_method(String s) {
        return s.indexOf("LLL") < 0 && s.split("A", -1).length <= 2;
    }
}
