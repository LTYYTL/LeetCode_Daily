package com.offer.L0460;

/**
 * 剑指 Offer 46. 把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
 * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *
 * 示例 1:
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 *
 * 提示：
 * 0 <= num < 231
 */
public class TranslateNumbersIntoStrings {
    /**
     * 方法:动态规划
     * @param num
     * @return
     */
    public int translateNum(int num) {
        //转换成字符串
        String s = String.valueOf(num);
        //记录次数
        int[] dp = new int[s.length()+1];
        //dp[0] = dp[1] = 1 ，即 “无数字” 和 “第 1 位数字” 的翻译方法数量均为 1
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= s.length(); i++) {
            //当前位与前一位组成的数字
            String temp = s.substring(i-2,i);
            //在10~25之间的情况
            if (temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0){
                dp[i] = dp[i-1] + dp[i-2];
            }else {
                dp[i] = dp[i-1];
            }
        }
        return dp[s.length()];
    }
}
