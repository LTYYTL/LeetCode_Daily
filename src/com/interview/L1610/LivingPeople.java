package com.interview.L1610;

import com.util.Difference;

/**
 * 面试题 16.10. 生存人数
 * 给定 N 个人的出生年份和死亡年份，第 i 个人的出生年份为 birth[i]，死亡年份为 death[i]，实现一个方法以计算生存人数最多的年份。
 * 你可以假设所有人都出生于 1900 年至 2000 年（含 1900 和 2000 ）之间。如果一个人在某一年的任意时期处于生存状态，那么他应该被纳入那一年的统计中。
 * 例如，生于 1908 年、死于 1909 年的人应当被列入 1908 年和 1909 年的计数。
 * 如果有多个年份生存人数相同且均为最大值，输出其中最小的年份。
 *
 * 示例：
 * 输入：
 * birth = {1900, 1901, 1950}
 * death = {1948, 1951, 2000}
 * 输出： 1901
 *
 * 提示：
 * 0 < birth.length == death.length <= 10000
 * birth[i] <= death[i]
 */
public class LivingPeople {
    /**
     * 方法：差分数组
     * @param birth
     * @param death
     * @return
     */
    public int maxAliveYear(int[] birth, int[] death) {
        //初始化，1900~2000有101个
        int[] nums = new int[102];
        //构造差分数组
        Difference difference = new Difference(nums);
        //遍历
        for (int i = 0; i < birth.length; i++) {
            // eg:1900年出生的人导致1900年变化人数加1
            int start = birth[i] - 1900;
            // eg:1948年死亡的人导致1949年变化人数减1，但1948年不会
            int end = death[i] - 1900;

            difference.increment(start,end,1);
        }
        //生成结果数组
        int[] res = difference.result();
        //最大人数
        int max = Integer.MIN_VALUE;
        //最大年份
        int year = 0;
        //遍历
        for (int i = 0; i < res.length; i++) {
            //获得最大人数年份，相等时，只留下年份小的
            if (res[i] > max){
                max = res[i];
                year = i + 1900;
            }
        }
        return year;
    }
}
