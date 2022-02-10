package com.leetcode.L1901_2000.L1984;

public class MinKScoresTest {
    public static void main(String[] args) {
        MinKScores minKScores = new MinKScores();
        /**
         * 示例 1：
         * 输入：nums = [90], k = 1
         * 输出：0
         * 解释：选出 1 名学生的分数，仅有 1 种方法：
         * - [90] 最高分和最低分之间的差值是 90 - 90 = 0
         * 可能的最小差值是 0
         */
        System.out.println(minKScores.minimumDifference(new int[]{90}, 1));
        /**
         * 示例 2
         * 输入：nums = [9,4,1,7], k = 2
         * 输出：2
         * 解释：选出 2 名学生的分数，有 6 种方法：
         * - [9,4,1,7] 最高分和最低分之间的差值是 9 - 4 = 5
         * - [9,4,1,7] 最高分和最低分之间的差值是 9 - 1 = 8
         * - [9,4,1,7] 最高分和最低分之间的差值是 9 - 7 = 2
         * - [9,4,1,7] 最高分和最低分之间的差值是 4 - 1 = 3
         * - [9,4,1,7] 最高分和最低分之间的差值是 7 - 4 = 3
         * - [9,4,1,7] 最高分和最低分之间的差值是 7 - 1 = 6
         * 可能的最小差值是 2
         */
        System.out.println(minKScores.minimumDifference(new int[]{9,4,1,7}, 2));
    }
}
