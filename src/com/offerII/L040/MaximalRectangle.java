package com.offerII.L040;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 剑指 Offer II 040. 矩阵中最大的矩形
 * 给定一个由 0 和 1 组成的矩阵 matrix ，找出只包含 1 的最大矩形，并返回其面积。
 * 注意：此题 matrix 输入格式为一维 01 字符串数组。
 *
 * 示例 1：
 * 输入：matrix = ["10100","10111","11111","10010"]
 * 输出：6
 * 解释：最大矩形如上图所示。
 *
 * 示例 2：
 * 输入：matrix = []
 * 输出：0
 *
 * 示例 3：
 * 输入：matrix = ["0"]
 * 输出：0
 *
 * 示例 4：
 * 输入：matrix = ["1"]
 * 输出：1
 *
 * 示例 5：
 * 输入：matrix = ["00"]
 * 输出：0
 *
 * 提示：
 * rows == matrix.length
 * cols == matrix[0].length
 * 0 <= row, cols <= 200
 * matrix[i][j] 为 '0' 或 '1'
 *
 * 注意：本题与主站 85 题相同（输入参数格式不同）： <a href="https://leetcode-cn.com/problems/maximal-rectangle/">https://leetcode-cn.com/problems/maximal-rectangle/</a>
 */
public class MaximalRectangle {
    /**
     * 方法：单调栈
     * @param matrix
     * @return
     */
    public int maximalRectangle(String[] matrix) {
        int m = matrix.length;
        if (m == 0)
            return 0;
        int area = 0;
        int[] height = new int[matrix[0].length()];
        //转换成直方图问题
        for (String s : matrix) {
            for (int j = 0; j < matrix[0].length(); j++) {
                if (s.charAt(j) == '1')
                    height[j] += 1;
                else
                    height[j] = 0;
            }
            area = Math.max(area, largestRectangleArea(height));
        }

        return area;
    }


    private int largestRectangleArea(int[] heights) {
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
