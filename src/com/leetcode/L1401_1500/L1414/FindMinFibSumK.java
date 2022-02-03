package com.leetcode.L1401_1500.L1414;

import java.util.ArrayList;
import java.util.List;

/**
 * 1414. 和为 K 的最少斐波那契数字数目
 * 给你数字 k ，请你返回和为 k 的斐波那契数字的最少数目，其中，每个斐波那契数字都可以被使用多次。
 *
 * 斐波那契数字定义为：
 * F1 = 1
 * F2 = 1
 * Fn = Fn-1 + Fn-2 ， 其中 n > 2 。
 * 数据保证对于给定的 k ，一定能找到可行解。
 *
 * 示例 1：
 * 输入：k = 7
 * 输出：2
 * 解释：斐波那契数字为：1，1，2，3，5，8，13，……
 * 对于 k = 7 ，我们可以得到 2 + 5 = 7 。
 *
 * 示例 2：
 * 输入：k = 10
 * 输出：2
 * 解释：对于 k = 10 ，我们可以得到 2 + 8 = 10 。
 *
 * 示例 3：
 * 输入：k = 19
 * 输出：3
 * 解释：对于 k = 19 ，我们可以得到 1 + 5 + 13 = 19 。
 *
 * 提示：
 * 1 <= k <= 10^9
 */
public class FindMinFibSumK {
    /**
     * 方法：贪心算法
     * @param k
     * @return
     */
    public int findMinFibonacciNumbers(int k) {
        //存储斐波那契的数
        List<Integer> list = new ArrayList<>();
        //初始化斐波那契
        int a = 1;
        int b = 1;
        list.add(a);
        list.add(b);

        //计算比k小的所有斐波那契数列
        while (k >= a+b){
            int c = a + b;
            list.add(c);
            a = b;
            b = c;
        }
        //结果
        int res = 0;
        //倒序遍历
        for (int i = list.size() - 1; i >= 0 && k > 0; i--) {
            //获取当前值
            int num = list.get(i);
            //比k小计入
            if (k >= num){
                k -= num;
                res++;
            }
        }
        return res;
    }
}
