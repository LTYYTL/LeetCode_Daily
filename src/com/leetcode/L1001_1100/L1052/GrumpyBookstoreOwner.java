package com.leetcode.L1001_1100.L1052;

/**
 * 1052. 爱生气的书店老板
 * 今天，书店老板有一家店打算试营业 customers.length 分钟。每分钟都有一些顾客（customers[i]）会进入书店，所有这些顾客都会在那一分钟结束后离开。
 * 在某些时候，书店老板会生气。 如果书店老板在第 i 分钟生气，那么 grumpy[i] = 1，否则 grumpy[i] = 0。 当书店老板生气时，那一分钟的顾客就会不满意，不生气则他们是满意的。
 * 书店老板知道一个秘密技巧，能抑制自己的情绪，可以让自己连续 X 分钟不生气，但却只能使用一次。
 * 请你返回这一天营业下来，最多有多少客户能够感到满意的数量。
 *
 * 示例：
 * 输入：customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], X = 3
 * 输出：16
 * 解释：
 * 书店老板在最后 3 分钟保持冷静。
 * 感到满意的最大客户数量 = 1 + 1 + 1 + 1 + 7 + 5 = 16.
 *
 * 提示：
 * 1 <= X <= customers.length == grumpy.length <= 20000
 * 0 <= customers[i] <= 1000
 * 0 <= grumpy[i] <= 1
 */
public class GrumpyBookstoreOwner {
    /**
     * 方法：滑动窗口
     * @param customers
     * @param grumpy
     * @param X
     * @return
     */
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        //窗口和
        int winsum = 0;
        //右区间和
        int rightsum = 0;
        int len = customers.length;
        //计算有右区间和
        for (int i = X; i < len; ++i){
            if (grumpy[i] == 0)
                rightsum += customers[i];
        }
        //计算窗口和
        for (int i = 0; i <X; ++i){
            winsum += customers[i];
        }

        //左区间和
        int leftsum = 0;
        //窗口左边边界
        int left = 1;
        //窗口右边界
        int right = X;
        //最大和
        int maxCount = leftsum +rightsum + winsum;

        while (right < len){
            //重新计算左区间的值
            if (grumpy[left - 1] == 0){
                leftsum += customers[left - 1];
            }
            //重新计算右区间的值
            if (grumpy[right] == 0){
                rightsum -= customers[right];
            }
            //窗口值
            winsum = winsum - customers[left - 1] + customers[right];
            //保留最大值
            maxCount = Math.max(maxCount,winsum + leftsum + rightsum);
            //移动窗口
            left++;
            right++;
        }
        return maxCount;
    }
}
