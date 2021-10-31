package com.offerII.L079;

public class SubsetsTest {
    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        /**
         * 示例 1：
         * 输入：nums = [1,2,3]
         * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
         */
        System.out.println(subsets.subsets(new int[]{1, 2, 3}));
        /**
         * 示例 2：
         * 输入：nums = [0]
         * 输出：[[],[0]]
         */
        System.out.println(subsets.subsets(new int[]{0}));
    }
}
