package com.leetcode.L801_900.L0846;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 846. 一手顺子
 * Alice 手中有一把牌，她想要重新排列这些牌，分成若干组，使每一组的牌数都是 groupSize ，并且由 groupSize 张连续的牌组成。
 * 给你一个整数数组 hand 其中 hand[i] 是写在第 i 张牌，和一个整数 groupSize 。如果她可能重新排列这些牌，返回 true ；否则，返回 false 。
 *
 * 示例 1：
 * 输入：hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
 * 输出：true
 * 解释：Alice 手中的牌可以被重新排列为 [1,2,3]，[2,3,4]，[6,7,8]。
 *
 * 示例 2：
 * 输入：hand = [1,2,3,4,5], groupSize = 4
 * 输出：false
 * 解释：Alice 手中的牌无法被重新排列成几个大小为 4 的组。
 *
 * 提示：
 * 1 <= hand.length <= 104
 * 0 <= hand[i] <= 109
 * 1 <= groupSize <= hand.length
 *
 * 注意：此题目与 1296 重复：https://leetcode-cn.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
 */
public class HandStraights {
    /**
     * 方法：贪心算法
     * @param hand
     * @param groupSize
     * @return
     */
    public boolean isNStraightHand(int[] hand, int groupSize) {
        //长度
        int n = hand.length;
        //判断是否能平均分成每个组groupSize个数值
        if (n % groupSize != 0)
            return false;
        //记录每个数出现的次数
        Map<Integer,Integer> map = new HashMap<>();
        //遍历
        for (int num : hand) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //排序
        Arrays.sort(hand);
        //遍历
        for (int i : hand) {
            //是否被使用完
            if (!map.containsKey(i))
                continue;
            //组成有groupSize个的区间
            for (int j = 0; j < groupSize; j++) {
                //连续下一个值
                int next = i + j;
                //是否存在下一个值
                if (!map.containsKey(next))
                    return false;
                //存在，就减去此数值的出现次数
                map.put(next,map.getOrDefault(next,0)-1);
                //已经用光数值，直接移除
                if (map.get(next) == 0)
                    map.remove(next);
            }
        }
        return true;
    }
}
