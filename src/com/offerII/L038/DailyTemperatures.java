package com.offerII.L038;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 剑指 Offer II 038. 每日温度
 * 请根据每日 气温 列表 temperatures ，重新生成一个列表，要求其对应位置的输出为：
 * 要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 *
 * 示例 1:
 * 输入: temperatures = [73,74,75,71,69,72,76,73]
 * 输出: [1,1,4,2,1,1,0,0]
 *
 * 示例 2:
 * 输入: temperatures = [30,40,50,60]
 * 输出: [1,1,1,0]
 *
 * 示例 3:
 * 输入: temperatures = [30,60,90]
 * 输出: [1,1,0]
 *
 * 提示：
 * 1 <= temperatures.length <= 105
 * 30 <= temperatures[i] <= 100
 *
 * 注意：本题与主站 739 题相同： <a href="https://leetcode-cn.com/problems/daily-temperatures/">https://leetcode-cn.com/problems/daily-temperatures/</a>
 */
public class DailyTemperatures {
    /**
     * 方法：单调栈
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        //存放索引
        Deque<Integer> stack = new LinkedList<>();
        for (int i = T.length - 1; i >= 0 ; i--) {
            //去除比当前小的温度的索引
            while (!stack.isEmpty() && T[stack.peek()] <= T[i])
                stack.pop();
            //计算距离，没有的时候返回0
            res[i] = stack.isEmpty()? 0 : (stack.peek()-i);
            //放入索引
            stack.push(i);
        }
        return res;
    }
}
