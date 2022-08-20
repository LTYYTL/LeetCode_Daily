package com.leetcode.L2001_2100.L2028;

import java.util.Arrays;

public class FindMissingObservationsTest {
    public static void main(String[] args) {
        FindMissingObservations findMissingObservations = new FindMissingObservations();
        /*
          示例 1：
          输入：rolls = [3,2,4,3], mean = 4, n = 2
          输出：[6,6]
          解释：所有 n + m 次投掷的平均值是 (3 + 2 + 4 + 3 + 6 + 6) / 6 = 4 。
         */
        System.out.println(Arrays.toString(findMissingObservations.missingRolls(new int[]{4, 5, 6, 2, 3, 6, 5, 4, 6, 4, 5, 1, 6, 3, 1, 4, 5, 5, 3, 2, 3, 5, 3, 2, 1, 5, 4, 3, 5, 1, 5}, 4, 40)));
        /*
          示例 2：
          输入：rolls = [1,5,6], mean = 3, n = 4
          输出：[2,3,2,2]
          解释：所有 n + m 次投掷的平均值是 (1 + 5 + 6 + 2 + 3 + 2 + 2) / 7 = 3 。
         */
        System.out.println(Arrays.toString(findMissingObservations.missingRolls(new int[]{1, 5, 6}, 3, 4)));
        /*
          示例 3：
          输入：rolls = [1,2,3,4], mean = 6, n = 4
          输出：[]
          解释：无论丢失的 4 次数据是什么，平均值都不可能是 6 。
         */
        System.out.println(Arrays.toString(findMissingObservations.missingRolls(new int[]{1, 2, 3, 4}, 64, 4)));
        /*
          示例 4：
          输入：rolls = [1], mean = 3, n = 1
          输出：[5]
          解释：所有 n + m 次投掷的平均值是 (1 + 5) / 2 = 3 。
         */
        System.out.println(Arrays.toString(findMissingObservations.missingRolls(new int[]{1}, 3, 1)));

    }
}
