package com.leetcode.L701_800.L0799;

public class ChampagneTowerTest {
    public static void main(String[] args) {
        ChampagneTower champagneTower = new ChampagneTower();
        /*
          示例 1:
          输入: poured(倾倒香槟总杯数) = 1, query_glass(杯子的位置数) = 1, query_row(行数) = 1
          输出: 0.00000
          解释: 我们在顶层（下标是（0，0））倒了一杯香槟后，没有溢出，因此所有在顶层以下的玻璃杯都是空的。
         */
        System.out.println(champagneTower.champagneTower(1, 1, 1));
        /*
          示例 2:
          输入: poured(倾倒香槟总杯数) = 2, query_glass(杯子的位置数) = 1, query_row(行数) = 1
          输出: 0.50000
          解释: 我们在顶层（下标是（0，0）倒了两杯香槟后，有一杯量的香槟将从顶层溢出，位于（1，0）的玻璃杯和（1，1）的玻璃杯平分了这一杯香槟，所以每个玻璃杯有一半的香槟。
         */
        System.out.println(champagneTower.champagneTower(2, 1, 1));
        /*
          示例 3:
          输入: poured = 100000009, query_row = 33, query_glass = 17
          输出: 1.00000
         */
        System.out.println(champagneTower.champagneTower(100000009, 33, 17));
    }
}
