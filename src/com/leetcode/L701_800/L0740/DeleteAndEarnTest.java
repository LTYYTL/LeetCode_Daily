package com.leetcode.L701_800.L0740;

public class DeleteAndEarnTest {
    public static void main(String[] args) {
        DeleteAndEarn deleteAndEarn = new DeleteAndEarn();
        /*** 示例 1：
         * 输入：nums = [3,4,2]
         * 输出：6
         * 解释：
         * 删除 4 获得 4 个点数，因此 3 也被删除。
         * 之后，删除 2 获得 2 个点数。总共获得 6 个点数。
         */
        System.out.println(deleteAndEarn.deleteAndEarn(new int[]{3, 4, 2}));
        /**
         * 示例 2：
         * 输入：nums = [2,2,3,3,3,4]
         * 输出：9
         * 解释：
         * 删除 3 获得 3 个点数，接着要删除两个 2 和 4 。
         * 之后，再次删除 3 获得 3 个点数，再次删除 3 获得 3 个点数。
         * 总共获得 9 个点数。
         */
        System.out.println(deleteAndEarn.deleteAndEarn(new int[]{2,2,3,3,3,4}));
    }
}
