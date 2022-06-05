package com.leetcode.L401_500.L0473;

import java.util.Arrays;

/**
 * 473. 火柴拼正方形
 * 你将得到一个整数数组 matchsticks ，其中 matchsticks[i] 是第 i 个火柴棒的长度。
 * 你要用 所有的火柴棍 拼成一个正方形。你 不能折断 任何一根火柴棒，但你可以把它们连在一起，而且每根火柴棒必须 使用一次 。
 * <p>
 * 如果你能使这个正方形，则返回 true ，否则返回 false 。
 * <p>
 * 示例 1:
 * 输入: matchsticks = [1,1,2,2,2]
 * 输出: true
 * 解释: 能拼成一个边长为2的正方形，每边两根火柴。
 * <p>
 * 示例 2:
 * 输入: matchsticks = [3,3,3,3,4]
 * 输出: false
 * 解释: 不能用所有火柴拼成一个正方形。
 * <p>
 * 提示:
 * 1 <= matchsticks.length <= 15
 * 1 <= matchsticks[i] <= 108
 */
public class MatchsticksSquare {
    /**
     * 方法：回溯算法
     *
     * @param matchsticks
     * @return
     */
    public boolean makesquare(int[] matchsticks) {
        //计算和
        int sum = Arrays.stream(matchsticks).sum();
        //不是4的倍数
        if (sum % 4 != 0)
            return false;
        //排序
        Arrays.sort(matchsticks);
        //从大到小排列
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }

        //4个边
        int[] edges = new int[4];
        //回溯
        return back(0, matchsticks, edges, sum / 4);
    }

    private boolean back(int index, int[] matchsticks, int[] edges, int length) {
        //回溯结束条件
        if (index == matchsticks.length)
            return true;
        //遍历边
        for (int i = 0; i < edges.length; i++) {
            //增加边长
            edges[i] += matchsticks[index];
            //判断是否超过长度
            if (edges[i] <= length && back(index + 1, matchsticks, edges, length))
                return true;
            //回退
            edges[i] -= matchsticks[index];
        }

        return false;
    }
}
