package com.leetcode.L2501_2600.L2545;

import com.util.ArrayUtil;

public class ExamScoreSorterByKthTest {
    public static void main(String[] args) {
        ExamScoreSorterByKth examScoreSorterByKth = new ExamScoreSorterByKth();
        /*
         * 示例 1：
         * 输入：score = [[10,6,9,1],[7,5,11,2],[4,8,3,15]], k = 2
         * 输出：[[7,5,11,2],[10,6,9,1],[4,8,3,15]]
         * 解释：在上图中，S 表示学生，E 表示考试。
         * - 下标为 1 的学生在第 2 场考试取得的分数为 11 ，这是考试的最高分，所以 TA 需要排在第一。
         * - 下标为 0 的学生在第 2 场考试取得的分数为 9 ，这是考试的第二高分，所以 TA 需要排在第二。
         * - 下标为 2 的学生在第 2 场考试取得的分数为 3 ，这是考试的最低分，所以 TA 需要排在第三。
         */
        System.out.println(ArrayUtil.toString(examScoreSorterByKth.sortTheStudents(new int[][]{{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}}, 2)));
        /*
         * 示例 2：
         * 输入：score = [[3,4],[5,6]], k = 0
         * 输出：[[5,6],[3,4]]
         * 解释：在上图中，S 表示学生，E 表示考试。
         * - 下标为 1 的学生在第 0 场考试取得的分数为 5 ，这是考试的最高分，所以 TA 需要排在第一。
         * - 下标为 0 的学生在第 0 场考试取得的分数为 3 ，这是考试的最低分，所以 TA 需要排在第二。
         */
        System.out.println(ArrayUtil.toString(examScoreSorterByKth.sortTheStudents(new int[][]{{3, 4}, {5, 6}}, 0)));
    }
}
