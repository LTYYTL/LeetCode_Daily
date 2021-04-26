package com.leetcode.L0503;

import java.util.Arrays;
import java.util.Stack;

/**
 * 503. 下一个更大元素 II
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
 * 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。
 * 如果不存在，则输出 -1。
 *
 * 示例 1:
 * 输入: [1,2,1]
 * 输出: [2,-1,2]
 * 解释: 第一个 1 的下一个更大的数是 2；
 * 数字 2 找不到下一个更大的数；
 * 第二个 1 的下一个最大的数需要循环搜索，结果也是 2。
 *
 * 注意: 输入数组的长度不会超过 10000。
 */
public class NextGreaterElementII {
    /**
     * 方法：栈
     * @param nums
     * @return
     */
    public int[] nextGreaterElements(int[] nums) {
        //数组长度
        int n = nums.length;
        //结果数组
        int[] res = new int[n];
        //填充-1
        Arrays.fill(res,-1);
        Stack<Integer> stack = new Stack<>();
        //遍历两遍
        for (int i = 0; i < 2 * n - 1; i++) {
            while (!stack.isEmpty() && nums[i%n] > nums[stack.peek()]){
                res[stack.pop()] = nums[i%n];
            }
            //记录下标
            stack.push(i%n);
        }

        return res;
    }
}
