package com.leetcode.L0714;

/**
 * 714. 买卖股票的最佳时机含手续费
 * 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
 * 你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 * 返回获得利润的最大值。
 *
 * 注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。
 *
 * 示例 1:
 * 输入: prices = [1, 3, 2, 8, 4, 9], fee = 2
 * 输出: 8
 * 解释: 能够达到的最大利润:
 * 在此处买入 prices[0] = 1
 * 在此处卖出 prices[3] = 8
 * 在此处买入 prices[4] = 4
 * 在此处卖出 prices[5] = 9
 * 总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
 *
 * 注意:
 * 0 < prices.length <= 50000.
 * 0 < prices[i] < 50000.
 * 0 <= fee < 50000.
 */
public class StockWithFee {
    /**
     * 方法：贪心算法
     * 1、如果当前的股票价格 prices[i] 加上手续费 fee 小于buy，那么与其使用 buy 的价格购买股票，我们不如以 prices[i]+fee 的价格购买股票，因此我们将 buy 更新为 prices[i]+fee；
     * 2、如果当前的股票价格 prices[i] 大于 buy，那么我们直接卖出股票并且获得prices[i]−buy 的收益。
     *  但实际上，我们此时卖出股票可能并不是全局最优的（例如下一天股票价格继续上升），因此我们可以提供一个反悔操作，
     *  看成当前手上拥有一支买入价格为 prices[i] 的股票，将 buy 更新为 \prices[i]。这样一来，如果下一天股票价格继续上升，我们会获得 prices[i+1]−prices[i] 的收益，
     *  加上这一天 prices[i]−buy 的收益，恰好就等于在这一天不进行任何操作，而在下一天卖出股票的收益；
     * 3、对于其余的情况，prices[i] 落在区间 [buy−fee,buy] 内，它的价格没有低到我们放弃手上的股票去选择它，也没有高到我们可以通过卖出获得收益，因此我们不进行任何操作。
     * @param prices
     * @param fee
     * @return
     */
    public int maxProfit(int[] prices, int fee) {
        int buy = prices[0] + fee;
        int res = 0;
        for (int i = 1; i < prices.length; ++i){
            int temp = prices[i] ;
            if (temp + fee < buy){
                buy = temp + fee;
            }else if (temp > buy){
                res += temp - buy;
                buy = temp;
            }
        }
        return res;
    }
}
