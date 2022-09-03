package com.leetcode.L601_700.L0646;

public class MaxPairChainTest {
    public static void main(String[] args) {
        MaxPairChain maxPairChain = new MaxPairChain();
        /*
          示例：
          输入：[[1,2], [2,3], [3,4]]
          输出：2
          解释：最长的数对链是 [1,2] -> [3,4]
         */
        System.out.println(maxPairChain.findLongestChain(new int[][]{{1, 2}, {2, 3}, {3, 4}}));
    }
}
