package com.leetcode.L1201_1300.L1296;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1296. 划分数组为连续数字的集合
 * 给你一个整数数组 nums 和一个正整数 k，请你判断是否可以把这个数组划分成一些由 k 个连续数字组成的集合。
 * 如果可以，请返回 true；否则，返回 false。
 *
 * 示例 1：
 * 输入：nums = [1,2,3,3,4,4,5,6], k = 4
 * 输出：true
 * 解释：数组可以分成 [1,2,3,4] 和 [3,4,5,6]。
 *
 * 示例 2：
 * 输入：nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
 * 输出：true
 * 解释：数组可以分成 [1,2,3] , [2,3,4] , [3,4,5] 和 [9,10,11]。
 *
 * 示例 3：
 * 输入：nums = [3,3,2,2,1,1], k = 3
 * 输出：true
 *
 * 示例 4：
 * 输入：nums = [1,2,3,4], k = 3
 * 输出：false
 * 解释：数组不能分成几个大小为 3 的子数组。
 *
 * 提示：
 * 1 <= k <= nums.length <= 105
 * 1 <= nums[i] <= 109
 *
 * 注意：此题目与 846 重复：https://leetcode-cn.com/problems/hand-of-straights/
 */
public class DivideArrKConsecutive {
    /**
     * 方法：贪心算法
     * @param nums
     * @param k
     * @return
     */
    public boolean isPossibleDivide(int[] nums, int k) {
        //长度
        int n = nums.length;
        //判断是否能平均分成每个组groupSize个数值
        if (n % k != 0)
            return false;
        //记录每个数出现的次数
        Map<Integer,Integer> map = new HashMap<>();
        //遍历
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //排序
        Arrays.sort(nums);
        //遍历
        for (int i : nums) {
            //是否被使用完
            if (!map.containsKey(i))
                continue;
            //组成有groupSize个的区间
            for (int j = 0; j < k; j++) {
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
