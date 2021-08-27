package com.offer.L0572;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 57 - II. 和为s的连续正数序列
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 * 示例 1：
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 *
 * 示例 2：
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 *
 * 限制：
 *
 * 1 <= target <= 10^5
 */
public class SequenceNumbersWithS {
    /**
     * 方法：滑动窗口
     * @param target
     * @return
     */
    public int[][] findContinuousSequence(int target) {
        //窗口左边界
        int left = 1;
        //窗口右边界
        int right = 1;
        //结果集
        List<int[]> res = new ArrayList<>();
        //和
        int sum = 0;
        while (left <= target/2){
            //当和小于目标值时，窗口扩大
            if (sum < target){
                //记录和
                sum +=right;
                //右边界左移
                right++;
            }else if (sum > target){//当和大于目标值时，窗口缩小
                //减去出窗口值
                sum -= left;
                //左边界左移
                left++;
            }else {//满足目标值，记录，窗口缩小
                int[] temp = new int[right-left];
                for (int i = left; i < right; i++){
                    temp[i-left] = i;
                }
                res.add(temp);
                //减去出窗口值
                sum -= left;
                //左边界左移
                left++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
