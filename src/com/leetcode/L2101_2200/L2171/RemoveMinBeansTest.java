package com.leetcode.L2101_2200.L2171;

public class RemoveMinBeansTest {
    public static void main(String[] args) {
        RemoveMinBeans removeMinBeans = new RemoveMinBeans();
        /** *
         * 示例 1：
         * 输入：beans = [4,1,6,5]
         * 输出：4
         * 解释：
         * - 我们从有 1 个魔法豆的袋子中拿出 1 颗魔法豆。
         *   剩下袋子中魔法豆的数目为：[4,0,6,5]
         * - 然后我们从有 6 个魔法豆的袋子中拿出 2 个魔法豆。
         *   剩下袋子中魔法豆的数目为：[4,0,4,5]
         * - 然后我们从有 5 个魔法豆的袋子中拿出 1 个魔法豆。
         *   剩下袋子中魔法豆的数目为：[4,0,4,4]
         * 总共拿出了 1 + 2 + 1 = 4 个魔法豆，剩下非空袋子中魔法豆的数目相等。
         * 没有比取出 4 个魔法豆更少的方案。
         */
        System.out.println(removeMinBeans.minimumRemoval(new int[]{4, 1, 6, 5}));
        /**
         * 示例 2：
         * 输入：beans = [2,10,3,2]
         * 输出：7
         * 解释：
         * - 我们从有 2 个魔法豆的其中一个袋子中拿出 2 个魔法豆。
         *   剩下袋子中魔法豆的数目为：[0,10,3,2]
         * - 然后我们从另一个有 2 个魔法豆的袋子中拿出 2 个魔法豆。
         *   剩下袋子中魔法豆的数目为：[0,10,3,0]
         * - 然后我们从有 3 个魔法豆的袋子中拿出 3 个魔法豆。
         *   剩下袋子中魔法豆的数目为：[0,10,0,0]
         * 总共拿出了 2 + 2 + 3 = 7 个魔法豆，剩下非空袋子中魔法豆的数目相等。
         * 没有比取出 7 个魔法豆更少的方案。
         */
        System.out.println(removeMinBeans.minimumRemoval(new int[]{2, 10, 3, 2}));
    }
}
