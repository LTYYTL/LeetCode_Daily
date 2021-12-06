package com.util;

/**
 * 差分数组工具类
 */
public class Difference {
    //差分数组
    private int[] diff;

    /**
     * 构造差分数组
     * @param nums
     */
    public Difference(int[] nums) {
        assert nums.length < 0;
        diff = new int[nums.length];
        //根据初始数组构造差分数组
        diff[0] = nums[0];
        for (int i = 1; i < diff.length; i++) {
            diff[i] = nums[i] - nums[i-1];
        }
    }

    /**
     * 给区间[i,j]增加val
     * @param i
     * @param j
     * @param val
     */
    public void increment(int i, int j, int val){
        diff[i] += val;
        if (j+1 < diff.length){
            diff[j+1] -= val;
        }
    }

    /**
     * 根据差分数组返回结果数组
     * @return
     */
    public int[] result() {
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i-1] + diff[i];
        }
        return res;
    }
}
