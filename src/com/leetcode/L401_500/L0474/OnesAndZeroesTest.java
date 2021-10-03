package com.leetcode.L401_500.L0474;

public class OnesAndZeroesTest {
    public static void main(String[] args) {
        OnesAndZeroes onesAndZeroes = new OnesAndZeroes();
        /*** 示例 1：
         * 输入：strs = ["10", "0001", "111001", "1", "0"], m = 5, n = 3
         * 输出：4
         * 解释：最多有 5 个 0 和 3 个 1 的最大子集是 {"10","0001","1","0"} ，因此答案是 4 。
         * 其他满足题意但较小的子集包括 {"0001","1"} 和 {"10","1","0"} 。{"111001"} 不满足题意，因为它含 4 个 1 ，大于 n 的值 3 。
         */
        System.out.println(onesAndZeroes.findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 5, 3));
        /**
         * 示例 2：
         * 输入：strs = ["10", "0", "1"], m = 1, n = 1
         * 输出：2
         * 解释：最大的子集是 {"0", "1"} ，所以答案是 2 。
         */
        System.out.println(onesAndZeroes.findMaxForm(new String[]{"10", "0", "1"}, 1, 1));
    }
}
