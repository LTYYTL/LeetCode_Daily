package com.leetcode.L201_300.L0274;

public class HIndexTest {
    public static void main(String[] args) {
        HIndex hIndex = new HIndex();
        /**
         * 示例：
         * 输入：citations = [3,0,6,1,5]
         * 输出：3
         * 解释：给定数组表示研究者总共有 5 篇论文，每篇论文相应的被引用了 3, 0, 6, 1, 5 次。
         *      由于研究者有 3 篇论文每篇 至少 被引用了 3 次，其余两篇论文每篇被引用 不多于 3 次，所以她的 h 指数是 3。
         */
        System.out.println(hIndex.hIndex(new int[]{3, 0, 6, 1, 5}));
        System.out.println(hIndex.hIndex_sort(new int[]{3, 0, 6, 1, 5}));
    }
}
