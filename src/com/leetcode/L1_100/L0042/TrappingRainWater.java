package com.leetcode.L1_100.L0042;

import java.util.Stack;

/**
 * 42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 * 示例 1：
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 *
 * 示例 2：
 * 输入：height = [4,2,0,3,2,5]
 * 输出：9
 *
 * 提示：
 * n == height.length
 * 1 <= n <= 2 * 104
 * 0 <= height[i] <= 105
 */
public class TrappingRainWater {
    /**
     * 方法：单调栈
     * @param height
     * @return
     */
    public int trap(int[] height) {
        //结果集
        int res = 0;
        //单调栈
        Stack<Integer> stack = new Stack<>();
        //遍历
        for (int i = 0; i < height.length; i++) {
            //当栈顶墙比当前墙矮时
            while (!stack.isEmpty() && height[stack.peek()] < height[i]){
                //获取栈顶墙
                int cur = stack.pop();
                //左墙没有的情况
                if (stack.isEmpty())
                    break;
                //宽度：两个高墙的索引差
                int w = i - stack.peek() - 1;
                //高度：两个墙中矮的那个并且减去，两墙之间墙的高度
                int h = Math.min(height[i],height[stack.peek()]) - height[cur];
                res += w * h;
            }
            //将当前墙入栈
            stack.push(i);
        }
        return res;
    }

    /**
     * 方法二：双指针
     * @param height
     * @return
     */
    public int trap_two(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) {
                ans += leftMax - height[left];
                ++left;
            } else {
                ans += rightMax - height[right];
                --right;
            }
        }
        return ans;
    }
}
