package com.leetcode.L201_300.L0275;

public class HIndexIITest {
    public static void main(String[] args) {
        HIndexII hIndexII = new HIndexII();
        /* * 示例:
          输入: citations = [0,1,3,5,6]
          输出: 3
          解释: 给定数组表示研究者总共有 5 篇论文，每篇论文相应的被引用了 0, 1, 3, 5, 6 次。
               由于研究者有 3 篇论文每篇至少被引用了 3 次，其余两篇论文每篇被引用不多于 3 次，所以她的 h 指数是 3。
          说明:
          如果 h 有多有种可能的值 ，h 指数是其中最大的那个。
         */
        System.out.println(hIndexII.hIndex(new int[]{0, 1, 3, 5, 6}));
        System.out.println(hIndexII.hIndex_bir(new int[]{0, 1, 3, 5, 6}));
    }
}
