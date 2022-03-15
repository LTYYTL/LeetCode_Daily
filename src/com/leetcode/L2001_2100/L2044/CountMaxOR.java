package com.leetcode.L2001_2100.L2044;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 2044. 统计按位或能得到最大值的子集数目
 * 给你一个整数数组 nums ，请你找出 nums 子集 按位或 可能得到的 最大值 ，并返回按位或能得到最大值的 不同非空子集的数目
 * 如果数组 a 可以由数组 b 删除一些元素（或不删除）得到，则认为数组 a 是数组 b 的一个 子集 。如果选中的元素下标位置不一样，则认为两个子集 不同 。
 * 对数组 a 执行 按位或 ，结果等于 a[0] OR a[1] OR ... OR a[a.length - 1]（下标从 0 开始）。
 *
 * 示例 1：
 * 输入：nums = [3,1]
 * 输出：2
 * 解释：子集按位或能得到的最大值是 3 。有 2 个子集按位或可以得到 3 ：
 * - [3]
 * - [3,1]
 *
 * 示例 2：
 * 输入：nums = [2,2,2]
 * 输出：7
 * 解释：[2,2,2] 的所有非空子集的按位或都可以得到 2 。总共有 23 - 1 = 7 个子集。
 *
 * 示例 3：
 * 输入：nums = [3,2,1,5]
 * 输出：6
 * 解释：子集按位或可能的最大值是 7 。有 6 个子集按位或可以得到 7 ：
 * - [3,5]
 * - [3,1,5]
 * - [3,2,5]
 * - [3,2,1,5]
 * - [2,5]
 * - [2,1,5]
 *
 * 提示：
 * 1 <= nums.length <= 16
 * 1 <= nums[i] <= 105
 */
public class CountMaxOR {
    //或和最大值
    int max = 0;
    //个数
    int res = 0;

    /**
     * 方法：回溯算法
     * @param nums
     * @return
     */
    public int countMaxOrSubsets(int[] nums) {
        //长度
        int n = nums.length;
        //只有一个数字
        if (n == 1)
            return 1;

        //子集路径
        Deque<Integer> path = new LinkedList<>();

        //遍历
        for (int i = 1; i <= n; i++) {
            back(nums,0,path,i,0);
        }

        return res;
    }

    /**
     * 回溯算法
     * @param nums
     * @param begin  开始位置
     * @param path  当前子集
     * @param size  子集内元素个数
     * @param sum  当前或和
     */
    private void back(int[] nums, int begin, Deque<Integer> path, int size,int sum) {
        //子集内元素个数满足条件
        if (path.size() == size){
            //判断最大或和
            if (max == sum){
                res++;
            }else if (max < sum){//改变最大或和，结果置一
                max = sum;
                res = 1;
            }
        }

        //遍历
        for (int i = begin; i < nums.length; i++) {
            //当前元素
            int cur = nums[i];
            //入栈
            path.push(cur);
            //调用回溯算法
            back(nums, i+1, path, size, sum|cur);
            //出栈
            path.pop();
        }
    }
}
