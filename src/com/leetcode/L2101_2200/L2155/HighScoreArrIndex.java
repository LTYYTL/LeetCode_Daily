package com.leetcode.L2101_2200.L2155;

import java.util.ArrayList;
import java.util.List;

/**
 * 2155. 分组得分最高的所有下标
 * 给你一个下标从 0 开始的二进制数组 nums ，数组长度为 n 。nums 可以按下标 i（ 0 <= i <= n ）拆分成两个数组（可能为空）：numsleft 和 numsright 。
 *
 * （1）numsleft 包含 nums 中从下标 0 到 i - 1 的所有元素（包括 0 和 i - 1 ），而 numsright 包含 nums 中从下标 i 到 n - 1 的所有元素（包括 i 和 n - 1 ）。
 * （2）如果 i == 0 ，numsleft 为 空 ，而 numsright 将包含 nums 中的所有元素。
 * （3）如果 i == n ，numsleft 将包含 nums 中的所有元素，而 numsright 为 空 。
 * 下标 i 的 分组得分 为 numsleft 中 0 的个数和 numsright 中 1 的个数之 和 。
 *
 * 返回 分组得分 最高 的 所有不同下标 。你可以按 任意顺序 返回答案。
 *
 * 示例 1：
 * 输入：nums = [0,0,1,0]
 * 输出：[2,4]
 * 解释：按下标分组
 * - 0 ：numsleft 为 [] 。numsright 为 [0,0,1,0] 。得分为 0 + 1 = 1 。
 * - 1 ：numsleft 为 [0] 。numsright 为 [0,1,0] 。得分为 1 + 1 = 2 。
 * - 2 ：numsleft 为 [0,0] 。numsright 为 [1,0] 。得分为 2 + 1 = 3 。
 * - 3 ：numsleft 为 [0,0,1] 。numsright 为 [0] 。得分为 2 + 0 = 2 。
 * - 4 ：numsleft 为 [0,0,1,0] 。numsright 为 [] 。得分为 3 + 0 = 3 。
 * 下标 2 和 4 都可以得到最高的分组得分 3 。
 * 注意，答案 [4,2] 也被视为正确答案。
 *
 * 示例 2：
 * 输入：nums = [0,0,0]
 * 输出：[3]
 * 解释：按下标分组
 * - 0 ：numsleft 为 [] 。numsright 为 [0,0,0] 。得分为 0 + 0 = 0 。
 * - 1 ：numsleft 为 [0] 。numsright 为 [0,0] 。得分为 1 + 0 = 1 。
 * - 2 ：numsleft 为 [0,0] 。numsright 为 [0] 。得分为 2 + 0 = 2 。
 * - 3 ：numsleft 为 [0,0,0] 。numsright 为 [] 。得分为 3 + 0 = 3 。
 * 只有下标 3 可以得到最高的分组得分 3 。
 *
 * 示例 3：
 * 输入：nums = [1,1]
 * 输出：[0]
 * 解释：按下标分组
 * - 0 ：numsleft 为 [] 。numsright 为 [1,1] 。得分为 0 + 2 = 2 。
 * - 1 ：numsleft 为 [1] 。numsright 为 [1] 。得分为 0 + 1 = 1 。
 * - 2 ：numsleft 为 [1,1] 。numsright 为 [] 。得分为 0 + 0 = 0 。
 * 只有下标 0 可以得到最高的分组得分 2 。
 *
 * 提示：
 * n == nums.length
 * 1 <= n <= 105
 * nums[i] 为 0 或 1
 */
public class HighScoreArrIndex {
    /**
     * 方法：前缀和
     * @param nums
     * @return
     */
    public List<Integer> maxScoreIndices(int[] nums) {
        //长度
        int n = nums.length;
        //前缀和（0~i之间1的个数）
        int[] prev = new int[n+1];
        //遍历
        for(int i = 1; i<= n; ++i){
            //计算前缀和
            prev[i] =prev[i-1] + nums[i-1];
        }

        //结果集
        List<Integer> list = new ArrayList<>();
        //最大值
        int max = 0;
        //遍历
        for (int i = 0; i < prev.length; i++) {
            //左边包含0的个数
            int left = i - prev[i] - prev[1];
            //右边包含1的个数
            int right = prev[n] - prev[i];
            //判断是否超过最大值
            if (max < left + right){
                //清空集合
                list.clear();
                //记录最大值
                max = left + right;
            }
            //最大值的索引加入集合
            if (max == left + right)
                list.add(i);
        }
        return list;
    }
}
