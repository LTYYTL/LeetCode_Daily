package com.leetcode.L801_900.L0830;

public class PositionsLargeGroupsTest {
    public static void main(String[] args) {
        PositionsLargeGroups positionsLargeGroups = new PositionsLargeGroups();
        /**
         * 示例 1：
         * 输入：s = "abbxxxxzzy"
         * 输出：[[3,6]]
         * 解释："xxxx" 是一个起始于 3 且终止于 6 的较大分组。
         */
        System.out.println(positionsLargeGroups.largeGroupPositions("abbxxxxzzy").toString());
        /**
         * 示例 2：
         * 输入：s = "abc"
         * 输出：[]
         * 解释："a","b" 和 "c" 均不是符合要求的较大分组。
         */
        System.out.println(positionsLargeGroups.largeGroupPositions("abc").toString());
        /**
         * 示例 3：
         * 输入：s = "abcdddeeeeaabbbcd"
         * 输出：[[3,5],[6,9],[12,14]]
         * 解释：较大分组为 "ddd", "eeee" 和 "bbb"
         */
        System.out.println(positionsLargeGroups.largeGroupPositions("abcdddeeeeaabbbcd").toString());
        /**
         * 示例 4：
         * 输入：s = "aba"
         * 输出：[]
         */
        System.out.println(positionsLargeGroups.largeGroupPositions("aba").toString());
    }
}
