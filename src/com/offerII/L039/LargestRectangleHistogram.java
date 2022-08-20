package com.offerII.L039;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 剑指 Offer II 039. 直方图最大矩形面积
 * 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 *
 * 示例 1:
 * 输入：heights = [2,1,5,6,2,3]
 * 输出：10
 * 解释：最大的矩形为图中红色区域，面积为 10
 *
 * 示例 2：
 * 输入： heights = [2,4]
 * 输出： 4
 *
 * 提示：
 * 1 <= heights.length <=105
 * 0 <= heights[i] <= 104
 */
public class LargestRectangleHistogram {
    /**
     * 方法：单调栈
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        Deque<Integer> stack = new LinkedList<>();
        int[] newHeight = new int[heights.length + 2];
        //加上哨兵
        System.arraycopy(heights, 0, newHeight, 1, heights.length + 1 - 1);

        for (int i = 0; i < newHeight.length; i++) {
            while (!stack.isEmpty() && newHeight[stack.peek()] > newHeight[i]){
                //栈顶索引
                int cur = stack.pop();
                res = Math.max(res,(i - stack.peek() - 1) * newHeight[cur]);
            }
            //存入索引
            stack.push(i);
        }
        return res;
    }
}
