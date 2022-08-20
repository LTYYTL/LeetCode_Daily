package com.offer.L0630;

/**
 * 剑指 Offer 63. 股票的最大利润
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 *
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 *
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 限制：
 * 0 <= 数组长度 <= 10^5
 *
 * 注意：本题与主站 121 题相同：<a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/">https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/</a>
 */
public class MaximumProfitStock {
    /**
     * 方法一：模拟
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        //最大收益
        int max = 0;
        if (prices.length == 0)
            return max;
        //最小值
        int min = prices[0];
        //遍历
        for (int i = 1; i < prices.length; i++) {
            //当前与最小值的差值是否更大
            if (prices[i] - min > max){
                max = prices[i] - min;
            }else if (prices[i] < min){//判断当前值是否是最小值
                min = prices[i];
            }
        }
        return max;
    }
}
