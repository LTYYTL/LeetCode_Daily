package com.leetcode.L301_400.L0370;

import com.util.Difference;

/**
 * 370.区间加法
 */
public class IntervalAddition{
    /**
     * 方法：差分数组
     * @param length
     * @param updates
     * @return
     */
    public int[] getModifiedArray(int length,int[][] updates){
        //初始化数组
        int[] nums = new int[length];
        //构建差分数组工具
        Difference difference = new Difference(nums);
        //遍历
        for (int[] update : updates) {
            //区间
            int i = update[0];
            int j = update[1];
            //值
            int val = update[2];
            //改变区间值
            difference.increment(i,j,val);
        }
        //返回结果数组
        return difference.result();
    }
}
