package com.leetcode.L901_1000.L0901;

public class StockSpannerTest {
    public static void main(String[] args) {
        /*
          示例：
          输入：["StockSpanner","next","next","next","next","next","next","next"], [[],[100],[80],[60],[70],[60],[75],[85]]
          输出：[null,1,1,1,2,1,4,6]
          解释：
          首先，初始化 S = StockSpanner()，然后：
          S.next(100) 被调用并返回 1，
          S.next(80) 被调用并返回 1，
          S.next(60) 被调用并返回 1，
          S.next(70) 被调用并返回 2，
          S.next(60) 被调用并返回 1，
          S.next(75) 被调用并返回 4，
          S.next(85) 被调用并返回 6。
          注意 (例如) S.next(75) 返回 4，因为截至今天的最后 4 个价格
          (包括今天的价格 75) 小于或等于今天的价格。
         */
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println(stockSpanner.next(100));
        System.out.println(stockSpanner.next(80));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(70));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(75));
        System.out.println(stockSpanner.next(85));
    }
}
